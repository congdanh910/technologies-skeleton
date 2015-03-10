<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<form action="<c:url value='/j_spring_security_check'/>" method="post">
	    <h1>Login Form</h1>
    	<span>Fill out the form below to login to my super awesome imaginary control panel.</span> <br />
    	<c:if test="${error}">
    		<span style="color: red;">Login error, please try again!!!</span> <br />
    	</c:if>
		<input name="j_username" type="text" class="input username" placeholder="Username" /> <br />
    	<input name="j_password" type="password" class="input password" placeholder="Password" /> <br />
    	<input type="submit" name="submit" value="Login" />
	</form>
</body>
</html>