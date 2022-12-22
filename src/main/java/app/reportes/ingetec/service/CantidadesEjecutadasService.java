package app.reportes.ingetec.service;

import org.springframework.http.ResponseEntity;

import app.reportes.ingetec.bean.CantidadesEjecutadas;

public interface CantidadesEjecutadasService {
	public ResponseEntity<String> insertarCantidadesEje(CantidadesEjecutadas cantieje);
}
