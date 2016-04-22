package by.dk.training.items.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.dk.training.items.dataaccess.ProductsDao;
import by.dk.training.items.datamodel.Products;

@Repository
public class ProductsDaoImpl extends AbstractDaoImpl implements ProductsDao {

	@Override
	public Products get(Long id) {
		return null;
	}

	@Override
	public Products save() {
		return null;
	}

}
