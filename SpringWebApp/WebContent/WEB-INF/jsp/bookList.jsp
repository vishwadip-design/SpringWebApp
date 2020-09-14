<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the bookshop</title>
</head>
<body>
<h1>welcome to BookReader shop</h1>
<table border="1">
<tr>
<th align="left">Publisher name</th>
<th align="left">Book name</th>
<th align="left">Prize</th>
</tr>
<c:forEach items="${bookList }" var="book">
<tr>
	<td>${book.publisher.publisherName}</td>
	<td>${book.bookName}</td>
	<td>${book.prize}</td>
</tr>
</c:forEach>
</table>
</body>
</html>