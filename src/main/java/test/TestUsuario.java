package test;

import java.util.List;

import dao.CrudUsuario;
import lpcl2.TblUsuarioscl2;

public class TestUsuario {
	
	public static void main(String[] args) {

		TblUsuarioscl2 tbusu=new TblUsuarioscl2();
		CrudUsuario crudusu=new CrudUsuario();

		tbusu.setUsua("nat2004");
		tbusu.setPasswor("12369874");
	
		String men=crudusu.ValidarUsuario(tbusu);
		System.out.println("usuario "+men);
		
		
	    //CRUD USUARIO
		
		TblUsuarioscl2 tblusu=new TblUsuarioscl2();
		CrudUsuario crud=new CrudUsuario();
		
		//REGISTRO
		tblusu.setUsua("Katheine");
		tblusu.setPasswor("12345");

		crud.RegistrarUsuario(tblusu);
		
		/*
		//ACTUALIZAR
		tblusu.setIdUsua(2);
		tblusu.setUsua("Rosa");
		tblusu.setPasswor("963214");
	
		crud.ActualizarUsuario(tblusu);
		
		
		//ELIMINAR
		tblusu.setIdUsua(1);
	
		crud.EliminarUsuario(tblusu);
		
		
		//LISTADO
		List<TblUsuarioscl2> listar=crud.ListadoUsuario();
		
		for(TblUsuarioscl2 lis:listar){
	
			System.out.println("codigo "+lis.getIdUsua()+" usuario "+lis.getUsua()
			+" password "+lis.getPasswor());
		
		//BUSCAR
	    tblusu.setIdUsua(1);;
	    TblUsuarioscl2 empbu=crud.BuscarUsuario(tblusu);
		
		System.out.println("codigo "+empbu.getUsua()+" usuario "+
		empbu.getUsua()+" password "+empbu.getPasswor());
       


	}   
*/
}
	
		
	}



