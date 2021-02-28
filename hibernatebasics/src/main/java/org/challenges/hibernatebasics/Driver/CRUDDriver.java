package org.challenges.hibernatebasics.Driver;

import org.challenges.hibernatebasics.dto.Address;
import org.challenges.hibernatebasics.dto.City;
import org.challenges.hibernatebasics.dto.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class CRUDDriver {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
      /*  Session session = sessionFactory.openSession();
        session.beginTransaction();
        City city = session.get(City.class,20);
        session.getTransaction().commit();
        System.out.println(city);
        session.close();*/

        /*session = sessionFactory.openSession();
        session.beginTransaction();
        city = new City();
        city.setCountrycode("BLA");
        city.setDistrict("periya");
        city.setId(4098);
        city.setName("panayal");
        city.setPopulation(20);
        session.save(city);
        session.getTransaction().commit();

        session.close();

        session = sessionFactory.openSession();
        session.beginTransaction();
        city = session.get(City.class,4098);
        session.getTransaction().commit();

        System.out.println(city);

        session.close();*/

       /* Users user = new Users();
        user.setUserId(12);
        user.setUsername("sreekumar");
        user.setJoinedDate(new Date());
        user.setAddress("22k Ave 214 Street");

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();

        session.close();*/



/*
        Users userFromDb = (Users) session.get(Users.class,12);
        session.close();
        System.out.println(userFromDb);
*/

        /*Address homeAddress = new Address();
        homeAddress.setCity("carson city");
        homeAddress.setState("caroline");
        homeAddress.setZipcode("452312");

        Address officeAddress = new Address();
        officeAddress.setCity("NewyorkCITY");
        officeAddress.setStreet("123 Ave");
        officeAddress.setZipcode("12345");
        officeAddress.setState("NY");

        Users user = new Users();
        user.setUsername("glegshot");
        user.getListOfAddresses().add(homeAddress);
        user.getListOfAddresses().add(officeAddress);

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();*/

        Session session = sessionFactory.openSession();
        Users testUser = (Users) session.get(Users.class,7);
        System.out.println(testUser);
        session.close();


        sessionFactory.close();
    }

}
