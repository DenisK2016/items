
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;

import by.dk.training.items.datamodel.Packages;
import by.dk.training.items.datamodel.Products;
import by.dk.training.items.datamodel.Ranks;
import by.dk.training.items.datamodel.Recipient;
import by.dk.training.items.datamodel.StatusUser;
import by.dk.training.items.datamodel.Types;
import by.dk.training.items.datamodel.User;
import by.dk.training.items.datamodel.UserCredentials;

public class Main {

	static private Recipient recipient1;

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();

			UserCredentials userCred1 = new UserCredentials("Игорь", "Лаптев", new Date(), StatusUser.OFFICER,
					"Начальник смены", Ranks.INSPECTOR_FOURTH, "lapat@gmail.com");
			User user1 = new User("Inspektor", "wytshbztsh54", userCred1);

			session.save(userCred1);
			session.save(user1);

			recipient1 = new Recipient("Андропов Сергей Петрович", "Гродно", "Горького 25, кв.45");

			session.save(recipient1);

			Types type1 = new Types("Электроника", null);
			Types subtype11 = new Types("Связь", type1);
			Types subtype111 = new Types("Телефон", subtype11);

			session.save(type1);
			session.save(subtype11);
			session.save(subtype111);

			Products product1 = new Products("Мобильный телефон", "1 шт/год", new BigDecimal(300000.00), true);
			product1.setTypes(subtype111);

			session.save(product1);

			Packages pack = new Packages();
			pack.setProducts(product1);
			pack.creatingPackage(5256247436765L, recipient1, new BigDecimal(1000000.00), 0.5, user1, new Date(),
					"Lalala", "China", new Date(116, 4, 20), new BigDecimal(0), false);

			session.save(pack);

			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.shutdown();

		}

	}

}
