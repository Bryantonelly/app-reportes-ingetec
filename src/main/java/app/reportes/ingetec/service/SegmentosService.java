package app.reportes.ingetec.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import app.reportes.ingetec.bean.Segmentos;

public interface SegmentosService {
	public ResponseEntity<List<Segmentos>> listarSegmentosPorSede(int codseg);
}
