package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import lpcl2.TblProductocl2;

public class TestProducto {

public static void main(String[] args) {
		
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("lpcl2");
		EntityManager emanager=conex.createEntityManager();
		emanager.getTransaction().begin();
		TblProductocl2 prod=new TblProductocl2();
		String accion=JOptionPane.showInputDialog("Ingrese la Accion");
		switch(accion){
		
		//REGISTRO
		case "Registrar":
			prod.setNomb("Manjar");
			prod.setPreciVenta(0);
			prod.setPrecioComp(0);
			prod.setEstado("Vigente");
			prod.setDescrip("Dulce de leche");
			
			emanager.persist(prod);
			System.out.println("Productos registrados");
			emanager.getTransaction().commit();
			emanager.close();	
			break;
			
			//ACTUALIZAR
		case "Actualizar":
			prod.setIdProduc(2);
			prod.setNomb("Polvo");
			prod.setPreciVenta(8);
			prod.setPrecioComp(7);
			prod.setEstado("nuevo");
			prod.setDescrip("para el rostro");

			emanager.merge(prod);
			System.out.println("Producto actualizado");
			emanager.getTransaction().commit();
			emanager.close();		
			break;
			
			//ELIMINAR
		case "Eliminar":

			prod.setIdProduc(3);
			TblProductocl2 eliminar=emanager.merge(prod);

			emanager.remove(eliminar);
			System.out.println("Producto eliminado");
			emanager.getTransaction().commit();
			emanager.close();
			break;
			
			// BUSCAR
		case "Buscar":
			TblProductocl2 buscar=emanager.find(TblProductocl2.class,10);
	
			if(buscar==null){
				System.out.println("Producto no existe");
			          }
			else{
				System.out.println("Este Producto si existe");
				
				System.out.println("codigo "+buscar.getIdProduc()+" nombre "+buscar.getNomb()+
						" precio "+buscar.getPreciVenta()+" precio pc "+buscar.getPrecioComp()+
						" estado "+buscar.getEstado()+" descripcion"+buscar.getDescrip());
			}    
			
			emanager.getTransaction().commit();
			emanager.close();
			break;
			
			//LISTAR 
		case "Listar":
			List<TblProductocl2> listado=emanager.createQuery("select a from TblProducto a",TblProductocl2.class).getResultList();

			for(TblProductocl2 lista:listado){
				//imprimimos datos en consola...
				System.out.println("codigo "+lista.getIdProduc()+" nombre "+
				lista.getNomb()+" precio "+lista.getPreciVenta()+" precio pc "+lista.getPrecioComp()+
				" estado "+lista.getEstado()+" descripcion "+lista.getDescrip());
			}   
			emanager.getTransaction().commit();
			emanager.close();
			break;
		
			//ELIMINAR II
			
		case "EliminarII":
			TblProductocl2 elimII=emanager.find(TblProductocl2.class,4);
			
			if(elimII==null){
				System.out.println("Codigo no existe");
			}else{
				System.out.println("registro encontrado");
				emanager.remove(elimII);
				System.out.println("Registro Eliminado");
				emanager.getTransaction().commit();
				emanager.close();
			}  
			
			break; 
			
		}  

	}   

}  



