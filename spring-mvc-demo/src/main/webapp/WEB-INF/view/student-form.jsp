<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
		
		Country:
		
		<form:select path="country">
		
			<form:options items="${student.countryOptions}"/>

		</form:select>
		
		<br><br>
		Favorite language:
		Java <form:radiobutton path="favouriteLanguge" value="Java"/>
		Javascript <form:radiobutton path="favouriteLanguge" value="Javascript"/>
		C# <form:radiobutton path="favouriteLanguge" value="C#"/>
		Ruby <form:radiobutton path="favouriteLanguge" value="Ruby"/>
	
	<br><br>
		<input type="submit" value="Submit" />



	</form:form>

</body>
</html>