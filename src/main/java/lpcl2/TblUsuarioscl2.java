package lpcl2;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_usuarioscl2 database table.
 * 
 */
@Entity
@Table(name="tbl_usuarioscl2")
@NamedQuery(name="TblUsuarioscl2.findAll", query="SELECT t FROM TblUsuarioscl2 t")
public class TblUsuarioscl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usua")
	private int idUsua;

	private String passwor;

	private String usua;

	public TblUsuarioscl2() {
	}

	public int getIdUsua() {
		return this.idUsua;
	}

	public void setIdUsua(int idUsua) {
		this.idUsua = idUsua;
	}

	public String getPasswor() {
		return this.passwor;
	}

	public void setPasswor(String passwor) {
		this.passwor = passwor;
	}

	public String getUsua() {
		return this.usua;
	}

	public void setUsua(String usua) {
		this.usua = usua;
	}

}