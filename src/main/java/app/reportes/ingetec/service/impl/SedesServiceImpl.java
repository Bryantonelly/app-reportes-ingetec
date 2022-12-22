package app.reportes.ingetec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import app.reportes.ingetec.bean.Sedes;
import app.reportes.ingetec.repository.SedesRepository;
import app.reportes.ingetec.service.SedesService;

@Service
public class SedesServiceImpl implements SedesService{

	@Autowired
	private SedesRepository repo;
	
	@Override
	public ResponseEntity<List<Sedes>> listarSedes() {
		try {
			List<Sedes> sedes = repo.listarSedes();
			if(sedes.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);				
			}
			return new ResponseEntity<>(sedes, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
