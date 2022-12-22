package app.reportes.ingetec.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import app.reportes.ingetec.bean.CantidadesEjecutadas;

public class CantidadesEjecutadasMapper implements RowMapper<CantidadesEjecutadas>{

	@Override
	public CantidadesEjecutadas mapRow(ResultSet rs, int rowNum) throws SQLException {
		CantidadesEjecutadas u = new CantidadesEjecutadas();
		u.setCodigoCantEjecutada(rs.getInt("codigo_cant_eje"));
		u.setCantidadRural(rs.getInt("cantidad_rural_eje"));
		u.setCantidadUrbano(rs.getInt("cantidad_urbano_eje"));
		u.setCantidadUrbRural(rs.getInt("cantidad_urbrural_eje"));
		u.setCodigoActividad(rs.getInt("codigo_act"));
		u.setFechaEjecucion(rs.getDate("fecha_cant_eje"));
		u.setNombreActividad(rs.getString("descripcion_act"));
		return u;
	}

}
