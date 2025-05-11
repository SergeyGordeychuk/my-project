package org.example.factorymethod;

public class Car implements CourierTransport{
    @Override
    public void deliver() {
        System.out.println("Car delivering");
    }

    @Override
    public String toString() {
        return "Car{}";
    }
}
