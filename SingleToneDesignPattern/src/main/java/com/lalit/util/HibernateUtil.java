package com.lalit.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.lalit.*;

public class HibernateUtil {
	
	// Rule 1 : Create Private Constructor
	private HibernateUtil() {
		
	}
	
	// Rule 2 : Create Static Instance Variable.
	private static SessionFactory sessionFactory;
	
	// Rule 3 : Create Public Static Accessor.
	
	public static SessionFactory getSessionFactoryInstance() {
		if(sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(Student.class);
			sessionFactory = configuration.buildSessionFactory();
		}
		return sessionFactory;
	}
}
