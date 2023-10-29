package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CrudProducto;
import lpcl2.TblProductocl2;



/**
 * Servlet implementation class ControladorUsuario
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String nombre=request.getParameter("usuario");
		Double precioVenta = Double.parseDouble(request.getParameter("PrecioVenta"));
		Double precio = Double.parseDouble(request.getParameter("Precio"));	
		String estado=request.getParameter("estado");
		String descripcion=request.getParameter("descripcion");

		TblProductocl2 prod=new TblProductocl2();
		CrudProducto crudprod=new CrudProducto();
		
		prod.setNomb(nombre);
		prod.setPrecioVenta(precioVenta);	
		prod.setPrecioComp(precio);
		prod.setEstado(estado);
		prod.setDescrip(descripcion);
		
		crudprod.RegistrarProducto(prod);

		List<TblProductocl2> listado=crudprod.ListadoProducto();
		request.setAttribute("listado",listado);
		request.getRequestDispatcher("/index").forward(request, response);
	}

}
