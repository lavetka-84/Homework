package Homework9;

public class Animal {
    String color;
    int life;
    String food;

        public Animal(String color, int life, String food) {
            this.color = color;
            this.life = life;
            this.food = food;
        }

        public void sound() {
            System.out.println("Животное издает какие-то звуки.");
        }

        public void play() {
            System.out.println("Животное играет.");
        }
    @Override
    public String toString() {
            String result = "";
        result = result + "Окрас: " + color + ", Продолжительность жизни: " + life + " лет, Тип пищи: " + food +  " , " ;
        return result;
    }
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getLife() {
            return life;
        }

        public void setLife(int life) {
            this.life = life;
        }

        public String getFood() {
            return food;
        }

        public void setFood(String food) {
            this.food = food;
        }
    }