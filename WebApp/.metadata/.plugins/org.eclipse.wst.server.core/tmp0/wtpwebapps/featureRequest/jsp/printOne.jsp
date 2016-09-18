<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= session.getAttribute("title") %>
<%= session.getAttribute("descript") %>
<%= session.getAttribute("client") %>
<%= session.getAttribute("clientPrior") %>
<%= session.getAttribute("targetDate") %>
<%= session.getAttribute("productArea") %>
</body>
</html>