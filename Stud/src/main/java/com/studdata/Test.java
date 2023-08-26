package com.studdata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Test {
	public static void main(String[] args) {
SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
Session session= factory.getCurrentSession();
session.beginTransaction();
Student retriveData= session.get(Student.class,1);
System.out.println(retriveData.getName());
session.getTransaction().commit();
factory.close();

}
}