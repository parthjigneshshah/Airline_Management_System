<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/user.css">
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<title>Fly5 Airlines</title>
</head>
<body>
	<div class="container">
		<header class="header">
			<h1>Fly5 Airlines</h1>
		</header>
		<section class="user-section">
			<div class="top-nav">
				<div>
					Results
				</div>
				<div>
					Passenger Info
				</div>
				<div class="top-nav-active">
					Payment
				</div>
				<div>Confirmation</div>
			</div>
			<div class="has-error">
				<label class="control-label">${error}</label>
			</div>
			<div class="payment">
			    <form method="post" action="/fly5Client/JourneyServlet" class="payment-form">
			    <input type="hidden" name="action" value="insertPaymentDetails">
			    	<label class="control-label">Payment Details</label>
			    	<input class="form-control" placeholder="Credit Card Number" name="ccno">
			    	<input class="form-control" placeholder="CVV" name="cvv">
			    	<input class="form-control" placeholder="Expiry Date" name="expiry">
			    	<a role="button" class="btn btn-default" href="passenger-info.jsp">Back</a>
					<button type="submit" class="btn btn-primary">Book</button>
			    </form>
			</div>
		</section>
	</div>
	<script type="text/javascript" src="js/bootstrap.js"></script>
</body>
</html>