package app.reportes.ingetec.bean;

import java.sql.Date;

public class CantidadesEjecutadas {
	private int codigoCantEjecutada;
	private Date fechaEjecucion;
	private int cantidadUrbano;
	private int cantidadUrbRural;
	private int cantidadRural;
	private int codigoActividad;
	private String nombreActividad;

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
	public String getNombreActividad() {
		return nombreActividad;
	}
	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}
	public int getCodigoCantEjecutada() {
		return codigoCantEjecutada;
	}
	public void setCodigoCantEjecutada(int codigoCantEjecutada) {
		this.codigoCantEjecutada = codigoCantEjecutada;
	}
	public Date getFechaEjecucion() {
		return fechaEjecucion;
	}
	public void setFechaEjecucion(Date fechaEjecucion) {
		this.fechaEjecucion = fechaEjecucion;
	}
	public int getCodigoActividad() {
		return codigoActividad;
	}
	public void setCodigoActividad(int codigoActividad) {
		this.codigoActividad = codigoActividad;
	}
}
