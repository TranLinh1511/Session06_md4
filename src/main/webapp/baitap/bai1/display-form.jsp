<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 07/11/2023
  Time: 2:40 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/discountservlet" method="post">
    <label>Product Description</label>
    <input type="text" name="description">
    <label>Listed Price</label>
    <input type="text" name="listedPrice">
    <label>Discount Percent</label>
    <input type="text" name="discountPercent">
    <button type="submit">Calculate</button>
</form>
</body>
</html>
