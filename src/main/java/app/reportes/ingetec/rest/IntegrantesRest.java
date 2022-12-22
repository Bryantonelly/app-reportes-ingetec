package app.reportes.ingetec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import app.reportes.ingetec.bean.Integrantes;
import app.reportes.ingetec.service.IntegrantesService;

@RestController
public class IntegrantesRest {
	@Autowired
	private IntegrantesService service;
	
	@GetMapping("integrantes/listarxsede/{cod}")
	public ResponseEntity<List<Integrantes>> listarIntegrantesxSede(@PathVariable("cod") int cod){
		return service.listarIntegrantesSede(cod);
	}
	@GetMapping("integrantes/listarxeje/{cod}")
	public ResponseEntity<List<Integrantes>> listarIntegrantesxEje(@PathVariable("cod") int cod){
		return service.listarIntegrantesEjecucion(cod);
	}
}
