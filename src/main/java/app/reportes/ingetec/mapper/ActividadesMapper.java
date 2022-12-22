package app.reportes.ingetec.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import app.reportes.ingetec.bean.Actividades;

public class ActividadesMapper implements RowMapper<Actividades>{

	@Override
	public Actividades mapRow(ResultSet rs, int rowNum) throws SQLException {
		Actividades u = new Actividades();
		u.setCodigoActividad(rs.getInt("codigo_act"));
		u.setCodigoSegmento(rs.getInt("codigo_seg"));
		u.setDescripcionActividad(rs.getString("descripcion_act"));
		u.setEstadoActividad(rs.getBoolean("estado_act"));
		u.setPartidaActividad(rs.getString("partida_act"));
		u.setUnidadActividad(rs.getString("unidad_act"));  
		u.setPrecioUniUrbano(rs.getDouble("pre_uni_urbano_act"));
		u.setPrecioUniUrbano(rs.getDouble("pre_uni_rural_act")) ;
		u.setPrecioUniUrbano(rs.getDouble("pre_uni_ruralUrbano_act"));
		return u;
	}

}
