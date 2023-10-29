<%@page import="java.util."" %>
<%@page import="lpcl2.TblProducto"%>

<html>
<body bgcolor="#C8A2C8">
<h2 align="center">Registrar Usuario</h2>

<form method="post" action="ControladorProducto">
<table border="2" align="center">
<tr>
<td>Nombre</td><td><input type="text" name="nombre"></td>
</tr>

<tr>
<td>Precio Venta</td><td><input type="text" name="preciVenta"></td>
</tr>
<tr>
<td>Precio</td><td><input type="text" name="precio"></td>
</tr>
<tr>
<td colspan="2" align="center"><select name="estado"><option>Seleccione estado</option><option>Nuevo</option>
<option>Usado</option></select></td>
</tr>
<tr>
<td>Descripcion</td><td><input type="text" name="descripcion"></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="Registrar"></td>
</tr>

</table>
</form>
<h1 align="center">
Listado de Productos
</h1>
<table align="center">
<tr>
<th>codigo</th>
<th>nombre</th>
<th>pv</th>
<th>pc</th>
<th>estado</th>
<th>descripcion</th>
</tr>
<%
List<TblProducto> listado=(List<TblProducto>)request.getAttribute("listado");

%>

</table>

</body>
</html>
