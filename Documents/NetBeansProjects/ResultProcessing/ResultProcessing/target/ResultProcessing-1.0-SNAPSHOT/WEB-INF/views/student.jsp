<%-- 
    Document   : student
    Created on : Jul 31, 2017, Jul 31, 2017 7:27:41 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Page</title>
    </head>
    <body>
        <h1>Add Student</h1>
        <form action="savestudent" method="POST">
            <P>Name:<input type="text" name="sname" placeholder="Enter your  name"/></P>
            <p> Address 1:<input type="text" name="address1" placeholder="enter your primary address"/></p>
            <p> Address 2:<input type="text" name="address2" placeholder="enter your secondary address"/></p>
            <P>Date of Birth:<input type="date" name="date" placeholder="enter your date of birth"</p>
            <p>Phone:<input type="text" name="phone" placeholder="enter your phone number"/></p>
            <p><input type="submit" value="Add student"/></p>
            
            
        </form>
    </body>
</html>
