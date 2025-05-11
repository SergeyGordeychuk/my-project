package org.example.factorymethod;

public class TruckCreator extends CourierTransportCreator {
    @Override
    public CourierTransport createTransport() {
        return new Truck();
    }
}
