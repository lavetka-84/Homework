package Homework10;

import java.util.Objects;

public class Dog extends Animal {
    private final String name;
    private final String breed;
    private final double weight;

    public Dog(String color, int life, String food, double weight, String breed, String name) {
        super(color, life, food);
        this.weight = weight;
        this.breed = breed;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Dog dog = (Dog) obj;

        if (this.life != dog.life) return false;
        if (weight != dog.weight) return false;
        if (!Objects.equals(name, dog.name)) return false;
        return breed != null && breed.equals(dog.breed);
    }

    @Override
    public int hashCode() {
        int result = life + (int) weight + name.hashCode()+breed.hashCode();
        return result;
    }
}