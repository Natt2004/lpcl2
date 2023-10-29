package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.Iproductoable;
import lpcl2.TblProductocl2;

public class CrudProducto implements Iproductoable{

	public void RegistrarProducto(TblProductocl2 tblpro) {
		// TODO Auto-generated method stub
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("lpcl2");
		 EntityManager emanager=conex.createEntityManager();

		 emanager.getTransaction().begin();
		 emanager.persist(tblpro);
		 System.out.println("Registro correctamente");
		 emanager.getTransaction().commit();
		 emanager.close();
	}

	public void ActualizarProducto(TblProductocl2 tblpro) {
		// TODO Auto-generated method stub
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("lpcl2");

		EntityManager emanager=conex.createEntityManager();
		emanager.getTransaction().begin();
		emanager.merge(tblpro);
		System.out.println("Actualizo correctamente");
		emanager.getTransaction().commit();
		emanager.close();
	}

	public void EliminarProducto(TblProductocl2 tblpro) {
		// TODO Auto-generated method stub
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("lpcl2");
		EntityManager emanager=conex.createEntityManager();
		
		emanager.getTransaction().begin();	
		TblProductocl2 elimin=emanager.merge(tblpro);
		emanager.remove(elimin);
		System.out.println("Eliminado correctamente");
		emanager.getTransaction().commit();
		emanager.close();
	}

	public List<TblProductocl2> ListadoProducto() {
		// TODO Auto-generated method stub
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("lpcl2");
		EntityManager emanager=conex.createEntityManager();
		emanager.getTransaction().begin();
		
		List<TblProductocl2> listado=emanager.createQuery("SELECT t FROM TblProductocl2 t",TblProductocl2.class).getResultList();

		emanager.getTransaction().commit();
		emanager.close();
		
		return listado;
	}

	public TblProductocl2 BuscarProducto(TblProductocl2 tblpro) {
		// TODO Auto-generated method stub
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("lpcl2");
		EntityManager emanager=conex.createEntityManager();
	
		emanager.getTransaction().begin();			
		TblProductocl2 busc=emanager.find(TblProductocl2.class,tblpro.getIdProduc());		

		emanager.getTransaction().commit();
		emanager.close();
	    return busc;
	}

	public String ValidarProducto(TblProductocl2 tblpro) {
		// TODO Auto-generated method stub
		return null;
	}

}
