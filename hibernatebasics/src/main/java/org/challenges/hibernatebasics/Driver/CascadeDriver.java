package org.challenges.hibernatebasics.Driver;

import org.challenges.hibernatebasics.dto.House;
import org.challenges.hibernatebasics.dto.Village;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CascadeDriver {

    public static void main(String[] args) {

        SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();

        Village village = new Village();
        village.setVillageName("TOWN OF BERG");
        House house = new House();
        house.setHouseName("House Cas 12");
        village.getHouse().add(house);

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(village);
        session.getTransaction().commit();

        session.close();
        sessionFactory.close();

    }

}
