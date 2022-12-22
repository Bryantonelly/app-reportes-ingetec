package app.reportes.ingetec.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import app.reportes.ingetec.bean.Actividades;
import app.reportes.ingetec.mapper.ActividadesMapper;
import app.reportes.ingetec.repository.ActividadRepository;

@Repository
public class ActividadRepositoryImpl implements ActividadRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Actividades> listarActividadesSegmento(int codsegmento) {
		return jdbcTemplate.query("select codigo_act , descripcion_act , estado_act , unidad_act , codigo_seg , partida_act , pre_uni_urbano_act , pre_uni_rural_act , pre_uni_ruralUrbano_act from actividades where codigo_seg = " + codsegmento, 
				new ActividadesMapper());
	}

}
