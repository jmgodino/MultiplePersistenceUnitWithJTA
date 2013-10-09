package com.jccm.edu.wsc.valida.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jccm.edu.wsc.valida.model.Persona;

@Repository
public class SecVirPersonaDao {

	@PersistenceContext(unitName = "SecVirPersistenceUnit")
	private EntityManager entityManager;

	@Transactional
	public void save(Persona persona) {
		entityManager.merge(persona);
	}

	public Persona findAlumnosByNif(String nif) {
		return entityManager.find(Persona.class, nif);
	}

}
