package Homework13;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Илья", "Иванов", "01.01.2007", "Минск", 7.5);
        Student s2 = new Student("Петр", "Петров", "05.06.2006", "Витебск", 8.2);
        Student s3 = new Student("Анна", "Иванова", "12.03.2005", "Брест", 8.8);

        Group group1 = new Group("98");
        group1.addStudent(s1);
        group1.addStudent(s2);

        Group group2 = new Group("99");
        group2.addStudent(s3);

        Faculty faculty = new Faculty("Факультет Экономика");
        faculty.addGroup(group1);
        faculty.addGroup(group2);

        group1.removeStudentsByMark(8.0);
        group2.transferToGroup(group1);

        System.out.println("Средний балл группы: " + group1.calculateAverageMark());
    }
}
