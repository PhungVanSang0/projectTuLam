<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm giảng viên</title>
</head>
<body>

<form action="/giang-vien/create" method="post">
    ID: <input type="text" name="id"/>
    <br/>
    Mã: <input type="text" name="ma"/>
    <br/>
    Tên: <input type="text" name="ten" />
    <br/>
    Tuổi: <input type="text" name="tuoi" />
    <br/>
    Địa chỉ: <input type="text" name="diaChi" />
    <br/>
    Giới tính:
    <input type="radio" name="gioiTinh" checked value="true" />Nam
    <input type="radio" name="gioiTinh" value="false"/>Nữ
    <br/>
    <button type="submit">Add</button>
</form>
</body>
</html>
