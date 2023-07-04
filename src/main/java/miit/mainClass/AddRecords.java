package miit.mainClass;

import org.hibernate.Session;

import miit.pojo.Answers;
import miit.pojo.Questions;
import miit.utilites.HibernateUtility;

public class AddRecords {

	public static void main(String[] args) {

		Answers answers = new Answers();
		answers.setAns_id(12);
		answers.setAns_dec("My name is Keyur");

		Questions questions = new Questions();
		questions.setQst_dec("What is your name");
		questions.setQst_id(1);
		questions.setAnswers(answers);

		Session session = HibernateUtility.buildSessionFactory().openSession();
		session.beginTransaction();
		session.save(answers);
		session.save(questions);
		session.getTransaction().commit();
		session.close();

	}

}
