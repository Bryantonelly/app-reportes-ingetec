package app.reportes.ingetec.bean;

public class Integrantes {
	private int codigoIntegrante;
	private int codigoEquipo;
	private int codigoSede;
	private String nombresIntegrante;
	private String apellidosIntegrante;
	
	public Integrantes() {
		super();
	}
	public Integrantes(int codigoIntegrante, int codigoEquipo, int codigoSede, String nombresIntegrante,
			String apellidosIntegrante) {
		super();
		this.codigoIntegrante = codigoIntegrante;
		this.codigoEquipo = codigoEquipo;
		this.codigoSede = codigoSede;
		this.nombresIntegrante = nombresIntegrante;
		this.apellidosIntegrante = apellidosIntegrante;
	}
	public Integrantes(String nombresIntegrante, String apellidosIntegrante) {
		super();
		this.nombresIntegrante = nombresIntegrante;
		this.apellidosIntegrante = apellidosIntegrante;
	}
	public int getCodigoIntegrante() {
		return codigoIntegrante;
	}
	public void setCodigoIntegrante(int codigoIntegrante) {
		this.codigoIntegrante = codigoIntegrante;
	}
	public int getCodigoEquipo() {
		return codigoEquipo;
	}
	public void setCodigoEquipo(int codigoEquipo) {
		this.codigoEquipo = codigoEquipo;
	}
	public int getCodigoSede() {
		return codigoSede;
	}
	public void setCodigoSede(int codigoSede) {
		this.codigoSede = codigoSede;
	}
	public String getNombresIntegrante() {
		return nombresIntegrante;
	}
	public void setNombresIntegrante(String nombresIntegrante) {
		this.nombresIntegrante = nombresIntegrante;
	}
	public String getApellidosIntegrante() {
		return apellidosIntegrante;
	}
	public void setApellidosIntegrante(String apellidosIntegrante) {
		this.apellidosIntegrante = apellidosIntegrante;
	}
	
}
