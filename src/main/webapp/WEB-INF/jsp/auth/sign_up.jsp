<html>
<head>
    <title>Sign up</title>
</head>
<body>
    <form action="/spring_security/users/new" method="post">
    	<input name="name" type="text" placeholder="name"/>
        <input name="surname" type="text" placeholder="surname"/>
        <input name="email" type="email" placeholder="email"/>
        <input name="password" type="password" placeholder="password"/>
        <input type="submit">
    </form>
</body>
</html>