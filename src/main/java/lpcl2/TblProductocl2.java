package lpcl2;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_productocl2 database table.
 * 
 */
@Entity
@Table(name="tbl_productocl2")
@NamedQuery(name="TblProductocl2.findAll", query="SELECT t FROM TblProductocl2 t")
public class TblProductocl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_produc")
	private int idProduc;

	private String descrip;

	private String estado;

	private String nomb;

	private double precioComp;

	private double preciVenta;

	public TblProductocl2() {
	}

	public int getIdProduc() {
		return this.idProduc;
	}

	public void setIdProduc(int idProduc) {
		this.idProduc = idProduc;
	}

	public String getDescrip() {
		return this.descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNomb() {
		return this.nomb;
	}

	public void setNomb(String nomb) {
		this.nomb = nomb;
	}

	public double getPrecioComp() {
		return this.precioComp;
	}

	public void setPrecioComp(double precioComp) {
		this.precioComp = precioComp;
	}

	public double getPreciVenta() {
		return this.preciVenta;
	}

	public void setPreciVenta(double preciVenta) {
		this.preciVenta = preciVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		// TODO Auto-generated method stub
		
	}

}