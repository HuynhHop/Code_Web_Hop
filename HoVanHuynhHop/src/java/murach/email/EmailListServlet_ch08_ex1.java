package murach.email;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import murach.business.User_ch05_ex1;
import murach.data.UserDB;
import murach.data.UserIO;

@WebServlet("/ch0801")
public class EmailListServlet_ch08_ex1 extends HttpServlet
{    
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        String url = "/ch08_ex1_email.jsp";
        
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
            url = "/ch08_ex1_email.jsp";    // the "join" page
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
                message = "Please fill out all four text boxes.";
                url = "/ch08_ex1_email.jsp";
            } 
            else {
                message = "";               
                UserDB.insert(user);
                url = "/thanks_ch08_ex1.jsp";
            }
            session.setAttribute("user", user);
            session.setAttribute("message", message);
        }
        Date currentDate = new Date();
        request.setAttribute("currentDate", currentDate);

        // create users list and store it in the session
        String path = getServletContext().getRealPath("/WEB-INF/EmailList.txt");
        ArrayList<User_ch05_ex1> users = UserIO.getUsers(path);
        session.setAttribute("users", users);
        
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