<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" >
</head>
<body>
<div id="div1" style="margin-top: 10%">
   <form action="" method="post" style="width:50%; margin-left: auto; margin-right:auto;">
   <h3>Login</h3>
  <div class="form-group">
    <label for="exampleInputUser">User name</label>
    <input type="text" class="form-control" id="exampleInputUser" aria-describedby="userHelp" placeholder="Enter user name"> 
  </div>
  
  <div class="form-group">
    <label for="exampleInputPassword">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword" placeholder="Password">
  </div>
  
  <div class="form-group form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button style="width:40%" type="submit" class="btn btn-primary">Submit</button>
<hr>
<div class="form-group">
<h3>Register here</h3>
<small id="emailHelp" class="form-text text-muted">if your not register yet</small>
    <a style="width:30% " class="btn btn-outline-primary" href="register" role="button">Click here</a>
  </div>
</form>
</div>
</body>
</html>