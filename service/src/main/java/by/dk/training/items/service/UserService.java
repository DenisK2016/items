package by.dk.training.items.service;

import by.dk.training.items.datamodel.User;
import by.dk.training.items.datamodel.UserCredentials;

public interface UserService {
	 void register(User user, UserCredentials userCredentials);
}
