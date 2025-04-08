package Homework14;

import java.util.Objects;

public class Patient {
    private int id;
    private String firstName;
    private String lastName;
    private String diagnos;
    private int age;
    private Gender gender;

    public Patient(int id, String firstName, String lastName, String diagnos, int age, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.diagnos = diagnos;
        this.age = age;
        this.gender = gender;
    }

    public String getDiagnosis() {
        return diagnos;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", возраст: " + age + ", диагноз: " + diagnos + ", пол: " + gender;
    }
}



