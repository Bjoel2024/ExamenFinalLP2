package com.cibertec.sjl.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.sjl.modelo.Medico;
import com.cibertec.sjl.repositorio.IMedicoRepositorio;

@Service
public class MedicoServicioImp implements IMedicoServicio{

	@Autowired
	private IMedicoRepositorio imr;

	@Override
	public void RegistrarMedico(Medico med) {
		
		imr.save(med);
	}

	@Override
	public void EliminarMedico(Integer id) {
		imr.deleteById(id);
	}

	@Override
	public Medico buscarXid(Integer id) {
		return imr.findById(id).orElse(null);
	}

	@Override
	public List<Medico> ListadoMedicos() {
		return (List<Medico>)
				imr.findAll();
	}
	
	

}
