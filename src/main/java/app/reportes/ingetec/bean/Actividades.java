package app.reportes.ingetec.bean;

public class Actividades {
	private int codigoActividad;
	private String descripcionActividad;
	private boolean estadoActividad;
	private String unidadActividad;
	private int  codigoSegmento;
	private String partidaActividad;
	private Double precioUniUrbano;
	private Double precioUniRural;
	private Double precioUniUrbRural;
	
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
	public int getCodigoActividad() {
		return codigoActividad;
	}
	public void setCodigoActividad(int codigoActividad) {
		this.codigoActividad = codigoActividad;
	}
	public String getDescripcionActividad() {
		return descripcionActividad;
	}
	public void setDescripcionActividad(String descripcionActividad) {
		this.descripcionActividad = descripcionActividad;
	}
	public boolean isEstadoActividad() {
		return estadoActividad;
	}
	public void setEstadoActividad(boolean estadoActividad) {
		this.estadoActividad = estadoActividad;
	}
	public String getUnidadActividad() {
		return unidadActividad;
	}
	public void setUnidadActividad(String unidadActividad) {
		this.unidadActividad = unidadActividad;
	}
	public int getCodigoSegmento() {
		return codigoSegmento;
	}
	public void setCodigoSegmento(int codigoSegmento) {
		this.codigoSegmento = codigoSegmento;
	}
	public String getPartidaActividad() {
		return partidaActividad;
	}
	public void setPartidaActividad(String partidaActividad) {
		this.partidaActividad = partidaActividad;
	}
}
