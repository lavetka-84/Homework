package Homework14;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int number;
    private RoomType type;
    private List<Patient> patients;

    public Room(int number, RoomType type) {
        this.number = number;
        this.type = type;
        this.patients = new ArrayList<>();
    }

    public boolean addPatient(Patient patient) {
        if (patients.size() >= 3) {
            return false;
        }

        if (type == RoomType.МУЖСКАЯ && patient.getGender() != Gender.МУЖСКОЙ) {
            return false;
        }
        if (type == RoomType.ЖЕНСКАЯ && patient.getGender() != Gender.ЖЕНСКИЙ) {
            return false;
        }

        if (!patients.isEmpty()) {
            String existingDiagnosis = patients.get(0).getDiagnosis();
            if (!existingDiagnosis.equals(patient.getDiagnosis())) {
                return false;
            }
        }

        if (!patients.contains(patient)) {
            patients.add(patient);
            return true;
        }

        return false;
    }

    public int countByGender(Gender gender) {
        int count = 0;
        for (Patient p : patients) {
            if (p.getGender() == gender) {
                count++;
            }
        }
        return count;
    }

    public void printPatients() {
        System.out.println("Пациенты палаты " + number + ":");
        for (Patient p : patients) {
            System.out.println(p);
        }
    }
    public List<Patient> getPatients() {
        return patients;
    }
}
