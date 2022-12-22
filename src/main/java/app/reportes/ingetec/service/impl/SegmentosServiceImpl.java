package app.reportes.ingetec.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import app.reportes.ingetec.bean.Segmentos;
import app.reportes.ingetec.repository.SegmentosRepository;
import app.reportes.ingetec.service.SegmentosService;

@Service
public class SegmentosServiceImpl implements SegmentosService{
	@Autowired
	private SegmentosRepository repo;
	@Override
	public ResponseEntity<List<Segmentos>> listarSegmentosPorSede(int codseg) {
		try {
			List<Segmentos> segmentos = new ArrayList<>();
			Integer i = Integer.valueOf(codseg);
			if(i == null) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}else{
				segmentos = repo.listarSegmentosPorSede(codseg);
				return new ResponseEntity<>(segmentos, HttpStatus.OK);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
