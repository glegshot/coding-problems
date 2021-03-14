package org.challenges.problems;

import java.util.List;
import java.util.Stack;

public class ParkingGarageSimulator {

    public void simulateParking(List<Car> cars) {

        Stack<Car> parkingLane = new Stack<>();
        Stack<Car> bufferLane = new Stack<>();

        for (Car car : cars) {
            if (car.action.equals("ARRIVE")) {
                if (parkingLane.size() >= 10) {
                    System.out.println("Parking Lane Full, Car with Licence: " + car.licence + " departing");
                    System.out.println();
                } else {
                    parkingLane.push(car);
                }
            } else if (car.action.equals("DEPART")) {
                while (!parkingLane.isEmpty()) {
                    Car poppedCar = parkingLane.pop();
                    if (poppedCar.licence.equals(car.licence)) {
                        System.out.println("Car with Licence: " + poppedCar.licence + " departing");
                        System.out.println("Car was moved " + poppedCar.moveCount + " times to allow others to depart");
                        System.out.println();
                        parkBackToParkingLane(parkingLane, bufferLane);
                        break;
                    } else {
                        poppedCar.moveCount += 1;
                        moveToBufferLane(poppedCar, bufferLane);
                    }
                }
            }

        }

    }

    public void parkBackToParkingLane(Stack<Car> parkingLane, Stack<Car> bufferLane) {
        while (!bufferLane.isEmpty()) {
            parkingLane.push(bufferLane.pop());
        }
    }

    public void moveToBufferLane(Car car, Stack<Car> bufferLane) {
        bufferLane.push(car);
    }


    public static class Car {
        int moveCount;
        String licence;
        String action;

        public Car(String licence, int moveCount, String action) {
            this.licence = licence;
            this.moveCount = moveCount;
            this.action = action;
        }

    }

}
