package app.reportes.ingetec.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import app.reportes.ingetec.bean.Actividades;
import app.reportes.ingetec.repository.ActividadRepository;
import app.reportes.ingetec.service.ActividadesService;

@Service
public class ActividadesServiceImpl implements ActividadesService{
	@Autowired
	private ActividadRepository repo;
	
	@Override
	public ResponseEntity<List<Actividades>> listarActividadesSegmento(int codsegmento) {
		try {
			Integer i = Integer.valueOf(codsegmento);
			List<Actividades> actividades = new ArrayList<>();
			if(i == null) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}else{
				actividades = repo.listarActividadesSegmento(codsegmento);
				return new ResponseEntity<>(actividades, HttpStatus.OK);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
