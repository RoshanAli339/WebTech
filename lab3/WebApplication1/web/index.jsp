<%-- 
    Document   : index
    Created on : 01-Jul-2023, 9:41:34 pm
    Author     : Roshan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>User Login</h1>
        <form method="POST" action="./Validation">
            <label>Username: </label>
            <input type="text" name="username">
            <br /><br />
            <label>Password: </label>
            <input type="password" name="passwd">
            <br /><br />
            <input type="submit" value="Log in">
            <input type="reset" value="Clear">
        </form>
    </body>
</html>
