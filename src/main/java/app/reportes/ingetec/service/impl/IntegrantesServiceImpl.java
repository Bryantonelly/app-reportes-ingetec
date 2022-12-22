package app.reportes.ingetec.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import app.reportes.ingetec.bean.Integrantes;
import app.reportes.ingetec.repository.IntegrantesRepository;
import app.reportes.ingetec.service.IntegrantesService;

@Service
public class IntegrantesServiceImpl implements IntegrantesService{
	@Autowired
	private IntegrantesRepository repo;
	
	@Override
	public ResponseEntity<List<Integrantes>> listarIntegrantesSede(int codsede) {
		try {
			List<Integrantes> integrantes = new ArrayList<>();
			Integer i = Integer.valueOf(codsede);
			if(i == null) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}else{
				integrantes = repo.listarIntegrantesSede(codsede);
				return new ResponseEntity<>(integrantes, HttpStatus.OK);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<Integrantes>> listarIntegrantesEjecucion(int codeje) {
		try {
			List<Integrantes> integrantes = new ArrayList<>();
			Integer i = Integer.valueOf(codeje);
			if(i == null) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}else{
				integrantes = repo.listarIntegrantesEjecucion(codeje);
				return new ResponseEntity<>(integrantes, HttpStatus.OK);
			}
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
