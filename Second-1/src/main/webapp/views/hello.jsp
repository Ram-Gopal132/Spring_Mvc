<%@page import="com.app.model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
 
 <%@page isELIgnored="false" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	List<User> message=(List<User>)request.getAttribute("users");

for(User user:message)
	{
	
		out.println(user);
		out.println("<hr>");
	}

%>


</body>
</html>