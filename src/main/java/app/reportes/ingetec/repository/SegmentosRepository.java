package app.reportes.ingetec.repository;

import java.util.List;

import app.reportes.ingetec.bean.Segmentos;

public interface SegmentosRepository {
	public List<Segmentos> listarSegmentosPorSede(int codseg);
}
