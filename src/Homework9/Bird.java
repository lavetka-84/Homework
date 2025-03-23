package Homework9;

public class Bird extends Animal {
    private String nameBird;
    private int flight;


    public Bird (String nameBird, int flight, String color, int life, String food) {
        super(color, life, food);
        this.nameBird = nameBird;
        this.flight = flight;
    }

    public void sing() {
        System.out.println(nameBird+ " поет свои песни.");
    }

    public void klyuet () {
        System.out.println(nameBird + " клюет зерно.");
    }

    public void chicks () {
        System.out.println(nameBird + " высиживает птенцов.");
    }

    @Override
    public void sound() {
        System.out.println(nameBird + " громко поет под окном.");
    }

    @Override
    public void play() {
        System.out.println(nameBird + " играет.");
    }

    @Override
    public String toString() {
        String result = super.toString();
        result = result + "Семейство: " + nameBird + ", Максимальная высота полета: " + flight + " м ";
        return result;
    }


    public String getNameBird() {
        return nameBird;
    }

    public void setNameBird(String nameBird) {
        this.nameBird = nameBird;
    }

    public int getFlight() {
        return flight;
    }

    public void setFlight(int flight) {
        this.flight = flight;
    }
}
