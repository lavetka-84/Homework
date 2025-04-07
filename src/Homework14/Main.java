package Homework14;

public class Main {

    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Иван", "Иванов", "Ковид", 30, Gender.МУЖСКОЙ);
        Patient p2 = new Patient(2, "Петр", "Петров", "Ковид", 25, Gender.МУЖСКОЙ);
        Patient p3 = new Patient(3, "Сергей", "Сергеев", "Ковид", 40, Gender.МУЖСКОЙ);
        Patient p4 = new Patient(4, "Анна", "Иванова", "ОРВИ", 22, Gender.ЖЕНСКИЙ);
        Patient p5 = new Patient(5, "Мария", "Петрова", "ОРВИ", 28, Gender.ЖЕНСКИЙ);
        Patient p6 = new Patient(2, "Петр", "Петров", "Ковид", 25, Gender.МУЖСКОЙ);

        Room room1 = new Room(15, RoomType.МУЖСКАЯ);
        Room room2 = new Room(16, RoomType.ЖЕНСКАЯ);

        room1.addPatient(p1);
        room1.addPatient(p2);
        room1.addPatient(p3);
        room1.addPatient(p6);

        room2.addPatient(p4);
        room2.addPatient(p5);

        Department dep = new Department("Отделение Терапии №1");
        dep.addRoom(room1);
        dep.addRoom(room2);

        room1.printPatients();
        room2.printPatients();

        System.out.println("Количество мужчин в отделении: " + dep.countGender(Gender.МУЖСКОЙ));
        System.out.println("Количество женщин в отделении: " + dep.countGender(Gender.ЖЕНСКИЙ));
    }
}





