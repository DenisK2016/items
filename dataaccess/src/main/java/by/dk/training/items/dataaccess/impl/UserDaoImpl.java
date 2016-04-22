package by.dk.training.items.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.dk.training.items.dataaccess.UserDao;
import by.dk.training.items.datamodel.User;

@Repository
public class UserDaoImpl extends AbstractDaoImpl implements UserDao {

	@Override
	public User get(Long id) {
		return null;
	}

	@Override
	public User save() {
		return null;
	}

}
