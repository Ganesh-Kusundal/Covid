package com.covid.patient;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {
    public int compare(Patient p1, Patient p2) {
        if (p1.getSymptom() == Symptom.SYMPTOMATIC)
            return -1;
        if (p1.getSymptom() == Symptom.ASYMPTOMATIC)
            return 1;
         return 0;
    }
}

