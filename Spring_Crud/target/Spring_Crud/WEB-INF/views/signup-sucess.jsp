<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${message}
<h3 align="center">User Related Data</h3>

First Name+Last Name=${userData.firstName} ${userData.lastName}

<hr>
Email   ${userData.email}
<hr>
Password ${userData.password}

</body>
</html>	