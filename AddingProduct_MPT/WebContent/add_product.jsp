<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri ="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="addproduct" method="post" modelAttribute="pro">
Id:<f:input path="id"/><br/> <br/>
Name:<f:input path="name"/><br/><br/>
Price:<f:input path="price"/><br/><br/>
Brand:<f:input path="brand"/><br/><br/>
Category:<f:input path="category"/><br/><br/>
<input type="submit" value="Add"/>
</f:form>
</body>
</html>