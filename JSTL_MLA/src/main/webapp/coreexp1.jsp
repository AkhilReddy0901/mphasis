<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import ="java.util.List" %>
    <%@page import ="java.util.Arrays" %>
    
     <%@ taglib uri="jakarta.tags.core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>JSTL Core Tags</h1>
<c:forEach var ="a" begin = "1" end ="10">
<c:out value ="${a}"></c:out>
</c:forEach>
<%
List<String> listNames = Arrays.asList("Rohit","Virat","SKY","Dhone","HP");
%>
<c:forEach items ="${listNames"} var ="names">

<ul>
<c:out value ="${names }"></c:out><br>
</ul>
</c:forEach>






</body>
</html>