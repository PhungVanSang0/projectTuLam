<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <h1>${message}</h1>
    <form:form action="/staff/form" method="post" modelAttribute="staff">
        Name: <form:input path="name" /> <br>
        Age: <form:input path="age" /> <br>
        Address: <form:input path="address" /> <br />
        Position: <form:radiobuttons path="position" items="${positions}"/> <br>
        Hobby<form:checkboxes path="hobies" items="${hobies}"/> <br>
        Country:
        <form:select path="country.id">
            <form:options items="${countries}" itemLabel="name" itemValue="id"/>
        </form:select>
        <br>
        <form:button>Save</form:button>
    </form:form>
</body>
</html>