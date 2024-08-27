
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
 <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<marquee><h2> Add new restarurant</h2></marquee>


<form action="saverestaurant" method="post">
	Name : <input type="text" name="name" value="${restaurant.name}"/>
<span style="color: red">	${result.getFieldError('name').getDefaultMessage()}</span><Br><Br> 
	Address :  <input type="text" name="address" value="${restaurant.address}"/>
<span style="color: red">	${result.getFieldError('address').getDefaultMessage()}</span><br><br> 
	Category : <input type="text" name="category" value="${restaurant.category}"/>
<span style="color: red">	${result.getFieldError('category').getDefaultMessage()}</span><br><br> 
	
	<input type="submit" value="Add Restaurant"/>

</form>

</body>
</html>

