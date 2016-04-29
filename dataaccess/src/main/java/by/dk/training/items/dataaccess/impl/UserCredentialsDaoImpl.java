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

import by.dk.training.items.dataaccess.UserCredentialsDao;
import by.dk.training.items.dataaccess.filters.UserCredentialsFilter;
import by.dk.training.items.datamodel.UserCredentials;
import by.dk.training.items.datamodel.UserCredentials_;

@Repository
public class UserCredentialsDaoImpl extends AbstractDaoImpl<UserCredentials, Long> implements UserCredentialsDao {

	protected UserCredentialsDaoImpl() {
		super(UserCredentials.class);
	}

	@Override
	public List<UserCredentials> find(UserCredentialsFilter filter) {
		EntityManager em = getEntityManager();

		CriteriaBuilder cb = em.getCriteriaBuilder();

		CriteriaQuery<UserCredentials> cq = cb.createQuery(UserCredentials.class);

		Root<UserCredentials> from = cq.from(UserCredentials.class);

		cq.select(from);

		if ((filter.getFirstName() != null) || (filter.getLastName() != null)) {
			Predicate fNameEqualCondition = cb.equal(from.get(UserCredentials_.firstName), filter.getFirstName());
			Predicate lNameEqualCondition = cb.equal(from.get(UserCredentials_.lastName), filter.getLastName());
			cq.where(cb.or(fNameEqualCondition, lNameEqualCondition));
		}

		if (filter.getCreated() != null) {
			Predicate createdEqualCondition = cb.equal(from.get(UserCredentials_.created), filter.getCreated());
			cq.where(createdEqualCondition);
		}

		if (filter.getStatus() != null) {
			Predicate statusEqualCondition = cb.equal(from.get(UserCredentials_.status), filter.getStatus());
			cq.where(statusEqualCondition);
		}

		if (filter.getPost() != null) {
			Predicate postEqualCondition = cb.equal(from.get(UserCredentials_.post), filter.getPost());
			cq.where(postEqualCondition);
		}

		if (filter.getRank() != null) {
			Predicate rankEqualCondition = cb.equal(from.get(UserCredentials_.rank), filter.getRank());
			cq.where(rankEqualCondition);
		}

		if (filter.getEmail() != null) {
			Predicate emailEqualCondition = cb.equal(from.get(UserCredentials_.email), filter.getEmail());
			cq.where(emailEqualCondition);
		}

		if (filter.isFetchUser()) {
			from.fetch(UserCredentials_.user, JoinType.LEFT);
		}

		// set sort params
		if (filter.getSortProperty() != null) {
			cq.orderBy(new OrderImpl(from.get(filter.getSortProperty()), filter.isSortOrder()));
		}

		TypedQuery<UserCredentials> q = em.createQuery(cq);

		// set paging
		if (filter.getOffset() != null && filter.getLimit() != null) {
			q.setFirstResult(filter.getOffset());
			q.setMaxResults(filter.getLimit());
		}

		// set execute query
		List<UserCredentials> allitems = q.getResultList();

		return allitems;
	}

}
