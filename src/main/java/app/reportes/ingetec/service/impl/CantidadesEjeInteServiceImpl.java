package app.reportes.ingetec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import app.reportes.ingetec.repository.CantidadesEjeInteRepository;
import app.reportes.ingetec.service.CantidadesEjeInteService;

@Service
public class CantidadesEjeInteServiceImpl implements CantidadesEjeInteService{
	@Autowired
	private CantidadesEjeInteRepository repo;
	
	@Override
	public ResponseEntity<String> insertarIntegrantesCantidades(int request) {
		try {
			repo.insertarIntegrantesCantidades(request);
			return new ResponseEntity<>("CREACION EXITOSA", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
