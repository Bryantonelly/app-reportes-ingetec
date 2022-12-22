package app.reportes.ingetec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import app.reportes.ingetec.bean.Reporte;
import app.reportes.ingetec.service.ReporteService;

@RestController
public class ReporteRest {
	@Autowired
	private ReporteService service;
	
	@GetMapping("reportes/listar")
	public ResponseEntity<List<Reporte>> listarReportes(){
		return service.listarReporte();
	}
}
