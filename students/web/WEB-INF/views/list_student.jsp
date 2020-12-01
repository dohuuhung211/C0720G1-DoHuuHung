<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/24/2020
  Time: 3:54 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>List Students</title>
</head>
<body>
    <a href="/create">Add new Student</a>
    <table border="1" cellspacing="2">
        <tr>
            <th>ID</th>
            <th>Ten</th>
            <th>Date of birth</th>
            <th>Action</th>
        </tr>
        <c:forEach var="student" items="${studentList}">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.dateOfBirth}</td>
                <td><a href="/detail?id=${student.id}">Detail</a></td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>
