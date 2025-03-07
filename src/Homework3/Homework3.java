package Homework3;

public class Homework3 {

    public static void main(String[] args) {
       //Задание 1

        int x = (98 - 25) * 6;

        System.out.println("Значение x: " + x);

        //Задание 2

        int g = 3, y = 1, z = 18;

        g += 5;

        System.out.println("Сложение с присваиванием " + g);

        y *= 9;

        System.out.println("Умножение с присваиванием " + y);

        z -= 6;

        System.out.println("Разность с присваиванием " + z);



        // Задание 3

        int a=35;
        int b=65;

        int c = a > b ? 5 :10;

        System.out.println("c:" + c);

        // Задание 4
        int h = 5, j = 2;
        int t = (++h) * (j--); // Увеличиваем h, умножаем, затем уменьшаем j

        System.out.println("h = " + h);
        System.out.println("y = " + j);
        System.out.println("t = " + t);

    }

}
