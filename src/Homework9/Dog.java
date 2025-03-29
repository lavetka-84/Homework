package Homework9;

public class Dog extends Animal {
    private String name;
    private String breed;
    private double weight;


    public Dog(String name, String breed, double weight, String color, int life, String food) {
        super(color, life, food);
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }


    public void bark() {
        System.out.println(name + " лает.");
    }

    public void bite() {
        System.out.println(name + " кусает.");
    }

    public void run() {
        System.out.println(name + " бегает.");
    }

    public void jump() {
        System.out.println(name + " прыгает.");
    }

    @Override
    public void sound() {
        System.out.println(name + " громко лает.");
    }

    @Override
    public void play() {
        System.out.println(name + " играет.");
    }

    @Override
    public String toString() {
        String result = super.toString();
        result= result + "Имя: " + name + ", Порода: " + breed + ", Вес: " + weight + " кг";
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}