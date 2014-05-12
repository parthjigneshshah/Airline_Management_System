<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<%@page import="edu.sjsu.fly5.manager.CrewManager"%>
<%@page import="edu.sjsu.fly5.pojos.Crew"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.sjsu.fly5.pojos.Employee"%>
<%CrewManager crewManager = new CrewManager(); %>
<%Crew[] listOfCrew=crewManager.listOfCrews(); %>
<

<%Object obj=(Object)request.getAttribute("listOfEmployees"); %>

<html lang="en">
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="../css/bootstrap.css">
<link rel="stylesheet" href="../css/main.css">
<link rel="stylesheet" href="../css/admin.css">
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
<script type="text/javascript" src="../js/jquery-1.7.2.js"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
<script type="text/javascript" src="../js/employee.js"></script>
<title>Fly5 Airlines</title>
</head>
<body>
	<div class="container">
		<header class="header">
			<h1>Fly5 Airlines</h1>
		</header>
		<section class="admin-section">
			<ul class="nav nav-pills" id="myTab">
				<li><a href="flight.jsp">Flight</a></li>
				<li><a href="employee.jsp">Employee</a></li>
				<li class="active"><a href="employee-search.jsp">Employee
						Search</a></li>
				<li><a href="customer.jsp">Customer</a></li>
				<li><a href="reservation.jsp">Reservation</a></li>
			</ul>
			<!-- Add view employees code -->
			<div class="has-error">
				<label class="control-label">${error}</label>
			</div>

			<div class="search-employee">
				<form id="searchemployeeform" action="employee.do" method="post">
					<input type="hidden" name="action" value="serachEmployeeBasedOnAttributes"> <input
						type="text" class="form-control" name="employeeno"
						placeholder="Employee #" required autofocus> <select
						class="form-control" name="position" required autofocus>
						<option value="Captain">Captain</option>
						<option value="Co-Pilot">Co-Pilot</option>
						<option value="Flight Attendant">Flight Attendant</option>
						<option value="Aircraft Engineer">Aircraft Engineer</option>
						<option value="Ground Staff">Ground Staff</option>
					</select><input type="date" class="form-control" id="hireDate"
						name="hireDate" placeholder="Hire Date" required autofocus>
						<select class="form-control" name="crew" required autofocus>
						<%for(int i=0;i<listOfCrew.length;i++){ %>
									<option value="<%=listOfCrew[i].getCrewID()%>"><%=listOfCrew[i].getCrewID()%></option>
										<%}%>
						</select>
						
						<button type="submit" class="btn btn-primary">Search</button>
				</form>
			</div>
			<!-- view employee -->
			<div class="view-employee">
				<table class="table table-striped table-hover">
					<tr>
						<th>Employee #</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Date of Birth</th>
						<th>Address</th>
						<th>Work Description</th>
						<th>Position</th>
						<th>Hire Date</th>
						<th></th>
						<th></th>
					</tr>
					<%if(obj!=null){ Employee[] list=(Employee[])request.getAttribute("listOfEmployees"); %>
	
					<%for(int i=0;i<list.length;i++){%>
         <%String address=list[i].getAddress()+","+list[i].getCity()+","+list[i].getState()+"-"+list[i].getZipcode(); %>
					<tr>
				 <%Calendar hireDateCal=list[i].getHireDate(); %>
         <%String hireDate = null;

SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

 if (hireDateCal != null) {
 hireDate = sdf.format(hireDateCal.getTime());
 }  %>

					 <%Calendar dateOfBirthCal=list[i].getDateOfBirth(); %>
         <%String dateOfBirth = null;

SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");

 if (dateOfBirthCal != null) {
 dateOfBirth = sdf1.format(dateOfBirthCal.getTime());
 }  %>
					
					
					
						<td id="eno0"><%=list[i].getEmployeeID() %></td>
						<td id="efn0"><%=list[i].getFirstName() %></td>
						<td id="eln0"><%=list[i].getLastName() %></td>
						<td id="eml0"><%=list[i].getEmailAddress() %></td>
						<td id="edob0"><%=dateOfBirth %></td>
						<td id="eadd0"><address><%=address %></address></td>
						<td id="ewd0"><%=list[i].getWorkDescription() %></td>
						<td id="ep0"><%=list[i].getDesignation() %></td>
						<td id="ehd0"><%=hireDate %></td>
					<!-- 	<td><a href="#" onclick="editEmployee('0', '187319850');"><span
								class="glyphicon glyphicon-pencil"></span></a></td>
						<td><a href="#" onclick="deleteEmployee('187319850');"><span
								class="glyphicon glyphicon-remove"></span></a></td> -->
								<%}%>
								<%} %>
					</tr>
				</table>
			</div>


			<script>
				$(function() {
					$("#hireDate").datepicker();
					});
			</script>
		</section>
		<script type="text/javascript" src="../js/bootstrap.js"></script>
	</div>
</body>
</html>