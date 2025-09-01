package com.lalit;

import org.hibernate.Session;

import com.lalit.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Student Registration Start..!!");
		
		Student student = new Student();
		
		student.setId(101);
		student.setName("Yogesh");
		student.setEmail("Yogesh@123");
		student.setPhone("9770300812");
		student.setAddress("Khetia");
		
		Session session = HibernateUtil.getSessionFactoryInstance().openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		
		session.close();
		
		System.out.println("Student Record Saved Successfully..!!!");

	}

}
