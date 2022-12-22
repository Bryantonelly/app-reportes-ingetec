package app.reportes.ingetec.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import app.reportes.ingetec.bean.Reporte;

public interface ReporteService {
	public ResponseEntity<List<Reporte>> listarReporte();
}
