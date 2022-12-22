package app.reportes.ingetec.service;

import org.springframework.http.ResponseEntity;

public interface CantidadesEjeInteService {
	public ResponseEntity<String> insertarIntegrantesCantidades(int request);
}
