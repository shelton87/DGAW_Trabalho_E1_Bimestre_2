<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atividade E1 - Bimestre 1</title>

<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 50%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>

</head>
<body>

<%
	out.println("<table>");
	out.println("<tr><th>Nome Produto</th><th>Preço</th><th>Edição</th></tr>");
	for (int x = 1; x < 31; x++) {
		out.println("<tr>");
		out.println("<td>Produto " + x + "</td>");
		out.println("<td>R$ " + x + ",00</td>");
		out.println("<td><button type='button'>Edição</button></td>");
		out.println("</tr>");		
	}	
	out.println("</table>");
%>

</body>
</html>