package org.challenges.hibernatebasics.Driver;

import org.challenges.hibernatebasics.dto.Person;
import org.challenges.hibernatebasics.dto.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneDriver {

    public static void main(String[] args) {

        SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();


        Person person = new Person();
        person.setName("Ralph Dentist");

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("BMW S9");

        person.setVehicle(vehicle);

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(vehicle);
        session.save(person);
        //session.save(vehicle);
        session.getTransaction().commit();
        session.close();

        sessionFactory.close();


    }


}
