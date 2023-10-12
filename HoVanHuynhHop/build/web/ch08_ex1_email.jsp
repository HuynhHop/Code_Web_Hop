<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/survey.css" type="text/css"/>
</head>
<body>
    <h1>Join our email list</h1>
    <p>To join our email list, enter your name and
       email address below.</p>
    <p><i>${message}</i></p>
    <jsp:useBean id="user" scope="session" class="murach.business.User_ch05_ex1"/>    
    <form action="ch0801" method="post">
        <input type="hidden" name="action" value="add">        
        <label class="pad_top">Email:</label>
        <input type="email" name="email" 
               value="<jsp:getProperty name="user" property="email"/>"><br>
        <label class="pad_top">First Name:</label>
        <input type="text" name="firstName" 
               value="<jsp:getProperty name="user" property="firstName"/>"><br>
        <label class="pad_top">Last Name:</label>
        <input type="text" name="lastName" 
               value="<jsp:getProperty name="user" property="lastName"/>"><br>        
        <label>&nbsp;</label>
        <input type="submit" value="Join Now" class="margin_left">
    </form>
    <a href="index.html">
            <button type="button"> Back to Home</button>
    </a>
     <footer>
               <p>&copy; Copyright Mike Murach &amp; Associates</p>
     </footer>
</body>
</html>