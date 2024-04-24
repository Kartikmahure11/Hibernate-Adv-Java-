 <%@page import="model.UserDao"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
User u=new User(request.getParameter("uname"),request.getParameter("upass"),Double.parseDouble(request.getParameter("usalary")));
UserDao.save(u);
%>

Data Inserted! 
<a href="index.jsp">Go Back</a>
</body>
</html>