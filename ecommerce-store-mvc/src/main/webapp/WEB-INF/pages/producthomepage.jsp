<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Home Page</title>
<!-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">-->
</head>
<body>
<h1 style="text-align: center;"> Home Page Of Products</h1>
<center><button onclick="window.location.href='/list/products'" class="btn btn-primary">Display Products</button><br><br></center>
<center><button onclick="window.location.href='/list/merchant'" class="btn btn-primary">List of Products by Merchant</button><br><br>
<center><button onclick="window.location.href='/save'" class="btn btn-primary">Add new product</button><br><br></center>
<center><button onclick="window.location.href='/update'" class="btn btn-primary">Edit existing product</button><br><br></center>
<center><button onclick="window.location.href='/list/available'" class="btn btn-primary">Products with inventory > 0</button><br><br></center>
<center><button onclick="window.location.href='/list/not-available'" class="btn btn-primary">Products with inventory = 0</button><br><br></center>
</body>
</html>