package app.reportes.ingetec.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import app.reportes.ingetec.repository.CantidadesEjeInteRepository;

@Repository
public class CantidadesEjeInteRepositoryImpl implements CantidadesEjeInteRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insertarIntegrantesCantidades(int request) {
		return jdbcTemplate.update("insert into integrantes_cantidades(codigo_cant_eje, codigo_integrante) values(LAST_INSERT_ID(), ? )", new Object[] {request});
	}
	
}
