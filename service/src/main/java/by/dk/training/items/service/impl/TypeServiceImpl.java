package by.dk.training.items.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import by.dk.training.items.dataaccess.TypeDao;
import by.dk.training.items.dataaccess.filters.TypeFilter;
import by.dk.training.items.datamodel.Type;
import by.dk.training.items.service.TypeService;

@Service
public class TypeServiceImpl implements TypeService {

	private static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	@Inject
	private TypeDao typeDao;

	@Override
	public void register(Type type) {
		typeDao.insert(type);
		
		LOGGER.info("Type register: {}", type);
	}

	@Override
	public Type get(Long id) {
		
		LOGGER.info("Type select: {}", typeDao.get(id));
		
		return typeDao.get(id);
	}

	@Override
	public void update(Type type) {
		
		LOGGER.info("Type update, new and old: {}", type, typeDao.get(type.getId()));
		
		typeDao.update(type);

	}

	@Override
	public void delete(Long id) {
		
		LOGGER.info("Type delete: {}", typeDao.get(id));
		
		List<Type> types = getAll();
		for (Type t : types) {
			Type parT = t.getParentType();
			if (parT != null && parT.getId() == id) {
				t.setParentType(null);
			}
		}
		typeDao.delete(id);

	}

	@Override
	public List<Type> find(TypeFilter typeFilter) {
		
		LOGGER.info("Type find by filter: {}", typeFilter);
		
		return typeDao.find(typeFilter);
	}

	@Override
	public List<Type> getAll() {
		
		LOGGER.info("Type getAll: {}", "All Types");
		
		return typeDao.getAll();
	}

}
