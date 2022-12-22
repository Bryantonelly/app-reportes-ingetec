package app.reportes.ingetec.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import app.reportes.ingetec.bean.Sedes;

public interface SedesService {
	public ResponseEntity<List<Sedes>> listarSedes();
}
