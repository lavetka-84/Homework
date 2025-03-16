package Homework8;

public class Homework8_2 {

    public static String process1 (String str1, String str2) {
        if (str1.endsWith(str2)) {
            return str1.substring(0, str1.indexOf(str2));
        } else {
            return str1.toUpperCase();
        }
    }

    public static void main(String[] args) {
        String str1 = "Cложный урок строки";
        String str2 = "строки";


        String result = process1 (str1, str2);
        System.out.println(result);
    }
}

