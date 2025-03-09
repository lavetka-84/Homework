package Homework7;

// создание класса студентов
public class Students {
    public int id;
    public String name;
    public String surname;
    public String faculty;
    public int course;
    public String group;
    public int grade;

    // Конструктор с параметрами
    public Students(int id, String name, String surname, String faculty, int course, String group, int grade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.grade = grade;
    }

    // Конструктор без параметров
    public Students() {
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.faculty = "";
        this.course = 0;
        this.group = "";
        this.grade = 0;
    }

    // Метод для вывода информации о студенте
    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Faculty: " + faculty);
        System.out.println("Course: " + course);
        System.out.println("Group: " + group);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    // метод для изменения группы
    public void changeGroup(String newGroup) {
        group = newGroup;
    }

    // Метод для получения текущей группы студента
    public String getGroup() {
        return group;

    }
    // Метод для изменения оценки и группы
    public void changeGradeGroup(int newGrade, String newGroup) {
        grade = newGrade;
        group = newGroup;
    }
    // Метод для студентов с оценкой выше переданного значения
    public static Students[] getStudents(Students[] students, int gradest) {
        // Считаем количество студентов, у которых оценка выше переданного порога
        int count = 0;
        for (Students student : students) {
            if (student.grade > gradest) {
                count++;
            }
        }

        // новый массив
        Students[] result = new Students[count];
        int index = 0;
        for (Students student : students) {
            if (student.grade > gradest) {
                result[index++] = student;
            }
        }

        return result;
    }
}




