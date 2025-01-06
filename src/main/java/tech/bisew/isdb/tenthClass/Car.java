package tech.bisew.isdb.tenthClass;

import java.util.Objects;

public class Car extends Vehicle {
    private int numberOfDoor;

    public Car() {
    }

    public Car(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    public Car(String engineBrand, int seatNumber, int numberOfWheel, int numberOfDoor) {
        super(engineBrand, seatNumber, numberOfWheel);
        this.numberOfDoor = numberOfDoor;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }


    @Override
    public String startEngine() {
        return "Starting car engine";
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping car engine");
    }

    @Override
    public String run() {
        return "Running the car";
    }

    @Override
    public String breakE() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numberOfDoor == car.numberOfDoor;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numberOfDoor);
    }
}
