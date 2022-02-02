<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>POST HTML Form</title>
</head>
<body>
<form action="save" method="post">
    <label>
        username&nbsp;:&nbsp;
        <input type="text" name="username"/>
    </label>
    <label>
        age&nbsp;:&nbsp;
        <input type="text" name="age"/>
    </label>
    <button type="submit">전송</button>
</form>
</body>
</html>