package model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UserDao {

	
	public static void save(User u)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hiber.cfg.xml");

		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

	
		session.save(u);
		//session.delete(s);
		
		tx.commit();
		session.close();
	}
	
	public static List<User> getAllUser()
	{
		Configuration cfg = new Configuration();
		cfg.configure("hiber.cfg.xml");

		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Query query=session.createQuery("from model.User");//here persistent class name is Emp  
		List<User> ul=query.list();  
		
		
		tx.commit();
		session.close();
		return ul;
	}
	
}
