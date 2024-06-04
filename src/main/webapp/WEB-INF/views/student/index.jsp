<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Dashboard</title>
</head>
<body>
<table>
    <form action="/student/detail">
        MSSV: <input name="mssv"/>
        <button type="submit">Search</button>
    </form>
    <br/>
    <button><a href="create">Add Student</a></button>
    <tbody>
    <tr>
        <th>STT</th>
        <th>MSSV</th>
        <th>Name</th>
        <th>Age</th>
        <th>Address</th>
        <th>Sex</th>
        <th colspan="2">Action</th>
    </tr>

        <c:forEach items="${list}" var="st" varStatus="i">
    <tr>
            <td>${i.index + 1}</td>
            <td>${st.id}</td>
            <td>${st.name}</td>
            <td>${st.age}</td>
            <td>${st.address}</td>
            <td>${st.gender ==true?"Nam":"Nu"}</td>
            <td><a href="/student/update?id=${st.id}">Sua</a></td>
            <td><a href="/student/delete?id=${st.id}">Xoa</a></td>

    <tr>
        </c:forEach>

    </tr>
    </tbody>
    </thead>
    <tbody>
    </tbody>
</table>
</body>
</html>
