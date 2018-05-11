<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/Login.css"/>
</head>
<body>
	<div class="login-page">
		<div class="form">
			<form class="login-form" action="login">
				<input type="text" name="userName"/> 
				<input type="password" name="password" />
				<input type="checkbox" name="checkbox" style="width: 10%;margin-left: -28%;" />Login with admin account
				<input type="submit" class="button" name="btnLogin" value="Login" /> 
				<p class="message">
					Not registered? <a href="#">Create an account</a>S
				</p>
				<a style="text-align: center;color: red;"><s:property value="message"/></a>
			</form>
		</div>
	</div>
</body>
</html>