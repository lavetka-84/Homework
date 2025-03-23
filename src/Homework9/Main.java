package Homework9;

public class Main {
    public static void main(String[] args) {
//Задание 1.1-1.2
        Dog dog = new Dog("Джек", "Пудель", 10.2, "Белый", 12, "Мясо");
        System.out.println(dog.toString());
        dog.sound();
        dog.play();
        dog.bark();
        dog.jump();
        dog.run();
        dog.bite();

        System.out.println();


        Bird bird = new Bird("Скворец", 8, "Желтый", 3, "Насекомые");
        System.out.println(bird);
        bird.sound();
        bird.play();
        bird.sing();
        bird.klyuet();
        bird.chicks();

        Zoo zoo = new Zoo();

        // Задание 1.3-1.7
        zoo.addAnimal(new Dog("Челси", "Бесенджи", 12, "Рыже-белый", 12, "Мясо"));
        zoo.addAnimal(new Dog("Лора", "Такса", 8, "Черный", 15, "Мясо"));
        zoo.addAnimal(new Dog("Мери", "Бигль", 15, "Черно-рыже-белый", 14, "Мясо"));

        zoo.addAnimal(new Bird("Грач", 10, "Черный", 5, "Насекомые"));
        zoo.addAnimal(new Bird("Зяблик", 20, "Разноцветный", 7, "Растения и Насекомые"));
        zoo.addAnimal(new Bird("Кукушка", 11, "Серый", 12, "Насекомые"));

        for (Animal animal : zoo.getAnimals()) {
            System.out.println(animal);
            animal.sound();
            animal.play();
            System.out.println();
        }
    }
}



