<%-- 
    Document   : Login
    Created on : Oct 13, 2020, 8:58:10 PM
    Author     : GuideKai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Debt Hunter | Log in</title>
    </head>
    <body>
        <form action="Main" method="POST">
        <p>E-mail  <input type="email" name="email" value="${email}" /> </p>
        <p>Password  <input type="password" name="password" value="${password}" /> </p>
        <input type="submit" name="Log in" />  
        <p><a href="Register"> Sign up</a></p>
        <p>${message}</p>
<!--        <p>${1}</p>
        <p>${2}</p>
        <p>${3}</p>
        <p>${4}</p>
        <p>${5}</p>-->
        </form>
    </body>
</html>
