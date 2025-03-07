package Homework4;

import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println ("Введите число a");
        int a = in.nextInt ();
        System.out.println ("Введите b");
        int b = in.nextInt ();
        System.out.println ("Введите c");
        int c = in.nextInt ();

//   Задание 1
        if (a % 2==0) System.out.println(a);
        if (b % 2==0) System.out.println(b);
        if (c % 2==0) System.out.println(c);

//  Задание 2
        System.out.println ("Введите число a");
        a = in.nextInt ();
        System.out.println ("Введите b");
        b = in.nextInt ();
        System.out.println ("Введите c");
        c = in.nextInt ();

        if (a % 2==0 && a % 5==0) System.out.println(a);
        if (b % 2==0 && b % 5==0) System.out.println(b);
        if (c % 2==0 && b % 5==0) System.out.println(c);

//  Задание 3
        System.out.println ("Введите число x");
        int x = in.nextInt ();

        int result;
        result=15/x;
        switch (result) {
            case 3 :
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат деления равен дробному числу" + 15.0/x);
        }

    }


}
