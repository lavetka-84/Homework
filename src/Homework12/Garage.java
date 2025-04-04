package Homework12;

class Garage<T extends Vehicle> {
    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }

    public boolean AmountOfEmissions() {
        return vehicle.getEmissions() < 100;
    }
}