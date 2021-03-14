package org.challenges.problems;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.challenges.problems.ParkingGarageSimulator.Car;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnit4.class)
public class ParkingGarageSimulatorTest {

    ParkingGarageSimulator parkingGarageSimulator;


    @Before
    public void init() {
        parkingGarageSimulator = new ParkingGarageSimulator();
    }

    @Test
    public void parkingGarageSimulatorTest() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("LM123", 0, "ARRIVE"));
        cars.add(new Car("LM231", 0, "ARRIVE"));
        cars.add(new Car("LM542", 0, "ARRIVE"));
        cars.add(new Car("LM986", 0, "ARRIVE"));
        cars.add(new Car("LM767", 0, "ARRIVE"));
        cars.add(new Car("LM344", 0, "ARRIVE"));
        cars.add(new Car("LM878", 0, "ARRIVE"));
        cars.add(new Car("LM322", 0, "ARRIVE"));
        cars.add(new Car("LM612", 0, "ARRIVE"));
        cars.add(new Car("LM424", 0, "ARRIVE"));
        cars.add(new Car("LMPPP", 0, "ARRIVE"));
        cars.add(new Car("LM123", 0, "DEPART"));
        cars.add(new Car("LM612", 0, "DEPART"));
        cars.add(new Car("LM231", 0, "DEPART"));


        parkingGarageSimulator.simulateParking(cars);
    }

}
