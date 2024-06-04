<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sửa thông tin</title>
</head>
<body>

<form action="/student/update" method="post">
    ID: <input type="text" name="id" value="${student.id}"/>
    <br/>
    Name: <input type="text" name="name" value="${student.name}"/>
    <br/>
    Age: <input type="text" name="age" value="${student.age}"/>
    <br/>
    Address: <input type="text" name="address" value="${student.address}"/>
    <br/>
    Sex:
    <input type="radio" name="gender" value="true" ${student.gender?"checked":""}/>Nam
    <input type="radio" name="gender" value="false" ${!student.gender?"checked":""}/>Nữ
    <br/>
    <button>Update</button>
</form>

</body>
</html>
