<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">
<title>Fly5 - New Customer</title>
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/signin.css" rel="stylesheet">
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
<script type="text/javascript"
	src="js/jQuery 1.7.2.js"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
</head>
<body>
<div class="container">
		<h2 class="title">Fly5 Airlines</h2>
		<div>
	
		</div>
			<form class="form-signin" action="/fly5Client/TravellerController" method="post">
			<input type = "hidden" name = "action" value = "add">
				<fieldset>
					<legend>Sign Up</legend>
					<div class="has-error">
					<label class="control-label">${error}</label>
					<%if(request.getAttribute("massege")!=null){%>
			<%=request.getAttribute("massege") %>		<%} %>
					</div>	
					<input type="text" class="form-control" name="fname" placeholder="First Name"
						required autofocus><input type="text" class="form-control" name="lname" placeholder="Last Name"
						required autofocus><input type="date" class="form-control" id="dob" name="dob" placeholder="Date of Birth" required autofocus><input type="text" class="form-control" name="street" placeholder="Street"
						required autofocus><input type="text" class="form-control" name="city" placeholder="City"
						required autofocus><input type="text" class="form-control" name="state" placeholder="State"
						required autofocus><input type="text" class="form-control" name="zip" placeholder="Zip"
						required autofocus><input type="text" class="form-control" name="email" placeholder="Email"
						required autofocus><input type="password"
						class="form-control" name="password" placeholder="Password" required>
						
					<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
						Up</button>
						
							<script>
								$(function() {
									$("#dob").datepicker();
								});
								</script>
				</fieldset>
			</form>
		</div>
</body>
</html>