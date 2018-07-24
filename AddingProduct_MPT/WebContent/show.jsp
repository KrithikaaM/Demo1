<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>

<tr>
<th>ID</th>
<th>Name</th>
<th>Price</th>
<th>Model</th>
<th>Category</th>
</tr>
<a:forEach items="${pros}" var="pro">
<tr>
<td>${pro.id}</td>
<td>${pro.name}</td>
<td>${pro.price}</td>
<td>${pro.brand}</td>
<td>${pro.category}</td>
</tr>
</a:forEach>
</table>
</body>
</html>