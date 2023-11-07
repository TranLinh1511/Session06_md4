<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 07/11/2023
  Time: 1:47 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>
<div>
    <form action="register" method="POST">
        <label for="fname">User Name</label>
        <input type="text" id="fname" name="userName" placeholder="User Name..">

        <label for="lname">Email</label>
        <input type="email" id="lname" name="lastname" placeholder="Your Email..">

        <label for="password">Password</label>
        <input type="password" id="password" name="password" placeholder="Your Password..">

        <button type="submit">Đăng ký</button>
    </form>
</div>

</body>
</html>



