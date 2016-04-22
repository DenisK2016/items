package by.dk.training.items.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import by.dk.training.items.dataaccess.UserCredentialsDao;
import by.dk.training.items.dataaccess.UserDao;
import by.dk.training.items.datamodel.User;
import by.dk.training.items.datamodel.UserCredentials;
import by.dk.training.items.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Inject
	private UserDao userDao;
	@Inject
	private UserCredentialsDao userCredentialsDao;

	@Override
	public void register(User user, UserCredentials userCredentials) {
		// TODO Auto-generated method stub

	}

}
