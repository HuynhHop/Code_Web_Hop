<%-- 
    Document   : index
    Created on : Oct 4, 2023, 4:02:52 PM
    Author     : Huynh Hop
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
        <meta charset="UTF-8">
        <title>Murach's Java Servlets and JSP</title>
        <link rel="stylesheet" href="styles/survey.css">
    </head>
    <body>
        <img src="images/hello.jpg" alt="logo" />
        <h1>Survey</h1>
        <p>If you have a moment, we'd appreciate it if you would fill out this survey.</p>
        <p><i>${message}</i></p>
        <h2>Your information:</h2>
         <form action="email0601" method="post">
             <input type="hidden" name="action" value="add">
            
            <label>First Name</label>
            <input type="text" name="firstName" value="${user.firstName}"><br>
            <label>Last Name</label>
            <input type="text" name="lastName" value="${user.lastName}"><br>
            <label>Email</label>
            <input type="email" name="email" value="${user.email}"><br>
        <input type="submit" value="Join Now" class="margin_left">
        </form>
            <footer>
               <p>&copy; Copyright Mike Murach &amp; Associates</p>
            </footer>
    </body>
</html>
