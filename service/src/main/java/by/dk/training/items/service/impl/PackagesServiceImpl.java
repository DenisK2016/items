package by.dk.training.items.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import by.dk.training.items.dataaccess.PackagesDao;
import by.dk.training.items.dataaccess.ProductsDao;
import by.dk.training.items.datamodel.Packages;
import by.dk.training.items.datamodel.Products;
import by.dk.training.items.service.PackagesService;

@Service
public class PackagesServiceImpl implements PackagesService {
	
	@Inject
	private PackagesDao pack;
	
	@Inject
	private ProductsDao products;

	@Override
	public void register(Packages pack, Products products) {
		// TODO Auto-generated method stub

	}

}
