package by.dk.training.items.dataaccess.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.jpa.criteria.OrderImpl;
import org.springframework.stereotype.Repository;

import by.dk.training.items.dataaccess.RecipientDao;
import by.dk.training.items.dataaccess.filters.RecipientFilter;
import by.dk.training.items.datamodel.Recipient;
import by.dk.training.items.datamodel.Recipient_;

@Repository
public class RecipientDaoImpl extends AbstractDaoImpl<Recipient, Long> implements RecipientDao {

	protected RecipientDaoImpl() {
		super(Recipient.class);
	}

	@Override
	public List<Recipient> find(RecipientFilter filter) {
		EntityManager em = getEntityManager();

		CriteriaBuilder cb = em.getCriteriaBuilder();

		CriteriaQuery<Recipient> cq = cb.createQuery(Recipient.class);

		Root<Recipient> from = cq.from(Recipient.class); // SELECT .. FROM ...

		cq.select(from); // Указывает что селектать SELECT *. from - это
							// таблица,
							// а from.get... - это конкретная колонка

		if (filter.getName() != null) {
			Predicate NameEqualCondition = cb.equal(from.get(Recipient_.name), filter.getName());
			cq.where(NameEqualCondition);
		}
		if (filter.getCity() != null) {
			Predicate cityEqualCondition = cb.equal(from.get(Recipient_.city), filter.getCity());
			cq.where(cityEqualCondition);
		}
		if (filter.getAddress() != null) {
			Predicate addressEqualCondition = cb.equal(from.get(Recipient_.address), filter.getAddress());
			cq.where(addressEqualCondition);
		}

		// set fetching
		if (filter.isFetchPackages()) {
			from.fetch(Recipient_.packages, JoinType.LEFT);
		}

		// set sort params
		if (filter.getSortProperty() != null) {
			cq.orderBy(new OrderImpl(from.get(filter.getSortProperty()), filter.isSortOrder()));
		}

		TypedQuery<Recipient> q = em.createQuery(cq);

		// set paging
		if (filter.getOffset() != null && filter.getLimit() != null) {
			q.setFirstResult(filter.getOffset());
			q.setMaxResults(filter.getLimit());
		}

		// set execute query
		List<Recipient> allitems = q.getResultList();

		return allitems;
	}

}
