package app.reportes.ingetec.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import app.reportes.ingetec.bean.Reporte;

public class ReporteMapper implements RowMapper<Reporte>{

	@Override
	public Reporte mapRow(ResultSet rs, int rowNum) throws SQLException {
		Reporte u = new Reporte();
		u.setNombreSegmento(rs.getString("descripcion_seg"));
		u.setCodigoActividades(rs.getInt("codigo_act"));
		u.setDescripcionActividad(rs.getString("descripcion_act"));
		u.setUnidadActividad(rs.getString("unidad_act"));
		u.setPartidaActividad(rs.getString("partida_act"));
		u.setNombreSede(rs.getString("descripcion_sede"));
		u.setFechaEjecucion(rs.getDate("fecha_cant_eje"));
		u.setPrecioUniUrbano(rs.getDouble("pre_uni_urbano_act"));
		u.setCantidadUrbano(rs.getInt("cantidad_urbano_eje"));
		u.setPrecioUniRural(rs.getDouble("pre_uni_rural_act"));
		u.setCantidadRural(rs.getInt("cantidad_rural_eje"));
		u.setPrecioUniUrbRural(rs.getDouble("pre_uni_ruralUrbano_act"));
		u.setCantidadUrbRural(rs.getInt("cantidad_urbrural_eje"));
//		u.setIntegrantes(rs.getString(rowNum));
		return u;
	}

}
