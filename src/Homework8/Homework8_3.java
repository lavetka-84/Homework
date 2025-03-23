package Homework8;

public class Homework8_3 {

    public static String insert (String text, int k, String str) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > k) {
                String beforeK = word.substring(0, k);
                String afterK = word.substring(k);
                result.append(beforeK).append(str).append(afterK);
            } else {
                result.append(word).append(str);
            }
            result.append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String text = "Каждая строка, создаваемая с помощью оператора new, литерала (заключенная в двойные апострофы) или метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является то, что его значение не может быть изменено после создания объекта при помощи любого метода класса. Изменение строки всегда приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение и хранится в стеке. Произведенные изменения можно сохранить переинициализируя\n" +
                "ссылку.";
        int k = 3;
        String str = "RR";

        String result = insert(text, k, str);
        System.out.println(result);  // Вывод результата
    }
}