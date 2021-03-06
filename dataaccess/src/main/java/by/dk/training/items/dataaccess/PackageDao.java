package by.dk.training.items.dataaccess;

import java.util.List;

import by.dk.training.items.dataaccess.filters.PackageFilter;
import by.dk.training.items.datamodel.Package;

public interface PackageDao extends AbstractDao<Package, Long>{
	
	List<Package> find(PackageFilter filter);
	
}
