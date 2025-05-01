package Homework19;

public class Main {

    public static void main(String[] args) {
        // 1.1 Лямбда-выражение, которое переводит строку в верхний регистр
        StringProcessor toUpperCase = input -> input.toUpperCase();

        String original = "hello java";
        String result = toUpperCase.process(original);

        System.out.println("Исходная строка: " + original);
        System.out.println("После обработки: " + result);
    }
}



