package by.dk.training.items.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import by.dk.training.items.dataaccess.ProductsDao;
import by.dk.training.items.dataaccess.TypesDao;
import by.dk.training.items.datamodel.Products;
import by.dk.training.items.datamodel.Types;
import by.dk.training.items.service.ProductsService;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Inject
	private ProductsDao productsDao;
	
	@Inject
	private TypesDao typeDao;
	
	@Override
	public void register(Products products, Types type) {
		// TODO Auto-generated method stub

	}

}
