package by.dk.training.items.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import by.dk.training.items.dataaccess.TypeDao;
import by.dk.training.items.dataaccess.filters.TypeFilter;
import by.dk.training.items.datamodel.Type;
import by.dk.training.items.service.TypeService;

@Service
public class TypeServiceImpl implements TypeService {

	@Inject
	private TypeDao typeDao;

	@Override
	public void register(Type type) {
		typeDao.insert(type);

	}

	@Override
	public Type get(Long id) {
		return typeDao.get(id);
	}

	@Override
	public void update(Type type) {
		typeDao.update(type);

	}

	@Override
	public void delete(Long id) {
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
		return typeDao.find(typeFilter);
	}

	@Override
	public List<Type> getAll() {
		return typeDao.getAll();
	}

}
