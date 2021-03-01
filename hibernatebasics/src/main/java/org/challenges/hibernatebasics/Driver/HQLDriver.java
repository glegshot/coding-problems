package org.challenges.hibernatebasics.Driver;

import org.challenges.hibernatebasics.dto.Soldiers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.stream.IntStream;

public class HQLDriver {

    public static void main(String[] args) {

        SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();

        Soldiers soldiers = null;

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        // to fill in data for HQL test
       /*for(int i = 0;i < 5;i++){
            soldiers = new Soldiers();
            soldiers.setRank("pvt");
            soldiers.setName("user "+i);
            session.save(soldiers);
        }

        for(int i = 0;i < 5;i++){
            soldiers = new Soldiers();
            soldiers.setRank("sgt");
            soldiers.setName("upgraded user "+i);
            session.save(soldiers);
        }*/


        Query query = session.createQuery("from soldiers where rank like '%pvt%'");
        List<Soldiers> soldierList = query.list();

        session.getTransaction().commit();

        session.close();

        session = sessionFactory.openSession();
        session.beginTransaction();
        String minUserId = "6";
        query = session.createQuery("select name from soldiers where id > :id");
        query.setParameter("id", Integer.parseInt(minUserId));
        query.setFirstResult(3);
        List<String> nameList = query.list();

        session.getTransaction().commit();
        session.close();


        session = sessionFactory.openSession();
        session.beginTransaction();

        //named query example
        query = session.getNamedQuery("soldiers.byId");
        query.setParameter("id",10);
        Soldiers soldier = (Soldiers) query.getSingleResult();
        session.getTransaction().commit();
        session.close();


        sessionFactory.close();

        soldierList.stream().forEach(soldiers1 -> System.out.println(soldiers1.getName()));
        System.out.println("------------------");
        nameList.stream().forEach(name -> System.out.println(name));
        System.out.println("------------------");
        System.out.println(soldier.getId()+":"+soldier.getName()+":"+soldier.getRank());

    }

}
