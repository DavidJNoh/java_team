<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Player</title>
</head>
<body>
	<form method="post", action= "/Team/Players">
		First Name:
		<input type = "text" name = "first_name"/>
		Last Name:
		<input type = "text" name = "last_name"/>
		Age:
		<input type = "text" name = "age">
	    <button>Add</button>	
	</form>
</body>
</html>