package by.dk.training.items.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.dk.training.items.dataaccess.PackagesDao;

@Repository
public class PackagesDaoImpl extends AbstractDaoImpl implements PackagesDao {

	@Override
	public Package get(Long trackingCode) {
		return null;
	}

	@Override
	public Package save() {
		return null;
	}

}
