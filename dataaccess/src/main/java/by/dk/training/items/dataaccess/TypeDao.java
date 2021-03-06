package by.dk.training.items.dataaccess;

import java.util.List;

import by.dk.training.items.dataaccess.filters.TypeFilter;
import by.dk.training.items.datamodel.Type;

public interface TypeDao extends AbstractDao<Type, Long> {
	List<Type> find(TypeFilter filter);
}
