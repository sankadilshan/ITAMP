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
<div id="div1" style="margin-top: 25%">
<div style="margin-left:auto; margin-right:5%;">

 </div>
   <form action="login-user"  method="post" style="width:27%; margin-left: auto; margin-right:5%;">
  
     <h3>Login</h3>
      <p style="color:red;">${success }
 ${loginerror }</p>
  <div class="form-group">
    <label for="exampleInputUser">User name</label>
    <input type="text" class="form-control" id="username" name="username"  aria-describedby="userHelp" placeholder="Enter user name"> 
  </div>
  
  <div class="form-group">
    <label for="exampleInputPassword">Password</label>
    <input type="password" class="form-control" id="passowrd" name="password"  placeholder="Password">
  </div>
  <button style="width:40%" type="submit" class="btn btn-secondary">Login</button>
   <button style="width:40%" type="reset" class="btn btn-secondary">Clear</button>
<hr>
<div class="form-group">
    <a style="width:40% " class="btn btn-outline-secondary" href="register" role="button">Register</a>
  </div>
</form>
</div>
</body>
</html>