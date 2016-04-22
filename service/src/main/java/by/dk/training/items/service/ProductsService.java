package by.dk.training.items.service;


import by.dk.training.items.datamodel.Products;
import by.dk.training.items.datamodel.Types;

public interface ProductsService {
	void register(Products products, Types type);
}
