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

import by.dk.training.items.dataaccess.PackageDao;
import by.dk.training.items.dataaccess.filters.PackageFilter;
import by.dk.training.items.datamodel.Package;
import by.dk.training.items.datamodel.Package_;

@Repository
public class PackageDaoImpl extends AbstractDaoImpl<Package, Long> implements PackageDao {

	protected PackageDaoImpl() {
		super(Package.class);
	}

	@Override
	public List<Package> find(PackageFilter filter) {
		EntityManager em = getEntityManager();

		CriteriaBuilder cb = em.getCriteriaBuilder();

		CriteriaQuery<Package> cq = cb.createQuery(Package.class);

		Root<Package> from = cq.from(Package.class); // SELECT .. FROM ...

		cq.select(from); // Указывает что селектать SELECT *. from - это
							// таблица,
							// а from.get... - это конкретная колонка

		if (filter.getPrice() != null) {
			Predicate loginEqualCondition = cb.equal(from.get(Package_.price), filter.getPrice());
			cq.where(loginEqualCondition);
		}
		if (filter.getWeight() != null) {
			Predicate loginEqualCondition = cb.equal(from.get(Package_.weight), filter.getWeight());
			cq.where(loginEqualCondition);
		}
		if (filter.getDate() != null) {
			Predicate loginEqualCondition = cb.equal(from.get(Package_.date), filter.getDate());
			cq.where(loginEqualCondition);
		}
		if (filter.getDescription() != null) {
			Predicate loginEqualCondition = cb.equal(from.get(Package_.description), filter.getDescription());
			cq.where(loginEqualCondition);
		}
		if (filter.getCountrySender() != null) {
			Predicate loginEqualCondition = cb.equal(from.get(Package_.countrySender), filter.getCountrySender());
			cq.where(loginEqualCondition);
		}
		if (filter.getPaymentDeadline() != null) {
			Predicate loginEqualCondition = cb.equal(from.get(Package_.paymentDeadline), filter.getPaymentDeadline());
			cq.where(loginEqualCondition);
		}
		if (filter.getFine() != null) {
			Predicate loginEqualCondition = cb.equal(from.get(Package_.fine), filter.getFine());
			cq.where(loginEqualCondition);
		}
		if (filter.getPaid() != null) {
			Predicate loginEqualCondition = cb.equal(from.get(Package_.paid), filter.getPaid());
			cq.where(loginEqualCondition);
		}

		// set fetching
		if (filter.isFetchUser()) {
			from.fetch(Package_.idUser, JoinType.LEFT);
		}

		if (filter.isFetchRecipient()) {
			from.fetch(Package_.idRecipient, JoinType.LEFT);
		}
		
		if (filter.isFetchProduct()) {
			from.fetch(Package_.products, JoinType.LEFT);
		}

		// set sort params
		if (filter.getSortProperty() != null) {
			cq.orderBy(new OrderImpl(from.get(filter.getSortProperty()), filter.isSortOrder()));
		}

		TypedQuery<Package> q = em.createQuery(cq);

		// set paging
		if (filter.getOffset() != null && filter.getLimit() != null) {
			q.setFirstResult(filter.getOffset());
			q.setMaxResults(filter.getLimit());
		}

		// set execute query
		List<Package> allitems = q.getResultList();

		return allitems;
	}

}
