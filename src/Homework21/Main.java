package Homework21;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String currentDate = getCurrentDate();
        System.out.println("Текущая дата: " + currentDate);

        String currentDateTime = getCurrentDateTime();
        System.out.println("Текущая дата и время: " + currentDateTime);

        String dateStr1 = "2023-03-19 : 10:12:24 AM";
        LocalDateTime dateTime1 = parseStringToDateTime1(dateStr1);
        System.out.println("Преобразованная дата и время : " + dateTime1);


        String dateStr2 = "пн 20.03.23 г. время: 15:07:28";
        LocalDateTime dateTime2 = parseStringToDateTime2(dateStr2);
        System.out.println("Преобразованная дата и время : " + dateTime2);
    }

    private static String getCurrentDate() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru"));
        return today.format(formatter);
    }


    private static String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy, hh:mm:ss a", new Locale("ru"));
        return now.format(formatter);
    }


    private static LocalDateTime parseStringToDateTime1(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a", Locale.ENGLISH);
        return LocalDateTime.parse(dateStr, formatter);
    }

    private static LocalDateTime parseStringToDateTime2(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd.MM.yy 'г.' 'время:' HH:mm:ss", new Locale("ru"));
        return LocalDateTime.parse(dateStr, formatter);
    }
}