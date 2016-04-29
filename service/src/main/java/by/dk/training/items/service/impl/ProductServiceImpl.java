package by.dk.training.items.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import by.dk.training.items.dataaccess.ProductDao;
import by.dk.training.items.dataaccess.filters.ProductFilter;
import by.dk.training.items.datamodel.Product;
import by.dk.training.items.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Inject
	private ProductDao productDao;

	@Override
	public void register(Product products) {
		productDao.insert(products);

	}

	@Override
	public Product get(Long id) {
		return productDao.get(id);
	}

	@Override
	public void update(Product products) {
		productDao.update(products);

	}

	@Override
	public void delete(Long id) {
		productDao.delete(id);

	}

	@Override
	public List<Product> find(ProductFilter productsFilter) {
		return productDao.find(productsFilter);
	}

	@Override
	public List<Product> getAll() {
		return productDao.getAll();
	}

}
