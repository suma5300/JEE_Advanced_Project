<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Products</title>
<style type="text/css">

table,tr,td,th{

border: 2px solid blue;

margin-left: auto;
margin-right: auto;
border-collapse: collapse;
}
</style>
</head>
<body>
	
		<div>

			<table>
				<thead>
					<tr>
						<th>Order Id</th>
						<th>User</th>
						<th>Order Date</th>
						<th>Product</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="eachOrder">
						<tr>
							<td>${eachOrder.orderId}</td>
							<td>${eachOrder.user}</td>
							<td>${eachOrder.orderDate}</td>
							<td>${eachOrder.product}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

</body>
</html>