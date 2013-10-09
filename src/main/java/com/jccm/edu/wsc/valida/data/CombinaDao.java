package com.jccm.edu.wsc.valida.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jccm.edu.wsc.valida.model.Persona;

@Service
public class CombinaDao {

	@Autowired
	DelphosPersonaDao delphosDao;

	@Autowired
	SecVirPersonaDao secvirDao;

	@Transactional
	public void distribuida() {
		System.out.println("Inicio transaccion");
		delphos();
		secvir();
		System.out.println("Fin transaccion");
	}

	@Transactional
	public void delphos() {

		String sql = "INSERT INTO Z_PROVINCIA VALUES (50,'PERNAMBUCO')";
		int res = delphosDao.modificar(sql);
		System.out.println("Resultado operacion: " + res);
	}

	@Transactional
	public void secvir() {

		Persona persona = new Persona();
		persona.setApellido1("Apellido1");
		persona.setApellido2("Apellido2");
		persona.setNombre("Jose Miguel");
		persona.setDnie("87654321X");
		persona.setFeccad("12/12/12");
		persona.setFecnac("01/01/85");
		persona.setLocnac("Madrid");
		persona.setLocres("Toledo");
		persona.setMadre("no");
		persona.setMensaje("Mi Mensaje");
		secvirDao.save(persona);

		Persona p = secvirDao.findAlumnosByNif("87654321X");
		System.out.println("Persona: " + p.getApellido1());

	}
}
