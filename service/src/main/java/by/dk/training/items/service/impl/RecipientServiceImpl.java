package by.dk.training.items.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import by.dk.training.items.dataaccess.RecipientDao;
import by.dk.training.items.dataaccess.filters.RecipientFilter;
import by.dk.training.items.datamodel.Recipient;
import by.dk.training.items.service.RecipientService;

@Service
public class RecipientServiceImpl implements RecipientService {

	@Inject
	private RecipientDao recipientDao;

	@Override
	public void register(Recipient recipient) {
		recipientDao.insert(recipient);

	}

	@Override
	public Recipient getRecipient(Long id) {
		return recipientDao.get(id);
	}

	@Override
	public void update(Recipient recipient) {
		recipientDao.update(recipient);

	}

	@Override
	public void delete(Long id) {
		recipientDao.delete(id);

	}

	@Override
	public List<Recipient> find(RecipientFilter recipientFilter) {
		return recipientDao.find(recipientFilter);
	}

	@Override
	public List<Recipient> getAll() {
		return recipientDao.getAll();
	}

}
