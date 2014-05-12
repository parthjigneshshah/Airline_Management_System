<%@page import="edu.sjsu.fly5.pojos.FlightInstance"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/user.css">
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<title>Fly5 Airlines</title>
</head>
<body>
	<div class="container">
		<header class="header">
			<h1>Fly5 Airlines</h1>
		</header>
		<section class="user-section">
			<div class="top-nav">
				<div class="top-nav-active">Results</div>
				<div>Passenger Info</div>
				<div>Payment</div>
				<div>Confirmation</div>
			</div>
			<div class="has-error">
				<label class="control-label">${error}</label>
			</div>
			<!-- view reservation -->

			<%FlightInstance[] flights = (FlightInstance[])request.getAttribute("search-results"); 
			   if (flights.length > 0) { %>
			   <div class="view-results"> 
				  <%  for (int i=0; i<flights.length;i++) {
					   FlightInstance flight =  flights[i];
			%>
				<div class="row">
					<div class="col-md-2 results-top">Depart</div>
					<div class="col-md-2 results-top">Duration</div>
					<div class="col-md-2 results-top">Arrival</div>
					<div class="col-md-2 results-top">Available Seats</div>
					<div class="col-md-2 results-top">Price ($)</div>
					<div class="col-md-2 results-top">Details</div>
				</div>
				<div class="row results-item">
					<a href="passenger-info.jsp?sch=<%=i%>">Select</a>
					<div class="col-md-2"><%=flight.getDepartuteTime() %></div>
					<div class="col-md-2"><%=flight.getJourneyTime() %></div>
					<div class="col-md-2"><%=flight.getArrivalTime() %></div>
					<div class="col-md-2"><%=flight.getAvailableTickets() %></div>
					<div class="col-md-2"><%=flight.getAdultFare() %></div>
					<div class="col-md-2">
						<a class="btn glyphicon glyphicon-arrow-down" href="#"
							onclick="expand('#rslt<%=i%>');"></a>
					</div>
				</div>
				<hr>
				<div id="rslt<%=i%>" class="collapse-group">
					<div class="collapse expander">
						<p>Flight #: <%=flight.getFlight_no() %></p>
						<p>Source: <%=flight.getSource() %> </p>
						<p>Destination: <%=flight.getDestination() %></p>
						<p>Distance: <%=flight.getDistance() %></p>
					</div>
				</div>
				<%} %>
			</div>
			<%} else { %>
			    <div class="has-info">
			       <label>No Flights found for the search criteria.</label>
			    </div>
			<% }%>
		</section>
	</div>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script>
		function expand(resultId) {
			//	var $this = $(this);
			var $collapse = $(resultId).find('.collapse');
			if ($collapse.length != 0)
				$collapse.collapse('toggle');
			else {
				$collapse = $(resultId).find('.in');
				$collapse.collapse('toggle');
			}
			//var $collapse = $this.find(bookingId).find('.collapse');

		}
	</script>
</body>
</html>