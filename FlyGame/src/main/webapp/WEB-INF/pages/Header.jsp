<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="entity.Account"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page import="java.util.Map"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="js/header.js"></script>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<style type="text/css">
	ul {
		list-style-type: none;
		margin: 0;
		padding: 0;
		overflow: hidden;
		background-color: #f7941d;
	}

	li {
		float: left;
	}

	li a{
		display: block;
		color: white;
		text-align: center;
		padding: 10px 16px;
		text-decoration: none;
		cursor: pointer;
	}
	li a:hover:not(.active){
		background-color:#f47025;
	}
	a:hover {
		background-color: #f4f4f4; 
	}
	a{
		cursor: pointer;
	}
</style>
</head>
<body>
	<div style="float: left;">
				<img src="images/logo.jpg">
			</div>
			<div style="float: right;font-size: 21px;margin-left: -100px; margin-top: 2%">
				<div style="color: #a19393;margin-bottom: 1%;">
					<span style="float:left;">
						<form action="viewProfile" id="profile">
							<a style="cursor: pointer;" onclick="viewProfile()" id="studentID"> <%= ((Account) session.getAttribute("user")).getStudentID() %> </a>| 
							<input type="hidden" name="studentID" value="<%= ((Account) session.getAttribute("user")).getStudentID() %>" />
						</form>
					</span>
					<span style="float:right;">
						<form action="logout" id="logout">
							<a style="cursor: pointer;" onclick="logout()">Logout</a>
						</form>
					</span>
				</div>
				<div style="margin-left: -1000px">
					<ul style="display: inline;list-style: none;float: right;">
						<li><a>Announcement & news</a></li>
						<li><a>Timetable</a></li>
						<li><span>
							<form action="viewCourse" id="viewCourse">
								<a onclick="viewCourse()">View Course</a>
							</form>
						</span></li>
						<li><span>
							<form action="register" id="register">
								<a onclick="register()">Register online</a>
							</form>
						</span></li>
					</ul>
				</div>
			</div>
</body>
</html>