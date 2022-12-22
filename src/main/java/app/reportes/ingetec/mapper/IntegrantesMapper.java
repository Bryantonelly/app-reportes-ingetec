package app.reportes.ingetec.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import app.reportes.ingetec.bean.Integrantes;

public class IntegrantesMapper implements RowMapper<Integrantes> {

	@Override
	public Integrantes mapRow(ResultSet rs, int rowNum) throws SQLException {
		Integrantes u = new Integrantes();
		u.setCodigoIntegrante(rs.getInt("codigo_integrante"));
		u.setNombresIntegrante(rs.getString("nombres_integrante"));
		u.setApellidosIntegrante(rs.getString("apellidos_integrante"));
		u.setCodigoSede(rs.getInt("codigo_sede"));
		return u;
	}

}
