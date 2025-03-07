package Homework5;

import java.util.Scanner;

public class Homework5 {

    // Задание 1

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
        }

        //Задание 2

        Scanner in =new Scanner(System.in);
        System.out.println ("Введите число a");
        int a = in.nextInt ();
        System.out.println ("Введите b");
        int b = in.nextInt ();
        int sum=0;

        while (a <= b) {
            sum += a;
            a++;
        }

        System.out.println("Сумма чисел от а до b: " + sum);

        //Задание 3*

        System.out.println ("Введите число number");
        int number = in.nextInt ();

        int y = 0;
        while (number != 0) {
            int last = number % 10;
            y= y * 10 + last;
            number/= 10;
        }

        System.out.println("Число в обратном порядке: " + y);
    }

    }
