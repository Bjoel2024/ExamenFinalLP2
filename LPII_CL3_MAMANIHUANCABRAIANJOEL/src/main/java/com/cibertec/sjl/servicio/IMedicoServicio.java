package com.cibertec.sjl.servicio;

import java.util.List;

import com.cibertec.sjl.modelo.Medico;

public interface IMedicoServicio {

	public void RegistrarMedico(Medico med);
	public void EliminarMedico(Integer id);
	public Medico buscarXid(Integer id);
	public List<Medico>ListadoMedicos();
	
}
