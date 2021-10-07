package com.covid.patient;

public class Patient {
    private String name;
    private int age;
    private Symptom symptom;

    public Patient(String name, int age, Symptom symptom) {
        this.name = name;
        this.age = age;
        this.symptom = symptom;
    }

    public Symptom getSymptom() {
        return symptom;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "Name='" + name + '\'' +
                ", age=" + age +
                ", symptom=" + symptom +
                '}';
    }

    public String getPatientName() {
        return name;
    }
}
