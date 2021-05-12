<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GadgetBadget REST Jersey RiWA</title>
<link rel="stylesheet" href="Views/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="Views/main_form_styles.css">
<script src="Components/jquery-3.2.1.min.js"></script>
<script src="Components/auth.js"></script>
</head>
<body>


		<nav class="navbar navbar-inverse">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <a class="navbar-brand" href="index.jsp">GadgetBadget GUI</a>
		    </div>
		    <ul class="nav navbar-nav">
		      <li class=""><a href="index.jsp">Researcher Management</a></li>   
		    </ul>
		  </div>
		</nav>
	
	



		<div class="container">
			<div class="row">
				<div class="col-6">
					<h1 id="h1_header">Login</h1>
					
					<form id="formLogin">
						 Enter Username: 
						 <input id="txtUsername" name="txtUsername" type="text" 
						 class="form-control form-control-sm">
						 Enter Password: 
						 <input id="txtPassword" name="txtPassword" type="password" 
						 class="form-control form-control-sm">
						 <br>
						 <input id="btnLogin" name="btnLogin" type="button" value="Login" 
						 class="btn btn-primary">
						 <br>
						 <br>
						 <div id="alertError" class="alert alert-danger"></div>
					</form>
				 </div>
				 <div class="col-6">
				 	<img src="https://mindlercareerlibrarynew.imgix.net/1G-Computer_ScienceCsIT_Software_Engineering.png" width="550px">
				 </div>
			</div>
		</div>
</body>
</html>