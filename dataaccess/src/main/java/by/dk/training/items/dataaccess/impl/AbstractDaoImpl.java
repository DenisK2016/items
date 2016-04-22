package by.dk.training.items.dataaccess.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AbstractDaoImpl {
	@PersistenceContext
	private EntityManager entityManager;

}
