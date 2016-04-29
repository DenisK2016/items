package by.dk.training.items.service.impl;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import by.dk.training.items.dataaccess.PackageDao;
import by.dk.training.items.dataaccess.RecipientDao;
import by.dk.training.items.dataaccess.UserDao;
import by.dk.training.items.dataaccess.filters.PackageFilter;
import by.dk.training.items.datamodel.Package;
import by.dk.training.items.service.PackageService;

@Service
public class PackageServiceImpl implements PackageService {

	@Inject
	private PackageDao packDao;
	
	@Inject
	private UserDao userDao;
	
	@Inject
	private RecipientDao recipientDao;

	@Override
	public void register(Package pack) {
		
		pack.setDate(new Date());
		packDao.insert(pack);
		recipientDao.update(pack.getIdRecipient());
		userDao.update(pack.getIdUser());		

	}

	@Override
	public Package getPackage(Long id) {
		return packDao.get(id);
	}

	@Override
	public void update(Package pack) {
		this.packDao.update(pack);

	}

	@Override
	public void delete(Long id) {
		packDao.delete(id);

	}

	@Override
	public List<Package> find(PackageFilter packageFilter) {
		return packDao.find(packageFilter);
	}

	@Override
	public List<Package> getAll() {
		return packDao.getAll();
	}

}
