<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%@ page language="java" import="javax.servlet.jsp.el.*" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.time.LocalDate" %>
<!DOCTYPE html>
<html>
    <head>
            <meta charset="utf-8">
            <title>Murach's Java Servlets and JSP</title>
            <link rel="stylesheet" href="styles/survey.css" type="text/css"/>
    </head>
    <body>
        <%  
            GregorianCalendar currentDate = new GregorianCalendar();
            int currentYear = currentDate.get(Calendar.YEAR);
        %>
        <p>&copy; Copyright <%= currentYear %> Mike Murach &amp; Associates</p>
    </body>
</html>