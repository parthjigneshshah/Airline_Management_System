<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import = "edu.sjsu.fly5.manager.TravellerManager" %>
<%@page import = "edu.sjsu.fly5.pojos.Traveller" %>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="../css/bootstrap.css">
<link rel="stylesheet" href="../css/main.css">
<link rel="stylesheet" href="../css/admin.css">
<script type="text/javascript" src="../js/jQuery 1.7.2.js"></script>
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
				<li class="active"><a href="customer.jsp">Customer</a></li>
				<li><a href="reservation.jsp">Reservation</a></li>
			</ul>
			<!-- Add view customers code -->
			<%-- <div class="has-error">
  <label class="control-label">${error}</label>
</div> --%>

			

<% TravellerManager travellerManager = new TravellerManager();%>
<%Traveller[] travellerDetails = travellerManager.listTravellers(); %>

<!-- view customer -->
<div class="view-customer">
    <table class="table table-striped table-hover">
         <tr>
         
           <th>First Name</th>
           <th>Last Name</th>
           <th>Email</th>
           <th>Address</th>
           <th>Passport</th>
           <th>Nationality</th>
         </tr>
        
        
         <%for(int i = 0 ; i<travellerDetails.length ; i++){%>
         	
         	<tr>
         	<%
         	long travellerId = travellerDetails[i].getTravellerID();
         	%>
         	
         	<td><%=travellerDetails[i].getFirstName() %></td>
         	<td><%=travellerDetails[i].getLastName() %></td>
         	<td><%=travellerDetails[i].getEmailAddress() %></td>
         	<td><%=travellerDetails[i].getAddress()+","+travellerDetails[i].getCity()+","+travellerDetails[i].getState()+","+travellerDetails[i].getZipcode() %></td>
         	<td><%= travellerDetails[i].getPassportNumber()%></td>
         	<td><%=travellerDetails[i].getNationality() %></td>
						<td><a href="#" onclick="deleteCustomer('<%=travellerId%>');"><span
								class="glyphicon glyphicon-remove"></span></a></td>
					</tr>
					<%} %>
				</table>
			</div>

			<!-- delete customer modal-->
			<div id="deletecustomer" class="modal fade" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">

						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel">Delete Customer</h4>
						</div>
						<div class="modal-body">
							<form id="deletecustomerform" action="/fly5Client/TravellerController" method="post">
								<input type="hidden" name = "action" value="delete"></input>
								<input type="hidden" name="dcustomerno" >
								<div class="alert alert-warning">
									<h4>
										<span class="glyphicon glyphicon-exclamation-sign"></span> Do
										you really want to delete this customer?
									</h4>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">No</button>
									<button type="submit" class="btn btn-primary">Yes</button>
								</div>
							</form>
						</div>
					</div>
					<!-- /.modal-content -->
				</div>
				<script>
					function deleteCustomer(customerno){
						document.getElementsByName("dcustomerno")[0].value = customerno;
						$('#deletecustomer').modal({show: true});
					}
				</script>
				<!-- /.modal-dialog -->
			</div>
		</section>
		<script type="text/javascript" src="../js/bootstrap.js"></script>
	</div>
</body>
</html>



	