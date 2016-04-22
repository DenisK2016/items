package by.dk.training.items.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.dk.training.items.dataaccess.RecipientDao;
import by.dk.training.items.datamodel.Recipient;

@Repository
public class RecipientDaoImpl extends AbstractDaoImpl implements RecipientDao {

	@Override
	public Recipient get(Long id) {
		return null;
	}

	@Override
	public Recipient save() {
		return null;
	}

}
