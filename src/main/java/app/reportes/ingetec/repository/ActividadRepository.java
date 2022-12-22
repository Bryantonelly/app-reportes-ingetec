package app.reportes.ingetec.repository;

import java.util.List;

import app.reportes.ingetec.bean.Actividades;

public interface ActividadRepository {
	public List<Actividades> listarActividadesSegmento(int codsegmento);
}
