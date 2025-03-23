package Homework9;
public class Zoo {

    private Animal[] animals;

    public Zoo() {
        animals = new Animal[0];
    }

    //  добавление нового животного
    public void addAnimal(Animal animal) {
        animals = copyAnimals(animals, animal);
    }

    public Animal[] getAnimals() {
        return animals;
    }
    private Animal[] copyAnimals(Animal[] oldAnimals, Animal newAnimal) {
        Animal[] newAnimals = new Animal[oldAnimals.length + 1];

        for (int i = 0; i < oldAnimals.length; i++) {
            newAnimals[i] = oldAnimals[i];
        }
        newAnimals[oldAnimals.length] = newAnimal;
        return newAnimals;
    }
}
