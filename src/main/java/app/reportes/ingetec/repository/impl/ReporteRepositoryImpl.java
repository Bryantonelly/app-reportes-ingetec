package app.reportes.ingetec.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import app.reportes.ingetec.bean.Reporte;
import app.reportes.ingetec.mapper.ReporteMapper;
import app.reportes.ingetec.repository.ReporteRepository;

@Repository
public class ReporteRepositoryImpl implements ReporteRepository{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Reporte> listarReporte() {
		return jdbcTemplate.query("select seg.descripcion_seg, act.codigo_act, act.descripcion_act, act.unidad_act, act.partida_act, "
				+ "sedes.descripcion_sede, can.fecha_cant_eje, act.pre_uni_urbano_act, can.cantidad_urbano_eje, act.pre_uni_rural_act, can.cantidad_rural_eje, act.pre_uni_ruralUrbano_act, "
				+ "can.cantidad_urbrural_eje from actividades act "
				+ "inner join segmentos seg on seg.codigo_seg = act.codigo_seg "
				+ "inner join sede_segmento sed on sed.codigo_seg = seg.codigo_seg "
				+ "inner join sedes on sedes.codigo_sede = sed.codigo_sede "
				+ "inner join cantidades_ejecutadas can on can.codigo_act = act.codigo_act ", new ReporteMapper());
	}

}
