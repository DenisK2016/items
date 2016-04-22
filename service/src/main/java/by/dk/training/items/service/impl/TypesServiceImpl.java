package by.dk.training.items.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import by.dk.training.items.dataaccess.TypesDao;
import by.dk.training.items.datamodel.Types;
import by.dk.training.items.service.TypesService;

@Service
public class TypesServiceImpl implements TypesService {

	@Inject
	private TypesDao typeDao;

	@Override
	public void register(Types type) {
		// TODO Auto-generated method stub

	}

}
