package com.sdnext.hibernate.test.utility;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	 private static final SessionFactory sessionFactory;
	 static
	 {
		 try
		 { 
			 //sessionFactory = new Configuration().configure().buildSessionFactory(); 
			 Configuration config = new Configuration().configure("hibernate.cfg.xml");
			 sessionFactory = config.buildSessionFactory();
//			 Configuration  configuration = new Configuration().configure("hibernate.cfg.xml");
//			 sessionFactory = configuration.buildSessionFactory();
		 }
		 catch(Throwable th)
		 {
			 System.err.println("Enitial SessionFactory creation failed"+th);
			 throw new ExceptionInInitializerError(th);
		 }
	 }
	 public static SessionFactory getSessionFactory(){
	 return sessionFactory;
	 }
}
