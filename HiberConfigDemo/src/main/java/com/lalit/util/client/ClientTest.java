package com.lalit.util.client;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import com.lalit.util.HibernateUtil;

public class ClientTest {

	public static void main(String[] args) {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession();) {
			String SQL = "SELECT VERSION()";
			NativeQuery nativeQuery = session.createNativeQuery(SQL);
			Object object = nativeQuery.getSingleResult();
			String result = (String)object;
			System.out.println("MySQL Database Version is : "+result);
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
