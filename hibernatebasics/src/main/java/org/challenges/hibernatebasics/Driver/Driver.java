package org.challenges.hibernatebasics.Driver;

import org.challenges.hibernatebasics.dto.City;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Driver {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        City city = session.get(City.class,20);
        session.getTransaction().commit();

        System.out.println(city);

        session.close();
        sessionFactory.close();
    }

}
