<%@ taglib prefix="form" uri="http://www.springframwork.org/tags/form"%>

<DOCTYPE html>
<html>
<head>
<title>Student Registration form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">

First name: <form:input path="firstName" />
		<br>
		<br>
Last name: <form:input path="lastName" />
		<br>
		<br>
		<input type="submit" value="Submit" />

	</form:form>

</body>
</html>