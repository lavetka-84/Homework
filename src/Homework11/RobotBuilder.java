package Homework11;

public class RobotBuilder implements RobotEngener {
    private String model;
    private int power;
    private String country;
    private String construction;
    private String material;
    private boolean isOn;

    public RobotBuilder(String model, int power, String country, String construction, String material) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.construction= construction;
        this.material = material;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(model + " включен.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(model + " выключен.");
    }

    @Override
    public void uniquePossibility() {
        System.out.println(model + " строит здания с использованием средства - " + construction + ".");
    }

    @Override
    public void createItem() {
        System.out.println(model + " создаёт бетон.");
    }
}

