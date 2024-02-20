<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp</title>
</head>
<body>

<form:form method="post" action="saveSign" modelAttribute="user">
<pre>

<form:label path="firstName" for="firstName">First Name</form:label><form:input path="firstName"/><br>
<form:label path="lastName" for="lastName">Last Name</form:label><form:input path="lastName"/><br>
<form:label path="email" for="email">Email</form:label><form:input path="email"/><br>
<form:label path="password" for="password">Password</form:label><form:input path="password"/><br>

<form:button>Submit</form:button>

</pre>



</form:form>

</body>
</html>