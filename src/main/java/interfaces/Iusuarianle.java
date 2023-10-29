package interfaces;

import java.util.List;
import lpcl2.TblUsuarioscl2;

public interface Iusuarianle {
	
	public void RegistrarUsuario(TblUsuarioscl2 tblusu);
	public void ActualizarUsuario(TblUsuarioscl2 tblusu);
	public void EliminarUsuario(TblUsuarioscl2 tblusu);
	public List<TblUsuarioscl2> ListadoUsuario();
	public TblUsuarioscl2 BuscarUsuario(TblUsuarioscl2 tblusu);
	public String ValidarUsuario(TblUsuarioscl2 tblusu);
	

}
