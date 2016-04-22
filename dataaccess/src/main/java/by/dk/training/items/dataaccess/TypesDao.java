package by.dk.training.items.dataaccess;

import by.dk.training.items.datamodel.Types;

public interface TypesDao {
	Types get(Long id);

	Types save();
}
