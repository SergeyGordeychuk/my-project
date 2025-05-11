package org.example.factorymethod;

public class Truck implements CourierTransport{
    @Override
    public void deliver() {
        System.out.println("Truck delivering");
    }
}
