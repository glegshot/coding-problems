package org.challenges.hibernatebasics.Driver;

import org.challenges.hibernatebasics.dto.Soldiers;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CriteriaDriver {

    public static void main(String[] args) {

        SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();

        Soldiers soldiers = null;

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Soldiers> criteriaQuery = criteriaBuilder.createQuery(Soldiers.class);
        Root<Soldiers> root = criteriaQuery.from(Soldiers.class);
        criteriaQuery.where(criteriaBuilder.like(root.get("name"),"user 3"));

        Query<Soldiers> query = session.createQuery(criteriaQuery);
        Soldiers soldier = query.getSingleResult();

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

        System.out.println(soldier.getName()+":"+soldier.getRank()+":"+soldier.getId());
    }

}
