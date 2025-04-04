package Homework12;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMV", 110);
        Motorcycle motorcycle = new Motorcycle("YAMAHA", 85);

        Garage<Car> CarGarage = new Garage<>(car);
        Garage<Motorcycle> MotorcycleGarage = new Garage<>(motorcycle);

        System.out.println(CarGarage.getVehicle().getName() + " - Въезд разрешён: " + CarGarage.AmountOfEmissions());
        System.out.println(MotorcycleGarage.getVehicle().getName() + " - Въезд разрешён: " + MotorcycleGarage.AmountOfEmissions());
    }
}
