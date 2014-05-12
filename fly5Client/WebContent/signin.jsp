<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">

<title>Fly5</title>

<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/signin.css" rel="stylesheet">
</head>
<body>
<div class="container">
		<h2 class="title">Fly5 Airlines</h2>
		<div class="form-div">
		
			<form name="signin-form" class="form-signin" action="/fly5Client/TravellerController" method="post">
			<input type="hidden" name = "action" value = "Traveller-signin.do">
			<%if(request.getAttribute("massege")!=null){%>
			<%=request.getAttribute("massege") %>		<%} %>
				<fieldset>
					<legend>Sign In</legend>
					<div class="has-error">
					<label class="control-label">${error}</label></div>
					<input type="text" class="form-control" name="email" placeholder="Email address" required autofocus> 
					<input type="password"class="form-control" name="password" placeholder="Password" required> 
					<labelclass="checkbox"> 
					<input type="checkbox"value="remember-me"> Remember me
					</label>
					<button class="btn btn-lg btn-primary btn-block" type="submit">Signin</button>
				</fieldset>
			    <span class="help-block">New to Fly5? <a href="signup.jsp">Sign Up</a></span>
			</form>
		</div>
	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
</body>
</html>