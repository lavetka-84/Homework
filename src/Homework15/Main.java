package Homework15;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Иван", "Сергеев", 30, 5000);
        Employee e2 = new Employee(2, "Петр", "Петров", 28, 2000);
        Employee e3 = new Employee(3, "Сергей", "Иванов", 35, 3000);
        Employee e4 = new Employee(4, "Анна", "Иванова", 26, 5100);
        Employee e5 = new Employee(5, "Мария", "Миронова", 32, 2700);
        Employee e6 = new Employee(6, "Олег", "Шик", 45, 3750);
        Employee e7 = new Employee(7, "Наталья", "Смирнова", 40, 5400);
        Employee e8 = new Employee(8, "Дмитрий", "Дмитриев", 29, 3500);


        Map<Employee, String> employeeMap = new HashMap<>();
        employeeMap.put(e1, "Начальник цеха");
        employeeMap.put(e2, "Электрик");
        employeeMap.put(e3, "Водитель");
        employeeMap.put(e4, "Начальник цеха");
        employeeMap.put(e5, "Электрик");
        employeeMap.put(e6, "Водитель");
        employeeMap.put(e7, "Начальник цеха");
        employeeMap.put(e8, "Водитель");


        System.out.println("До повышения ЗП:");
        printEmployees(employeeMap);


        raiseSalary (employeeMap, "Водитель", 200);

        System.out.println("После повышения:");
        printEmployees(employeeMap);
    }

    private static void raiseSalary(Map<Employee, String> employees, String profession, int amount) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            Employee emp = entry.getKey();
            String prof = entry.getValue();

            if (prof.equals(profession)) {
                int currentSalary = emp.getSalary();
                emp.setSalary(currentSalary + amount); // увеличиваем зарплату
            }
        }
    }

    private static void printEmployees(Map<Employee, String> map) {
        for (Map.Entry<Employee, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " | Профессия: " + entry.getValue());
        }
    }
}


