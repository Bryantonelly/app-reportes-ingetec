package app.reportes.ingetec.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import app.reportes.ingetec.bean.CantidadesEjeIntegrantes;

public class CantidadesEjeIntegrantesMapper implements RowMapper<CantidadesEjeIntegrantes>{

	@Override
	public CantidadesEjeIntegrantes mapRow(ResultSet rs, int rowNum) throws SQLException {
		CantidadesEjeIntegrantes u = new CantidadesEjeIntegrantes();
		u.setCodigoCantEjecutada(rs.getInt("codigo_cant_eje"));
		u.setCodigoIntegrante(rs.getInt("codigo_integrante"));
		return u;
	}
	
}
