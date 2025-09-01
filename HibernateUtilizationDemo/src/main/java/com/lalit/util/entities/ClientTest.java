package com.lalit.util.entities;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import com.lalit.util.entities.*;
import com.lalit.util.HibernateUtil;

public class ClientTest {

	public static void main(String[] args) {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession();) {
			
			Employee employee = createEmployee();
			session.beginTransaction();
			Serializable serializable = session.save(employee);
			Integer id = (Integer)serializable;
			session.getTransaction().commit();
			
			System.out.println("Employee is Created With Id : "+id);
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	
	private static Employee createEmployee() {
		
		Employee employee = new Employee();
		employee.setEmployeeId(101);
		employee.setEmployeeName("Lalit");
		employee.setEmail("Lalit@123");
		employee.setDoj(new Date());
		employee.setSalary(45000.00);
		
		return employee;
		
	}

}
