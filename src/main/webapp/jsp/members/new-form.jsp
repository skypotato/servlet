<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="UTF-8">
    <title>POST HTML Form</title>
</head>
<body>
<form action="/jsp/members/save.jsp" method="post">
    <label> username:
        <input type="text" name="username"/>
    </label>
    <label> age:
        <input type="text" name="age"/>
    </label>
    <button type="submit">전송</button>
</form>
</body>
</html>