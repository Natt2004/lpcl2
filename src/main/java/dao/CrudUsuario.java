package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import interfaces.Iusuarianle;
import lpcl2.TblUsuarioscl2;

public class CrudUsuario implements Iusuarianle {

	public void RegistrarUsuario(TblUsuarioscl2 tblusu) {
		// TODO Auto-generated method stub
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("lpcl2");
		 EntityManager emanager=conex.createEntityManager();

		 emanager.getTransaction().begin();
		 emanager.persist(tblusu);
		 System.out.println("Registro correctamente");
		 emanager.getTransaction().commit();
		 emanager.close();
	}

	public void ActualizarUsuario(TblUsuarioscl2 tblusu) {
		// TODO Auto-generated method stub
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("lpcl2");

		EntityManager emanager=conex.createEntityManager();
		emanager.getTransaction().begin();
		emanager.merge(tblusu);
		System.out.println("Actualizo correctamente");
		emanager.getTransaction().commit();
		emanager.close();
	}

	public void EliminarUsuario(TblUsuarioscl2 tblusu) {
		// TODO Auto-generated method stub
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("lpcl2");

		EntityManager emanager=conex.createEntityManager();
		emanager.getTransaction().begin();
		emanager.merge(tblusu);
		System.out.println("Actualizo correctamente");
		emanager.getTransaction().commit();
		emanager.close();
	}

	public List<TblUsuarioscl2> ListadoUsuario() {
		// TODO Auto-generated method stub
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("lpcl2");
		EntityManager emanager=conex.createEntityManager();
		emanager.getTransaction().begin();
		
		List<TblUsuarioscl2> listado=emanager.createQuery("select e from TblUsuarioscl2 e",TblUsuarioscl2.class).getResultList();

		emanager.getTransaction().commit();
		emanager.close();
		
		return listado;
	}

	public TblUsuarioscl2 BuscarUsuario(TblUsuarioscl2 tblusu) {
		// TODO Auto-generated method stub
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("lpcl2");
		EntityManager emanager=conex.createEntityManager();
	
		emanager.getTransaction().begin();			
		TblUsuarioscl2 busc=emanager.find(TblUsuarioscl2.class,tblusu.getIdUsua());		

		emanager.getTransaction().commit();
		emanager.close();
	    return busc;
	}

	public String ValidarUsuario(TblUsuarioscl2 tblusu) {
		// TODO Auto-generated method stub
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("lpcl2");
		EntityManager emanager=conex.createEntityManager();
		emanager.getTransaction().begin();
		

		Query consulta=emanager.createQuery("SELECT u FROM TblUsuarioscl2 u  where u.usuario=:x and u.passwor=:y",TblUsuarioscl2.class);
		
		consulta.setParameter("x",tblusu.getUsua());
		consulta.setParameter("y",tblusu.getPasswor());
		String mensaje="";
		TblUsuarioscl2 u;
		try{
			u=(TblUsuarioscl2) consulta.getSingleResult();
			mensaje="existe";
		}catch(Exception ex){
			u=null;
			mensaje="no existe";
			
		}
		return mensaje;
	}

}
