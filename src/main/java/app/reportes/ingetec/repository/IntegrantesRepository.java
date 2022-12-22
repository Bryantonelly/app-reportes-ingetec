package app.reportes.ingetec.repository;

import java.util.List;

import app.reportes.ingetec.bean.Integrantes;

public interface IntegrantesRepository {
	public List<Integrantes> listarIntegrantesSede(int codsede);
	public List<Integrantes> listarIntegrantesEjecucion(int codeje);
}
