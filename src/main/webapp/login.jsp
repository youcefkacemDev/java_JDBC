<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login page</title>
		<link rel="stylesheet" href="style.css">
	</head>
	<body>
		<div class="center">
			<h1>Login Page</h1>
		</div>
		<div class="center">
			<form action="LoginServlet" method="post">
				<div>
					<h2>Enter your E-mail</h2>
				</div>
				<div>
					<input class="input" type="text" name="email" required placeholder="E-mail">
				</div>
				<div>
					<h2>Enter your password</h2>
				</div>
				<div>
					<input class="input" type="password" name="password" required placeholder="Password">
				</div>
				<div>
					<input class="input3" type="submit" value="login">
					<input class="input2" type="reset">
				</div>
			</form>
		</div>
		
	</body>
</html>