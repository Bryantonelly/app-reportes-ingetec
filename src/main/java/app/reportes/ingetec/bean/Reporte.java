package app.reportes.ingetec.bean;

import java.sql.Date;

public class Reporte {
	public Reporte() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String nombreSegmento;
	private int codigoActividades;
	private String descripcionActividad;
	private String unidadActividad;
	private String partidaActividad;
	private String nombreSede;
	private Date fechaEjecucion;
	private Double precioUniUrbano;
	private Double precioUniRural;
	private Double precioUniUrbRural;
	private int cantidadUrbano;
	private int cantidadUrbRural;
	private int cantidadRural;
//	private List<Integrantes> integrantes;
	
	public int getCodigoActividades() {
		return codigoActividades;
	}
	public void setCodigoActividades(int codigoActividades) {
		this.codigoActividades = codigoActividades;
	}
	public Date getFechaEjecucion() {
		return fechaEjecucion;
	}
	public void setFechaEjecucion(Date fechaEjecucion) {
		this.fechaEjecucion = fechaEjecucion;
	}
	public Double getPrecioUniUrbano() {
		return precioUniUrbano;
	}
	public void setPrecioUniUrbano(Double precioUniUrbano) {
		this.precioUniUrbano = precioUniUrbano;
	}
	public Double getPrecioUniRural() {
		return precioUniRural;
	}
	public void setPrecioUniRural(Double precioUniRural) {
		this.precioUniRural = precioUniRural;
	}
	public Double getPrecioUniUrbRural() {
		return precioUniUrbRural;
	}
	public void setPrecioUniUrbRural(Double precioUniUrbRural) {
		this.precioUniUrbRural = precioUniUrbRural;
	}
	public int getCantidadUrbano() {
		return cantidadUrbano;
	}
	public void setCantidadUrbano(int cantidadUrbano) {
		this.cantidadUrbano = cantidadUrbano;
	}
	public int getCantidadUrbRural() {
		return cantidadUrbRural;
	}
	public void setCantidadUrbRural(int cantidadUrbRural) {
		this.cantidadUrbRural = cantidadUrbRural;
	}
	public int getCantidadRural() {
		return cantidadRural;
	}
	public void setCantidadRural(int cantidadRural) {
		this.cantidadRural = cantidadRural;
	}
//	public List<Integrantes> getIntegrantes() {
//		return integrantes;
//	}
//	public void setIntegrantes(List<Integrantes> integrantes) {
//		this.integrantes = integrantes;
//	}
	public String getNombreSegmento() {
		return nombreSegmento;
	}
	public void setNombreSegmento(String nombreSegmento) {
		this.nombreSegmento = nombreSegmento;
	}
	public String getDescripcionActividad() {
		return descripcionActividad;
	}
	public void setDescripcionActividad(String descripcionActividad) {
		this.descripcionActividad = descripcionActividad;
	}
	public String getUnidadActividad() {
		return unidadActividad;
	}
	public void setUnidadActividad(String unidadActividad) {
		this.unidadActividad = unidadActividad;
	}
	public String getPartidaActividad() {
		return partidaActividad;
	}
	public void setPartidaActividad(String partidaActividad) {
		this.partidaActividad = partidaActividad;
	}
	public String getNombreSede() {
		return nombreSede;
	}
	public void setNombreSede(String nombreSede) {
		this.nombreSede = nombreSede;
	}
}
