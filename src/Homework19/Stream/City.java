package Homework19.Stream;

public class City {private int id;
    private String name;
    private int population;
    private Continent continent;

    public City(int id, String name, int population, Continent continent) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.continent = continent;
    }


    public int getPopulation() {
        return population;
    }

    public Continent getContinent() {
        return continent;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + population + ")";
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
