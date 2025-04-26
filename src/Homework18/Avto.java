package Homework18;

public class Avto extends Thread {
    private String name;
    private String number;
    private int stopTime;

    public Avto(String name, String number, int stopTime) {
        this.name = name;
        this.number = number;
        this.stopTime = stopTime;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " с номером " + number + " едет. Круг " + i);
                Thread.sleep(stopTime);
            }
            System.out.println(name + " с номером " + number + " закончила движение.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


