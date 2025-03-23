package Homework7;

public class Massive {

    public static void main(String[] args){

        Students student1 = new Students(1, "Екатерина", "Коваленко", "Экономика", 1, "E-101", 85);
        Students student2 = new Students(2, "Анна", "Кривко", "Физика", 2, "Ф-102", 90);
        Students student3 = new Students(3, "Александр", "Петров", "Математика", 3, "М-103", 75);
        Students student4 = new Students(4, "Иван", "Грачев", "Информатика", 4, "И-104", 95);
        Students student5 = new Students(5, "Светлана", "Васильева", "Химия", 1, "Х-105", 60);


        Students[] students = {student1, student2, student3, student4, student5};

        Students[] topStudents = Students.getStudents(students, 82);
        System.out.println("Студенты с грейдом выше 82:");
        for (Students student : topStudents) {
            student.info();
        }
    }
}
