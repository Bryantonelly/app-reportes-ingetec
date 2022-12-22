package app.reportes.ingetec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.reportes.ingetec.bean.CantEjeRequest;
import app.reportes.ingetec.bean.Integrantes;
import app.reportes.ingetec.service.CantidadesEjeInteService;
import app.reportes.ingetec.service.CantidadesEjecutadasService;

@RestController
public class CantidadesEjecutadasRest {
	@Autowired
	private CantidadesEjecutadasService service;
	
	@Autowired
	private CantidadesEjeInteService service2;
	
	@PostMapping("ejecutadas/insertar")
	public ResponseEntity<String> insertarCantidadesEje(@RequestBody CantEjeRequest cantieje) {
//		service.insertarCantidadesEje(cantieje); 
		try {
			service.insertarCantidadesEje(cantieje);
			
			List<Integrantes> integrantes = cantieje.getIntegrantes();
			System.out.println("integrantes"+ cantieje.getIntegrantes());
			integrantes.forEach(i -> {
				System.out.println("codigo integrante: " + i.getCodigoIntegrante());
				service2.insertarIntegrantesCantidades(i.getCodigoIntegrante());		
			});	
			return new ResponseEntity<>("CORRECTO",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	};
}
