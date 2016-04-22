package by.dk.training.items.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.dk.training.items.dataaccess.UserCredentialsDao;
import by.dk.training.items.datamodel.UserCredentials;

@Repository
public class UserCredentialsDaoImpl extends AbstractDaoImpl implements UserCredentialsDao {

	@Override
	public UserCredentials get(Long id) {
		return null;
	}

	@Override
	public UserCredentials save() {
		return null;
	}

}
