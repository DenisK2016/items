package by.dk.training.items.dataaccess;

import by.dk.training.items.datamodel.Products;

public interface ProductsDao {
	Products get(Long id);

	Products save();
}
