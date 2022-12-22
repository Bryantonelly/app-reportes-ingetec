package app.reportes.ingetec.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import app.reportes.ingetec.bean.Sedes;
import app.reportes.ingetec.mapper.SedesMapper;
import app.reportes.ingetec.repository.SedesRepository;

@Repository
public class SedesRepositoryImpl implements SedesRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Sedes> listarSedes() {
		return jdbcTemplate.query("SELECT * from sedes",
		       new SedesMapper());
	}

}
