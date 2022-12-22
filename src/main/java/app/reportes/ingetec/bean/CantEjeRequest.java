package app.reportes.ingetec.bean;

import java.util.List;

public class CantEjeRequest extends CantidadesEjecutadas{
	private List<Integrantes> integrantes;

	public List<Integrantes> getIntegrantes() {
		return integrantes;
	}
	public void setIntegrantes(List<Integrantes> integrantes) {
		this.integrantes = integrantes;
	}  
}
