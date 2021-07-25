package org.challenges.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class driverClass = Class.forName("org.challenges.reflection.DummyDriver");
        //obtaining the no args default constructor
        Constructor<DummyDriver> constructor  = driverClass.getConstructor();
        DummyDriver dummyDriver = constructor.newInstance();
        dummyDriver.printDetails();

        //obtain the parametrized constructor
        Constructor<DummyDriver> constructor1 = driverClass.getConstructor(String.class, Long.class);
        DummyDriver dummyDriver1 = constructor1.newInstance("JDBC",6L);
        dummyDriver1.printDetails();

    }

}
