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
    <form action="test" method="post">
        <input type="hidden" name="action" value="add">              
        <label>First Name</label>
        <input type="text" name="firstName" value="${user.firstName}"><br>
        <label>Last Name</label>
        <input type="text" name="lastName" value="${user.lastName}"><br>
        <label>Email</label>
        <input type="email" name="email" value="${user.email}"><br>
        <input type="submit" value="Join Now" class="margin_left">
    </form>
    <a href="index.html">
            <button type="button"> Back to Home</button>
    </a>       
</body>
</html>