<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 07/11/2023
  Time: 3:00 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
    • Product Description: Mô tả của sản phẩm
    • List Price: Giá niêm yết của sản phẩm
    • Discount Percent: Tỷ lệ chiết khấu (phần trăm)
--%>
<div style="align-items: center">
    <h3>Product Description</h3>
    <p>${des}</p>
    <h3>List Price</h3>
    <p>${listedPrice}</p>
    <h3>Discount Percent</h3>
    <p>${discountPercent}</p>
    <h3>Discount Amount</h3>
    <p>${listedPrice * discountPercent * 0.01}</p>
    <h3>Discount Price</h3>
    <p>${(listedPrice * discountPercent * 0.01) + listedPrice}</p>
</div>
</body>
</html>
