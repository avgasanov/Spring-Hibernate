<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
	<title>luv2code Company Home Page</title>
</head>

<body>
	<h2>luv2code Company Home Page</h2>
	<hr>
	
	<p>
		Welcome to the company page!!!
	</p>
	
	<form:form action="${pageContext.request.contextPath}/logout"
				method="POST">
				
		<input type="submit" value="Logout" />
		
	</form:form>
	
</body>
</html>