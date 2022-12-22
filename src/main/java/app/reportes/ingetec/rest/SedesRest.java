package app.reportes.ingetec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import app.reportes.ingetec.bean.Sedes;
import app.reportes.ingetec.service.SedesService;

@RestController
public class SedesRest {
	@Autowired
	private SedesService service;
	
	@GetMapping("sedes/listar")
	public ResponseEntity<List<Sedes>> listarSedes(){
		return service.listarSedes();
	}
}
