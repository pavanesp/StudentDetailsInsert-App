<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<head><style>

table {
  border-collapse: collapse;
}

table, th, td {
  border: 1px solid white;
}

</style></head>
<body style="background-color:red;color:white;font-size:150%;">
<div align="center" style="background-color:blue;">
<form:form method="POST" commandName="stCmd">



<table border="1" width="300" height="300">
<tr>
<td>
StudentNo:
</td>
<td>
<form:input path="sno"/><br><br>
</td>
</tr>
<tr>
<td>
StudentName:
</td>
<td>
<form:input path="sname"/><br><br>
</td>
</tr>
<tr>
<td>
Email:
</td>
<td>
<form:input path="addr"/><br><br>
</td>
</tr>
<tr>
<td>
IcetRank:
</td>
<td>
<form:input path="srank"/><br><br>
</td>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" value="Register"/>
</td>
</tr>
</table>
</form:form>

</div>
</body>