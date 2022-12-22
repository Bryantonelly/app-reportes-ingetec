package app.reportes.ingetec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import app.reportes.ingetec.bean.Actividades;
import app.reportes.ingetec.service.ActividadesService;

@RestController
public class ActividadesRest {
	@Autowired
	private ActividadesService service;
	
	@GetMapping("actividades/listar/{cod}")
	public ResponseEntity<List<Actividades>> listarActividadesxSegmento(@PathVariable("cod") int cod){
		return service.listarActividadesSegmento(cod);
	}
}
