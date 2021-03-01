package org.challenges.hibernatebasics.Driver;

import org.challenges.hibernatebasics.dto.Soldiers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLevelCacheDriver {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Soldiers s = session.get(Soldiers.class, 1);
        session.getTransaction().commit();
        session.close();

        session = sessionFactory.openSession();
        session.beginTransaction();
        Soldiers s2 = session.get(Soldiers.class,1);
        session.getTransaction().commit();
        session.close();

        sessionFactory.close();

    }

}
