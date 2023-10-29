<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logeo</title>
</head>
<body bgcolor="#C8A2C8" >
<h1 align="center">Ingresar al sistema</h1>
<%
String mens=(String)request.getAttribute("mensaje");
String men="";
if(mens!=null)  men=mens;
%>
<h2 align="center">
<%=men%>
</h2>

<table  align="center" style="text-align:center">

<form action="ControladorUsuario" method="post">
<form>
<td colspan="2"><img src="img/user.png" width="200px" height="200px"></td>
<tr><td>Usuario</td><td><input type="text" name="usuario"></td></tr>
<tr><td>Password</td><td><input type="password" name="password"></td></tr>
<tr><td colspan="2"><input type="submit" value="Iniciar sesion"></td></tr>


</form>
</table>
</body>
</html>