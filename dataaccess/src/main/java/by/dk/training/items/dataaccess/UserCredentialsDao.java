package by.dk.training.items.dataaccess;

import java.util.List;

import by.dk.training.items.dataaccess.filters.UserCredentialsFilter;
import by.dk.training.items.datamodel.UserCredentials;

public interface UserCredentialsDao extends AbstractDao<UserCredentials, Long> {
	
	public List<UserCredentials> find(UserCredentialsFilter filter);
}
