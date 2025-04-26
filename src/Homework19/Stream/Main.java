package Homework19.Stream;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        List<City> cities = List.of(
                new City(1, "Moscow", 1268100, Continent.EUROPE),
                new City(2, "Tokyo", 6990000, Continent.ASIA),
                new City(3, "Berlin", 3617800, Continent.EUROPE),
                new City(4, "Cairo", 4525070, Continent.AFRICA),
                new City(5, "Sydney", 5021180, Continent.AUSTRALIA),
                new City(6, "Toronto", 2104500, Continent.NORTH_AMERICA),
                new City(7, "Madrid", 6607100, Continent.EUROPE)
        );

        cities.stream()
                .filter(c -> c.getContinent() == Continent.EUROPE)
                .max(Comparator.comparingInt(City::getPopulation))
                .ifPresent(city -> System.out.println("Самый густонаселённый город в Европе: " + city));


        cities.stream()
                .filter(c -> c.getContinent() == Continent.EUROPE)
                .min(Comparator.comparingInt(City::getPopulation))
                .ifPresent(city -> System.out.println("Город с наименьшим населением в Европе: " + city));


        cities.stream()
                .max(Comparator.comparingInt(City::getPopulation))
                .ifPresent(city -> System.out.println("Самый густонаселённый город: " + city));


        cities.stream()
                .min(Comparator.comparingInt(City::getPopulation))
                .ifPresent(city -> System.out.println("Город с самым маленьким населением: " + city));

        cities.stream()
                .filter(c -> c.getPopulation() > 1_000_000)
                .findFirst()
                .ifPresent(city -> System.out.println("Первый город с населением > 1 млн: " + city));


        System.out.println("Города с населением больше 1 млн:");
        cities.stream()
                .filter(c -> c.getPopulation() > 1_000_000)
                .forEach(System.out::println);


        List<String> cityNames = cities.stream()
                .map(City::getName)
                .toList();
        System.out.println("Названия городов: " + cityNames);
    }
}



