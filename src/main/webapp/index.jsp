<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Login:</h1>
<form action="/login" method="post">
    <div>
        <label for="username">username</label>
        <input type="text" id="username" name="username">
    </div>
    <div>
        <label for="password">password</label>
        <input type="text" id="password" name="password">
    </div>
    <input type="submit" value="Login">
</form>
</body>
</html>
