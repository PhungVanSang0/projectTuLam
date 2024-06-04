<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<table>
    <form action="/giang-vien/detail">
        MSSV: <input name="id"/>
        <button type="submit">Search</button>
    </form>
    <br/>
    <button><a href="create">Add</a></button>
    <button><a href="searchGiangVienNu">Giang vien nu</a></button>
    <tbody>
    <tr>
        <th>ID</th>
        <th>Mã</th>
        <th>Tên</th>
        <th>Tuổi</th>
        <th>Địa chỉ</th>
        <th>Giới tính</th>
        <th colspan="3">Action</th>
    </tr>

        <c:forEach items="${list}" var="st" varStatus="i">
    <tr>
        <td>${st.id}</td>
        <td>${st.ma}</td>
        <td>${st.ten}</td>
        <td>${st.tuoi}</td>
        <td>${st.diaChi}</td>
        <td>${st.gioiTinh ==true?"Nam":"Nu"}</td>
        <td><a href="/giang-vien/update?id=${st.id}">Edit</a></td>
        <td><a href="/giang-vien/delete?id=${st.id}">Remove</a></td>
        <td><a href="/giang-vien/detail?id=${st.id}">Deatail</a></td>

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