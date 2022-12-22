package app.reportes.ingetec.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import app.reportes.ingetec.bean.Segmentos;
import app.reportes.ingetec.mapper.SegmentosMapper;
import app.reportes.ingetec.repository.SegmentosRepository;

@Repository
public class SegmentosRepositoryImpl implements SegmentosRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Segmentos> listarSegmentosPorSede(int codseg) {
		return jdbcTemplate.query("SELECT s.codigo_seg,s.descripcion_seg,s.estado_seg from segmentos s\r\n"
				+ "inner join sede_segmento ss on ss.codigo_seg = s.codigo_seg\r\n"
				+ "where ss.codigo_sede = " + codseg, new SegmentosMapper());
	}
}
