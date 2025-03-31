package Homework11;

public class RodotSaper implements RobotEngener {

    private String model;
    private int power;
    private String chassisNumberr;
    private String material;
    private boolean isOn;

    public RodotSaper (String model, int power, String chassisNumberr, String material) {
        this.model = model;
        this.power = power;
        this.chassisNumberr = chassisNumberr;
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
        System.out.println(model + " уничтожает мины с помощью шасси  " + chassisNumberr + ".");
    }

    @Override
    public void repairRobot() {
        System.out.println("Робот-сапёр " + model + " требует спецремонта.");
    }
    @Override
    public void createItem() {
        System.out.println(model + " создаёт устройство для разминирования.");
    }
}



