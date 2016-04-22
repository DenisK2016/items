package by.dk.training.items.dataaccess;

import by.dk.training.items.datamodel.User;

public interface UserDao {
	User get(Long id);

	User save();
}
