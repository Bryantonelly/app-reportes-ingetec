package app.reportes.ingetec.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import app.reportes.ingetec.bean.CantidadesEjecutadas;
import app.reportes.ingetec.repository.CantidadesEjecutadasRepository;

@Repository
public class CantidadesEjecutadasRepositoryImpl implements CantidadesEjecutadasRepository{
	@Autowired
	JdbcTemplate jdbcTemplate;

	private SimpleJdbcCall simpleJdbcCall;

	@Override
	public int insertarCantidadesEje(CantidadesEjecutadas cantieje) {
//		return jdbcTemplate.update("INSERT INTO cantidades_ejecutadas (fecha_cant_eje, cantidad_urbrural_eje, codigo_act, cantidad_urbano_eje, cantidad_rural_eje) VALUES (?, ?, ?, ?, ?)",
//				new Object[] { cantieje.getFechaEjecucion(), cantieje.getCantidadUrbRural(), cantieje.getCodigoActividad(), cantieje.getCantidadUrbano(), cantieje.getCantidadRural()});
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("sp_InsertarCantidadesEjecutadas");
		/*.declareParameters(
			            new SqlParameter("order_by", Types.NVARCHAR),
			            new SqlParameter("direction", Types.VARCHAR),
			            new SqlParameter("limit_", Types.INTEGER),
			            new SqlParameter("offset_", Types.INTEGER),
			            new SqlOutParameter("total", Types.INTEGER));*/
		SqlParameterSource inputParameters = new MapSqlParameterSource()
				.addValue("i_codigo_act", cantieje.getCodigoActividad())
				.addValue("i_cantidad_urbrural_eje", cantieje.getCantidadUrbRural())
				.addValue("i_cantidad_urbano_eje", cantieje.getCantidadUrbano())
				.addValue("i_fecha_cant_eje", cantieje.getFechaEjecucion())
				.addValue("i_cantidad_rural_eje", cantieje.getCantidadRural());
		
		simpleJdbcCall.execute(inputParameters);
		return 1;			     
	}
	
}
