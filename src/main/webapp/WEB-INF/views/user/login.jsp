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
<h1>Login</h1>
<div>${message}</div>
<form method="POST" action="/user/login">
    <div>Username:</div>
    <input type="text" name="username">
    <div>Passowrd: </div>
    <input type="text" name="password">
    <div>
        <button>login</button>
    </div>
</form>
</body>
</html>