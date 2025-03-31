package Homework11;

public class RobotCook implements Robot{

        private String model;
        private int power;
        private String country;
        private String cook;
        private boolean isOn;

        public RobotCook(String model, int power, String country, String cook) {
            this.model = model;
            this.power = power;
            this.country = country;
            this.cook = cook;
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
            System.out.println(model + " готовит еду с помощью средства - " + cook + ".");
        }
    }

