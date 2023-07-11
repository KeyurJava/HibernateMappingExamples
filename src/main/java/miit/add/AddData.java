package miit.add;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;

import miit.pojo.OwnerDet;
import miit.pojo.Properties_list;
import miit_utils.HibernateUtiles;

public class AddData {

	public static void main(String[] args) {

		OwnerDet ownerDet = new OwnerDet();

		ownerDet.setOw_id(1);
		ownerDet.setOw_name("Keyur");

		Properties_list plist1 = new Properties_list();
		plist1.setPid(101);
		plist1.setPname("1BHK");
		plist1.setOwnerDet(ownerDet);

		Properties_list plist2 = new Properties_list();
		plist2.setPid(102);
		plist2.setPname("4BHK Apartment");
		plist2.setOwnerDet(ownerDet);

		Properties_list plist3 = new Properties_list();
		plist3.setPid(103);
		plist3.setPname("Town House");
		plist3.setOwnerDet(ownerDet);

		List<Properties_list> list = new ArrayList<Properties_list>();
		list.add(plist1);
		list.add(plist2);
		list.add(plist3);

		ownerDet.setP_list(list);

		Session session = HibernateUtiles.hiernateConfigure().openSession();
		session.beginTransaction();

		session.save(ownerDet);
		session.save(plist1);
		session.save(plist2);
		session.save(plist3);
		session.getTransaction().commit();
		session.close();

	}

}
