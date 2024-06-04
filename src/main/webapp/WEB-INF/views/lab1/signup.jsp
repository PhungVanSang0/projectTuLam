<!doctype html>
<html lang="en">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta charset="UTF-8">
    <meta name="viewport"
content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h1>Đăng ký</h1>
<div>${message}</div>
<form method="POST" action="/lab1/signup">
    <div>Tên</div>
    <input type="text" name="name">
    <div>Tuổi</div>
    <input type="text" name="age">
    <div>Địa chỉ</div>
    <input type="text" name="address">
    <div>
        <button>Register</button>
    </div>
</form>
</body>
</html>