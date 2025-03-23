package Homework7;

public class Homework7 {

    public static void main(String[] args) {
        Students student1 = new Students(1, "Екатерина", "Коваленко", "Экономика", 1, "E-101", 85);
        Students student2 = new Students(2, "Анна", "Кривко", "Физика", 2, "Ф-102", 90);
        Students student3 = new Students(3, "Александр", "Петров", "Математика", 3, "М-103", 75);


        System.out.println("Информация о первом студенте :");
        student1.info();

        System.out.println("Информация о втором студенте :");
        student2.info();

        System.out.println("Инфорация о третьем студенте:");
        student3.info();

        // Изменяем группу
        student1.changeGroup("Eкономика-102");
        student2.changeGroup("Физика-103");
        student3.changeGroup("Математика-104");

        // после изменения группы
        System.out.println("После изменения группы:");
        student1.info();
        student2.info();
        student3.info();

    // текущая группу студентов
        System.out.println("Текущая группа студента 1: " + student1.getGroup());
        System.out.println("Текущая группа студента 2: " + student2.getGroup());
        System.out.println("Текущая группа студента 3: " + student3.getGroup());

        //  изменение оценки и группы
        student1.changeGradeGroup(77, "Экономика/1/102");
        student2.changeGradeGroup(50, "Физика/2/103");
        student3.changeGradeGroup(99, "Математика/3/-104");

        //  после изменения группы и оценки
        System.out.println("Информация после изменения группы и оценки:");
        student1.info();
        student2.info();
        student3.info();
}
}









