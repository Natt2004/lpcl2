package interfaces;

import java.util.List;

import lpcl2.TblProductocl2;

public interface Iproductoable {
	public void RegistrarProducto(TblProductocl2 tblpro);
	public void ActualizarProducto(TblProductocl2 tblpro);
	public void EliminarProducto(TblProductocl2 tblpro);
	public List<TblProductocl2> ListadoProducto();
	public TblProductocl2 BuscarProducto(TblProductocl2 tblpro);
	public String ValidarProducto(TblProductocl2 tblpro);

}
