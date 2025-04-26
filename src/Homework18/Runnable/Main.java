package Homework18.Runnable;

public class Main {

    public static void main(String[] args) {

        Thread car1 = new Thread(new Avto("Opel", "1614-BH-1", 1000));
        Thread car2 = new Thread(new Avto("Lada", "4848-BB-2", 2500));

        car1.start();
        car2.start();

        try {
            car1.join();
            car2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
