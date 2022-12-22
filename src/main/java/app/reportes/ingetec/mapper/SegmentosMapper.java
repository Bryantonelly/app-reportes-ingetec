package app.reportes.ingetec.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import app.reportes.ingetec.bean.Segmentos;

public class SegmentosMapper implements RowMapper<Segmentos>{

	@Override
	public Segmentos mapRow(ResultSet rs, int rowNum) throws SQLException {
		Segmentos u = new Segmentos();
		u.setCodigoSegmento(rs.getInt("codigo_seg"));
		u.setNombreSegmento(rs.getString("descripcion_seg"));
		u.setEstadoSegmento(rs.getBoolean("estado_seg"));
		return u;
	}

}
