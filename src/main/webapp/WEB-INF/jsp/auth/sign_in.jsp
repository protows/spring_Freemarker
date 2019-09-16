<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Sign up</title>
</head>
<body>	
	<form action="/spring_security/login/process" method="post">
        <div>
            Email: <input name="email" type="email">
        </div>
        <div>
            Password: <input name="password" type="password">
        </div>
        <input type="submit">
    </form>
       ${error ? "Bad credentials - some text when true" : ""}
    
	
	
</body>
</html>
