<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@page import="model.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="demo.jsp">
User Name : <input type="text" name="uname"><br>
User Pass : <input type="text" name="upass"><br>
User Salary : <input type="text" name="usalary"><br>
<input type="submit" value="Register"><br>
</form>

<table>
<tr><th>ID</th><th>NAME</th><th>PASSWORD</th><th>SALARY</th></tr>
<%

List<User> ul= UserDao.getAllUser();

for(User u:ul)
{
%>

<tr><td><%=u.getUid() %></td><td><%=u.getUname() %></td><td><%=u.getUpass() %></td><td><%=u.getSalary() %></td></tr>

<%
} 
%>
</table>



</body>
</html>