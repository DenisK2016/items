package by.dk.training.items.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import by.dk.training.items.dataaccess.RecipientDao;
import by.dk.training.items.datamodel.Recipient;
import by.dk.training.items.service.RecipientService;

@Service
public class RecipientServiceImpl implements RecipientService {

	@Inject
	private RecipientDao recipientDao;

	@Override
	public void register(Recipient recipient) {
		// TODO Auto-generated method stub

	}

}
