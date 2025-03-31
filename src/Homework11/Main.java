package Homework11;

public class Main {

    public static void main(String[] args) {
        RobotCook cook = new RobotCook("Робот-Повар", 500, "Китай", "Индукционная плита");
        RodotSaper sapper = new RodotSaper("Робот-Сапёр", 700, "II-900", "Титан");
        RobotBuilder builder = new RobotBuilder("Робот-Строитель", 600, "Германия", "Подъемный кран", "Сталь");
//Задание.1.1-1.4
        cook.turnOn();
        cook.uniquePossibility();
        cook.repairRobot();
        cook.turnOff();

        sapper.turnOn();
        sapper.uniquePossibility();
        sapper.repairRobot();
        sapper.turnOff();

        builder.turnOn();
        builder.uniquePossibility();
        builder.repairRobot();
        builder.turnOff();

//Задание 1.5-1.6
    Robot[] allRobots = {cook, sapper, builder};
    RobotEngener[] engineerRobots = {sapper, builder};
    RodotSaper[] sapperRobots = {sapper};

        System.out.println("Способности всех роботов:");
        for (Robot robot : allRobots) {
        robot.turnOn();
        robot.uniquePossibility();
        robot.repairRobot();
        robot.turnOff();
    }

        System.out.println("Демонстрация создания предметов роботами-инженерами:");
        for (RobotEngener engineer : engineerRobots) {
        engineer.createItem();
    }
}
}
