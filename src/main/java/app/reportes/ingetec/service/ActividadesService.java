package app.reportes.ingetec.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import app.reportes.ingetec.bean.Actividades;

public interface ActividadesService {
	public ResponseEntity<List<Actividades>> listarActividadesSegmento(int codsegmento);
}
