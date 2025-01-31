package com.cibertec.sjl.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.sjl.modelo.Medico;
import com.cibertec.sjl.servicio.IMedicoServicio;

@Controller
@RequestMapping("/Vistas")
public class MedicoController {

	
	@Autowired
	private IMedicoServicio iMedSer;
	
	@GetMapping("ListadoMedicos")
	public String ListadoProducto(Model modelo) {
		List<Medico>listado=iMedSer.ListadoMedicos();
		modelo.addAttribute("listado",listado);
		return "/Vistas/ListadoMedicos";
	}

	@GetMapping("/RegistrarMedico")
	public String RegistrarMedico(Model modelo) {
		Medico clMedico = new Medico();
		modelo.addAttribute("regMedico",clMedico);
		return "/Vistas/RegistrarMedico";
	}
	
	
	@PostMapping("/GuardarMedico")
	public String GuardarMedico(@ModelAttribute Medico clmed, Model modelol) {
		iMedSer.RegistrarMedico(clmed);
		System.out.println("Dato de Medico registrado");
		return "redirect:/Vistas/ListadoMedicos";
	}
	
	@GetMapping("/editarMedico/{id}")
	public String Editar(@PathVariable("id") Integer idmedico, Model modelo) {
		Medico clMedico=iMedSer.buscarXid(idmedico);
		modelo.addAttribute("regMedico",clMedico);
		return "/Vistas/RegistrarMedico";
	}
	
	
	@GetMapping("/eliminarMedico/{id}")
	public String Eliminar(@PathVariable("id") Integer idmedico, Model modelo) {
		iMedSer.EliminarMedico(idmedico);
		List<Medico>listado=iMedSer.ListadoMedicos();
		modelo.addAttribute("listado",listado);
		return "redirect:/Vistas/ListadoMedicos";
	}
	
	
}
