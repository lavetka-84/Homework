package Homework10;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Фиолетовая",  12, "Мясо",10,"Такса", "Лора");
        Dog dog2 = new Dog("Фиолетовая",  12, "Мясо",10,"Такса", "Лора");

        Bird bird1 = new Bird("Скворец", 100, "Черный", 10, "Насекомые");
        Bird bird2 = new Bird("Скворец", 100, "Черный", 10, "Насекомые");

        System.out.println(dog1.equals(dog2));
        System.out.println(bird1.equals(bird2));

        System.out.println(dog1.hashCode() == dog2.hashCode());
        System.out.println(bird1.hashCode() == bird2.hashCode());
    }
}
