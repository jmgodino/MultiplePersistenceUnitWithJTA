package com.jccm.edu.wsc.valida.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class DelphosPersonaDao {

	@PersistenceContext(unitName = "DelphosPersistenceUnit")
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Transactional
	public List<String> getListFromSql(String sql) {
		Query query = entityManager.createNativeQuery(sql);
		List<String> resultList = query.getResultList();
		return resultList;
	}

	@Transactional
	public int modificar(String sql) {
		Query query = entityManager.createNativeQuery(sql);
		return query.executeUpdate();

	}

}
