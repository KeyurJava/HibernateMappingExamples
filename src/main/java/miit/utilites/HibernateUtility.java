package miit.utilites;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import miit.pojo.Answers;
import miit.pojo.Questions;

public class HibernateUtility {

	public static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Answers.class);
		configuration.addAnnotatedClass(Questions.class);
		SessionFactory factory = configuration.buildSessionFactory();

		return factory;
	}

}
