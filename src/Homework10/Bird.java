package Homework10;

import java.util.Objects;

public class Bird extends Animal {
    private String nameBird;
    private int flight;

    public Bird(String nameBird, int flight, String color, int life, String food) {
        super(color, life, food);
        this.nameBird = nameBird;
        this.flight = flight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Bird bird = (Bird) obj;

        if (this.life != bird.life) return false;
        if (this.flight != bird.flight) return false;
        if (!Objects.equals(nameBird, bird.nameBird)) return false;
        return color != null && color.equals(bird.color);
    }

    @Override
    public int hashCode() {
        int result = life + flight+ nameBird.hashCode()+ color.hashCode();
        return result;
    }
}
