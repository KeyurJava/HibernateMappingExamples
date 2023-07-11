package miit_utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import miit.pojo.OwnerDet;
import miit.pojo.Properties_list;

public class HibernateUtiles {

	public static SessionFactory hiernateConfigure() {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(OwnerDet.class);
		configuration.addAnnotatedClass(Properties_list.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;

	}

}
