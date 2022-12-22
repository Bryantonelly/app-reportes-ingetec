package app.reportes.ingetec.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import app.reportes.ingetec.bean.Reporte;
import app.reportes.ingetec.repository.ReporteRepository;
import app.reportes.ingetec.service.ReporteService;

@Service
public class ReporteServiceImpl implements ReporteService{
	@Autowired
	private ReporteRepository repo;
	
	@Override
	public ResponseEntity<List<Reporte>> listarReporte() {
		try {
			List<Reporte> reporte = new ArrayList<>();
			reporte = repo.listarReporte();
			return new ResponseEntity<>(reporte, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
