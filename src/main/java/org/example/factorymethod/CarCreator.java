package org.example.factorymethod;

public class CarCreator extends CourierTransportCreator {
    @Override
    public CourierTransport createTransport() {
        return new Car();
    }
}
