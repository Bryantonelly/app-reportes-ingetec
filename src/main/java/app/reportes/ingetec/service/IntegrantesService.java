package app.reportes.ingetec.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import app.reportes.ingetec.bean.Integrantes;

public interface IntegrantesService {
	public ResponseEntity<List<Integrantes>> listarIntegrantesSede(int codsede);
	public ResponseEntity<List<Integrantes>> listarIntegrantesEjecucion(int codeje);
}
