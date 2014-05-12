<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@page import = "edu.sjsu.fly5.manager.TravellerManager" %>
<%@page import = "edu.sjsu.fly5.pojos.Traveller" %>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="../css/bootstrap.css">
<link rel="stylesheet" href="../css/main.css">
<link rel="stylesheet" href="../css/user.css">
<title>Fly5 Airlines</title>
</head>
<body>
<%String newSessionUserID=(String)session.getAttribute("userID"); %>
<%int uId = new Integer(newSessionUserID).intValue(); %>

<% TravellerManager travellerManager = new TravellerManager();%>
<%Traveller traveller = new Traveller(); %>
<%traveller = travellerManager.viewTravellerInfo(uId); %>

<%Calendar cal=traveller.getDateOfBirth(); %>
<%String strdate=null;
SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
if(cal!=null){
	strdate=sdf.format(cal.getTime());
}
%>
	<div class="container">
		<header class="header">
			<h1>Fly5 Airlines</h1>
		</header>
		<section class="user-section">
			<ul class="nav nav-pills" id="myTab">
				<li class="active"><a href="profile.jsp">Profile</a></li>
				<li><a href="reservation.jsp">Reservation</a></li>
			</ul>
			<div>
				<form method="post" action="/fly5Client/TravellerController" class="profile">
				<div class="has-error">
					<label class="control-label">${error}</label>
					</div>	
					<input type = "hidden" name = "email" value = <%=traveller.getEmailAddress()%>>
					<input type = "hidden" name = "street" value = <%=traveller.getAddress()%>>
					<input type = "hidden" name = "city" value = <%=traveller.getCity() %>>
					<input type = "hidden" name = "state" value = <%=traveller.getState() %>>
					<input type = "hidden" name = "zip" value = <%=traveller.getZipcode() %>>
					<input type = "hidden" name = "password" value = <%=traveller.getPassword() %>>
					<input type = "hidden" name = "action" value = "Traveller-editProfile.do">
					<label class="control-label" for="fn">First Name:</label> 
					
					 <input class="form-control" name="fn" value = <%=traveller.getFirstName()%>> 
					  <label class="control-label" for="ln">Last Name:</label> 
		<input class="form-control" name="ln" value = <%=traveller.getLastName() %>>
		<label class="control-label" for="dob">Date of Birth (mm/dd/yyyy):</label> 
		<input  type="text" class="form-control"  name="dob" value = <%=strdate %>>
		<label class="control-label" for="pspt">Passport:</label> 
		<input class="form-control" name="pspt" value = <%=traveller.getPassportNumber() %> > 
		<label class="control-label" for="ntly">Nationality:</label> 
		<input class="form-control" name="ntly" value = <%=traveller.getNationality() %>>
		<button type="submit" class="btn btn-primary">Update</button>
	</form>
</div>
		</section>
	</div>
</body>
</html>
