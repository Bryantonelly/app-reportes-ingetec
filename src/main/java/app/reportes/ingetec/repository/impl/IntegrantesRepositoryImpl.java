package app.reportes.ingetec.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import app.reportes.ingetec.bean.Integrantes;
import app.reportes.ingetec.mapper.IntegrantesMapper;
import app.reportes.ingetec.repository.IntegrantesRepository;

@Repository
public class IntegrantesRepositoryImpl implements IntegrantesRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Integrantes> listarIntegrantesSede(int codsede) {
		return jdbcTemplate.query("select codigo_integrante, codigo_sede, nombres_integrante, apellidos_integrante from integrantes where codigo_sede = " + codsede,
			       new IntegrantesMapper());
	}

	@Override
	public List<Integrantes> listarIntegrantesEjecucion(int codeje) {
		return jdbcTemplate.query("select inte.codigo_integrante , inte.codigo_sede ,inte.nombres_integrante, inte.apellidos_integrante from cantidades_ejecutadas c inner join integrantes_cantidades i on i.codigo_cant_eje = c.codigo_cant_eje inner join integrantes inte on inte.codigo_integrante = i.codigo_integrante where c.codigo_cant_eje = " + codeje, new IntegrantesMapper());
	}

}
