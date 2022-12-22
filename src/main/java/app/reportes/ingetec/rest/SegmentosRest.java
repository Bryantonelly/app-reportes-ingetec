package app.reportes.ingetec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import app.reportes.ingetec.service.SegmentosService;

@RestController
public class SegmentosRest {
	@Autowired
	private SegmentosService service;
	
	@GetMapping("segmentos/listar/{cod}")
	public ResponseEntity<List<app.reportes.ingetec.bean.Segmentos>> listarSegmentosxSede(@PathVariable("cod") int cod){
		return service.listarSegmentosPorSede(cod);
	}
}
