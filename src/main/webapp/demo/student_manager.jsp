<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 07/11/2023
  Time: 11:04 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        #customers {
            font-family: Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        #customers td, #customers th {
            border: 1px solid #ddd;
            padding: 8px;
        }

        #customers tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        #customers tr:hover {
            background-color: #ddd;
        }

        #customers th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #04AA6D;
            color: white;
        }
    </style>
</head>
<body>

<h1>A Fancy Table</h1>

<table id="customers">
    <tr>
        <th>Student Code</th>
        <th>Student Name</th>
        <th>Age</th>
        <th>Sex</th>
    </tr>
    <c:forEach items="${students}" var="student">
        <tr>
            <td>${student.studentId}</td>
            <td>${student.fullName}</td>
            <td>${student.age}</td>
            <td>${student.sex ? "Nam" : "Nữ"}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>


