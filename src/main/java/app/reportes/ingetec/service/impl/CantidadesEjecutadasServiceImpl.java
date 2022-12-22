package app.reportes.ingetec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import app.reportes.ingetec.bean.CantidadesEjecutadas;
import app.reportes.ingetec.repository.CantidadesEjecutadasRepository;
import app.reportes.ingetec.service.CantidadesEjecutadasService;

@Service
public class CantidadesEjecutadasServiceImpl implements CantidadesEjecutadasService{
	@Autowired
	private CantidadesEjecutadasRepository repo;
	
	@Override
	public ResponseEntity<String> insertarCantidadesEje(CantidadesEjecutadas cantieje) {
		try {
			repo.insertarCantidadesEje(cantieje);
			return new ResponseEntity<>("CREADO CORRECTAMENTE", HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(e.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
