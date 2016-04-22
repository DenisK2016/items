package by.dk.training.items.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.dk.training.items.dataaccess.TypesDao;
import by.dk.training.items.datamodel.Types;

@Repository
public class TypesDaoImpl extends AbstractDaoImpl implements TypesDao {

	@Override
	public Types get(Long id) {
		return null;
	}

	@Override
	public Types save() {
		return null;
	}

}
