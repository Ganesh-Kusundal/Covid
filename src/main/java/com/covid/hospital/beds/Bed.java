package com.covid.hospital.beds;

import com.covid.patient.Patient;

public class Bed {
    private Patient patient;
    //Number of days can be replaced with date, so number of days remaining can be derived.
    private int numberOfDays;


    public Bed(Patient patient, int numberOfDays) {
        this.patient = patient;
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDaysRemaining() {
        return numberOfDays;
    }
}
