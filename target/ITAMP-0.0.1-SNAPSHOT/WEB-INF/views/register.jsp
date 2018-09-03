<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" >
</head>
<body>
<div id="div1" style="margin-top: 5%">
   <form action="save-user" method="post"  style="width:50%; margin-left: auto; margin-right:auto;">
   <h3>Register</h3>
  <div class="form-group">
   <input type="hidden" value="${user.id}" class="form-control" id="exampleInputId" aria-describedby="userHelp" />
    <label for="exampleInputUser">User name</label>
    <input type="text" value="${user.username}" class="form-control" id="exampleInputUser" aria-describedby="userHelp" placeholder="Enter user name"/>
  </div>
   <div class="form-group">
    <label for="exampleInputUserfirst">First name</label>
    <input type="text" value="${user.firstname}" class="form-control" id="exampleInputUserfirst" aria-describedby="userHelp" placeholder="Enter first name"> 
  </div>
   <div class="form-group">
    <label for="exampleInputUserlast">Last name</label>
    <input type="text" value="${user.lastname}" class="form-control" id="exampleInputUserlast" aria-describedby="userHelp" placeholder="Enter last name"> 
  </div>
  <div class="form-group">
    <label for="exampleInputPassword">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword" placeholder="Password">
  </div>
   <div class="form-group">
    <label for="exampleInputConfirmed">Confirmed password</label>
    <input type="password" value="${user.password}" class="form-control" id="exampleInputConfirmed" aria-describedby="userHelp" placeholder="Enter password"> 
  </div>
  
  <button style="width:40%" type="submit" class="btn btn-primary">Submit</button>
  </form>
  </div>
</body>
</html>