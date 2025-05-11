package org.example.factorymethod;

public class Main {
    public static void main(String[] args) {
        String type = "Car";

        Deliver deliver = new Deliver();

        deliver.setCourierTransport(getTransportByType(type));

        CourierTransport courierTransport = deliver.getCourierTransport();
        courierTransport.deliver();
    }

    public static CourierTransport getTransportByType(String type) {
        switch (type) {
            case "Car":
                return new CarCreator().createTransport();
            case "Truck":
                return new TruckCreator().createTransport();
            default:
                throw new RuntimeException();
        }
    }
}
