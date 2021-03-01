package org.challenges.hibernatebasics.Driver;

import org.challenges.hibernatebasics.dto.Pencil;
import org.challenges.hibernatebasics.dto.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToManyDriver {

    public static void main(String[] args) {

        SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();

        Student student = new Student();
        student.setName("skumar");

        Pencil pencil = new Pencil();
        pencil.setBrandName("Staedler");

        Pencil pencil1 = new Pencil();
        pencil1.setBrandName("Faber Castle");

        Pencil pencil2 = new Pencil();
        pencil2.setBrandName("Nataraj");

        student.getPencils().add(pencil);
        student.getPencils().add(pencil1);
        student.getPencils().add(pencil2);

        pencil.setStudent(student);
        pencil1.setStudent(student);
        pencil2.setStudent(student);

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(student);
        session.save(pencil);
        session.save(pencil1);
        session.save(pencil2);
        session.getTransaction().commit();
        session.close();

        sessionFactory.close();

    }

}
