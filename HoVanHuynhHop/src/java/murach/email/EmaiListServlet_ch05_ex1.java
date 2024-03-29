package murach.email;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import murach.business.User_ch05_ex1;
//import murach.data.UserDB;
@WebServlet("/email0501")
public class EmaiListServlet_ch05_ex1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/ch05_ex1_email.jsp";
        
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
            url = "/ch05_ex1_email.jsp";    // the "join" page
        } 
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
                                  
            
            // store data in User object
            User_ch05_ex1 user = new User_ch05_ex1(firstName, lastName, email);

            // validate the parameters
            String message;
            if (firstName == null || lastName == null || email == null ||
                firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()) {
                message = "Please fill out all three text boxes.";
                url = "/ch05_ex1_email.jsp";
            } 
            else {
                message = "";
                url = "/thanks_ch05_ex1.jsp";
                //UserDB.insert(user);
            }
            request.setAttribute("user", user);
            request.setAttribute("message", message);
        }
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