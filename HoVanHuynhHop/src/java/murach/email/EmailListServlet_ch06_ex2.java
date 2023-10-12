package murach.email;

import java.io.*;
//import java.util.ArrayList;
//import java.util.Date;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import murach.business.User;
//import murach.data.UserDB;
//import murach.data.UserIO;
@WebServlet("/ch0602")

public class EmailListServlet_ch06_ex2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        //HttpSession session = request.getSession();
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String url = "/ch06_ex2_survey.jsp";
        
        // get current action
        String action = request.getParameter("action");
        
        // print action value to console AND log file
        System.out.println("EmailListServlet action: " + action);
        log("action=" + action);
        
        // set default action
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/ch06.jsp";    // the "join" page
        } 
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String date = request.getParameter("DoB");
            String know = request.getParameter("heardFrom");
            String wantsUpdates = request.getParameter("wantsUpdates");
            String notice = request.getParameter("contactVia");    
            
            if (wantsUpdates == null || wantsUpdates.isEmpty() )
            {
                wantsUpdates = "No update";
                notice= "You don't need to contact with us";
            }
            // store data in User object
            User user = new User(firstName, lastName, email,date,know,wantsUpdates,notice);
            // validate the parameters
            String message;
            if (firstName == null || lastName == null || email == null || date==null ||
                firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || date.isEmpty()) {
                message = "Please fill out all four text boxes.";
                url = "/ch06.jsp";
            } 
            else {
                message = "";
                url = "/thanks_ch06_ex2.jsp";
                //UserDB.insert(user);
            }
            request.setAttribute("user", user);
            request.setAttribute("message", message);
        }
//        Date currentDate = new Date();
//        request.setAttribute("currentDate", currentDate);
//
//        // create users list and store it in the session
//        String path = getServletContext().getRealPath("/WEB-INF/EmailList.txt");
//        ArrayList<User> users = UserIO.getUsers(path);
//        session.setAttribute("users", users);
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}