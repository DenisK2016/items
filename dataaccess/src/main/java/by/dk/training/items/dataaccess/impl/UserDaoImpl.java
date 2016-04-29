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

import by.dk.training.items.dataaccess.UserDao;
import by.dk.training.items.dataaccess.filters.UserFilter;
import by.dk.training.items.datamodel.User;
import by.dk.training.items.datamodel.User_;

@Repository
public class UserDaoImpl extends AbstractDaoImpl<User, Long> implements UserDao {

	protected UserDaoImpl() {
		super(User.class);

	}

	@Override
	public List<User> find(UserFilter filter) {
		EntityManager em = getEntityManager();

		CriteriaBuilder cb = em.getCriteriaBuilder();

		CriteriaQuery<User> cq = cb.createQuery(User.class);

		Root<User> from = cq.from(User.class); // SELECT .. FROM ...

		cq.select(from); // Указывает что селектать SELECT *.  from - это таблица,
							// а from.get... - это конкретная колонка

		if (filter.getLogin() != null) {
			Predicate loginEqualCondition = cb.equal(from.get(User_.login), filter.getLogin());
			cq.where(loginEqualCondition);
		}

		// set fetching
		if (filter.isFetchCredentials()) {
			from.fetch(User_.userCredentials, JoinType.LEFT);
		}
		
		if (filter.isFetchPackages()) {
			from.fetch(User_.packages, JoinType.LEFT);
		}

		// set sort params
		if (filter.getSortProperty() != null) {
			cq.orderBy(new OrderImpl(from.get(filter.getSortProperty()), filter.isSortOrder()));
		}

		TypedQuery<User> q = em.createQuery(cq);

		// set paging
		if (filter.getOffset() != null && filter.getLimit() != null) {
			q.setFirstResult(filter.getOffset());
			q.setMaxResults(filter.getLimit());
		}

		// set execute query
		List<User> allitems = q.getResultList();

		return allitems;
	}

}
