package by.dk.training.items.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import by.dk.training.items.dataaccess.UserCredentialsDao;
import by.dk.training.items.dataaccess.UserDao;
import by.dk.training.items.dataaccess.filters.UserCredentialsFilter;
import by.dk.training.items.dataaccess.filters.UserFilter;
import by.dk.training.items.datamodel.StatusUser;
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

		userCredentials.setCreated(new SimpleDateFormat("dd MMMM yyyy").format(new Date()));
		userCredentials.setStatus(StatusUser.OFFICER);
		userCredentials.setUser(user);
		user.setUserCredentials(userCredentials);

		userCredentialsDao.insert(userCredentials);
		userDao.insert(user);
	}

	@Override
	public User getUser(Long id) {
		return userDao.get(id);
	}

	@Override
	public UserCredentials getUserCredentials(Long id) {
		return userCredentialsDao.get(id);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void update(UserCredentials userCredentials) {
		userCredentialsDao.update(userCredentials);
	}

	@Override
	public void delete(Long id) {
		userDao.delete(id);
		userCredentialsDao.delete(id);

	}

	@Override
	public List<User> find(UserFilter userFilter) {

		return userDao.find(userFilter);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public List<UserCredentials> find(UserCredentialsFilter credentialsFilter) {
		return userCredentialsDao.find(credentialsFilter);
	}

}
