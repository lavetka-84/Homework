package Homework6;

public class Homework6 {

    public static void main(String[] args) {
        // задание 1

        int[] massive = new int[10];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = i + 1;
        }
        System.out.println("Исходный массив:");
        for (int num : massive) {
            System.out.println(num + " ");
        }
        System.out.println();
        for (int i = 1; i < massive.length; i += 2) {
            massive[i] = 0;
        }
        System.out.println("Изменённый массив:");
        for (int num : massive) {
            System.out.println(num + " ");
        }

        // Задание 2

        int[] firstmassive = {3, 7, 2, 9, 5};

        int[] secondmassive = new int[firstmassive.length + 1];
        for (int i = 0; i < firstmassive.length; i++) {
            secondmassive[i] = firstmassive[i];
        }
        secondmassive[secondmassive.length - 1] = 0;
        for (int num1 : secondmassive) {
            System.out.println(num1 + " ");
        }

        // Задание 3*

        int[] massive1 = {3, 7, 2, 9, 5, 1, 8};
        int min = 0;
        int max = 0;
        for (int i = 1; i < massive1.length; i++) {
            if (massive1[i] < massive1[min]) {
                min = i;
            }
            if (massive1[i] > massive1[max]) {
                max = i;
            }
        }
        massive1[min] = -1000;
        massive1[max] = 1000;

        System.out.println("Изменённый массив:");
        for (int num : massive1) {
            System.out.println(num + " ");
        }
        // Задание 4*
        int[] array = {9, 2, 5, 1, 8, 3, 7};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                }
            }
        }
        System.out.println("Отсортированный массив:");
        for (int num : array) {
            System.out.println(num + " ");
        }
    }
}