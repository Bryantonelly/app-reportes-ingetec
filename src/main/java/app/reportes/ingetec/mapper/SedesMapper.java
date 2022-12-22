package app.reportes.ingetec.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import app.reportes.ingetec.bean.Sedes;

public class SedesMapper implements RowMapper<Sedes>{

	@Override
	public Sedes mapRow(ResultSet rs, int rowNum) throws SQLException {
		Sedes u = new Sedes();
		u.setCodigoSede(rs.getInt("codigo_sede"));
		u.setNombreSede(rs.getString("descripcion_sede"));
		return u;
	}
	
}
