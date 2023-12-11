<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>sign up page</title>
		<link rel="stylesheet" href="style.css">
	</head>
	<body>
		<div class="center">
			<h1>Sign Up Page</h1>
		</div>
		<div class="center">
			<form action="SignupServlet" method="post">
				<div>
					<h2>Enter your FirstName</h2>
				</div>
				<div>
					<input class="input" type="text" name="firstname" required placeholder="FirstName">
				</div>
				<div>
					<h2>Enter your LastName</h2>
				</div>
				<div>
					<input class="input" type="text" name="lastname" required placeholder="LastName">
				</div>
				<div>
					<h2>Enter your Address</h2>
				</div>
				<div>
					<input class="input" type="text" name="address" required placeholder="Address">
				</div>
				<div>
					<h2>Select your country</h2>
				</div>
				<div>
					<select class="input" name="country" required>
						<option>Algeria
						<option>Egypt
						<option>Tunisia
						<option>Morocco
						<option>Libya
						<option>Mauritania
					</select>
				</div>
				<div>
					<h2>Select your gender</h2>
				</div>
				<div>
					<input type="radio" name="gender" required value="man">Man
					<input type="radio" name="gender" required value="woman">Woman
				</div>
				<div>
					<h2>Select your skills</h2>
				</div>
				<div class="check">
					<div><input type="checkbox" name="html" value="html"><b>html</b></div>
					<div><input type="checkbox" name="css" value="css"><b>css</b></div>
					<div><input type="checkbox" name="javaScript" value="javaScript"><b>javaScript</b></div>
					<div><input type="checkbox" name="java" value="java"><b>java</b></div>
					<div><input type="checkbox" name="kotlin" value="kotlin"><b>kotlin</b></div>
					<div><input type="checkbox" name="php" value="php"><b>php</b></div>
				</div>
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
					<input class="input3" type="submit" value="sign up">
					<input class="input2" type="reset">
				</div>
			</form>
		</div>
	</body>
</html>