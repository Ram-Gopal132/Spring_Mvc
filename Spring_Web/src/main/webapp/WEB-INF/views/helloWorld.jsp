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

<form:form method="post" action="processForm" modelAttribute="customer">
<pre>

		First Name <form:input path="firstName"/>
		Last Name <form:input path="lastName"/>
				  <form:errors path="lastName"/>
				  
		Free Passes<form:input path="freePasses"/>
			<form:errors path="freePasses"/>
			
		Email<form:input path="email"/>
			<form:errors path="email"/>
			
		Pin Code<form:input path="pincode"/>
			<form:errors path="pincode"/>
					
					<input type="submit" value="Submit">
</pre>



</form:form>

</body>
</html>