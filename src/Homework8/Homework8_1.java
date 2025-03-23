package Homework8;

public class Homework8_1 {

    // Задание 1
    public static String combi(String str1, String str2) {
        return str1 + " " + str2;
    }

    public static void main(String[] args) {
        String str1 = "Изучаем";
        String str2 = "Java";

        // Вызов метода для объединения строк
        String result = combi (str1, str2);
        System.out.println(result);
    }

}
