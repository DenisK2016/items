package by.dk.training.items.dataaccess;

import by.dk.training.items.datamodel.Recipient;

public interface RecipientDao {
	Recipient get(Long id);

	Recipient save();
}
