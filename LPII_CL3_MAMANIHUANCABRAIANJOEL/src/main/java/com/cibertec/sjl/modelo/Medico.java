package com.cibertec.sjl.modelo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="MEDICO")
public class Medico {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int IDMEDICO;
	private String NOMBRE;
	private String APELLIDO;
	private String EMAIL;
	private String DNI;
	private String ESTADOCIVIL;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso=ISO.DATE)
	private Date FECHANACIMIENTO;
	
	
	
	
	public Medico() {
	}




	public Medico(int iDMEDICO, String nOMBRE, String aPELLIDO, String eMAIL, String dNI, String eSTADOCIVIL,
			Date fECHANACIMIENTO) {
		IDMEDICO = iDMEDICO;
		NOMBRE = nOMBRE;
		APELLIDO = aPELLIDO;
		EMAIL = eMAIL;
		DNI = dNI;
		ESTADOCIVIL = eSTADOCIVIL;
		FECHANACIMIENTO = fECHANACIMIENTO;
	}



	public int getIDMEDICO() {
		return IDMEDICO;
	}
	public void setIDMEDICO(int iDMEDICO) {
		IDMEDICO = iDMEDICO;
	}
	public String getNOMBRE() {
		return NOMBRE;
	}
	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}
	public String getAPELLIDO() {
		return APELLIDO;
	}
	public void setAPELLIDO(String aPELLIDO) {
		APELLIDO = aPELLIDO;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getESTADOCIVIL() {
		return ESTADOCIVIL;
	}
	public void setESTADOCIVIL(String eSTADOCIVIL) {
		ESTADOCIVIL = eSTADOCIVIL;
	}
	public Date getFECHANACIMIENTO() {
		return FECHANACIMIENTO;
	}
	public void setFECHANACIMIENTO(Date fECHANACIMIENTO) {
		FECHANACIMIENTO = fECHANACIMIENTO;
	}
	
	
	
}
