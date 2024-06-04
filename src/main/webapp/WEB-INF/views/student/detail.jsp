
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
    <title>Chi tiết sinh viên</title>
</head>
<body>
    ID:</p>
    <br/>
    Name: <span th:text="${student.name}"></span></p>
    <br/>
    Age: <span th:text="${student.age}"></span></p>
    <br/>
    Address: <span th:text="${student.address}"></span></p>
    <br/>
    Sex: <span th:text="${student.gender}"></span></p>
</body>
</html>
