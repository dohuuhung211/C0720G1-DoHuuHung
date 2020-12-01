<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/24/2020
  Time: 3:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form action="/create" modelAttribute="student" method="post">
        <form:input type="number" path="id"/>
        <form:input type="text" path="name"/>
        <form:input type="date" path="dateOfBirth"/>
        <input type="submit" value="Save">
    </form:form>
</body>
</html>
