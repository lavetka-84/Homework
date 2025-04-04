package Homework13;
import java.util.ArrayList;
import java.util.List;

class Group {
    private String groupNumber;
    private List<Student> students;

    public Group(String groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudentsByMark(double mark) {
        List<Student> studentsToRemove = new ArrayList<>();
        for (Student student : students) {
            if (student.getAverage() < mark) {
                studentsToRemove.add(student);
            }
        }

        students.removeAll(studentsToRemove);
    }


    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            for (Student student : students) {
                newGroup.addStudent(student);
            }
            students.clear();
        }
    }

    public double calculateAverageMark() {
        if (students.isEmpty()) return 0;
        double sum = 0;
        for (Student student : students) {
            sum += student.getAverage();
        }
        return sum / students.size();
    }
}