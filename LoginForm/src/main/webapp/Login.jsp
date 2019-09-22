<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

  		<!--  Boostrap 3 
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>--> 
<title>Login</title>

<style type="text/css">
.login_page {
	border: 1px solid grey;
	margin: auto;
	width: 50%;
	margin-top: 20%;
	padding-bottom : 60px;
	border-radius: 5px;
	
}
</style>
</head>
<body>
	<div class="container">
		<div class="container-fluid login_page">
			<h1 style="text-align: center">Login</h1>

			<form action="save" method="post">
				<div class="form-group">
					<label>Username</label> <input type="text" name="userName" class="form-control">
				</div>

				<div class="form-group">
					<label>Password</label> <input type="password" name="password" class="form-control">
				</div>
					  <input type="submit" value="Login" class="btn btn-primary float-right">
			</form>
		</div>
	</div>
</body>
</html>