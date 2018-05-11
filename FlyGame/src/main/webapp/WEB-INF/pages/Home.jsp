<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Home</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="js/Home.js"></script>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
</head>
<body>
<!-- header -->
	<div class="row">
		<div class="col-sm-1"></div>
		<div class="col-sm-10" style="margin-top: 1%;">
			<jsp:include page="Header.jsp"></jsp:include>
		</div>
	</div>
	
<!-- body -->	
	<div class="row">
		<div class="col-sm-1"></div>
		<div class="col-sm-10" style="min-height: 420px;background-color: #f4f4f4;margin-top: 2%">
		</div>
	</div>
<!-- footer -->	
	<div class="row">
		<div class="col-sm-1"></div>
		<div class="col-sm-10">
			<hr>
			<jsp:include page="Footer.jsp"></jsp:include>
		</div>
	</div>
</body>
</html>