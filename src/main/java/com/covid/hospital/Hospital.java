package com.covid.hospital;

import com.covid.doa.DataAccess;
import com.covid.hospital.beds.Bed;
import com.covid.patient.Patient;

import java.util.ArrayList;

public class Hospital {
    public static final int NUMBER_OF_DAYS = 14;
    private ArrayList<Bed> beds;
    private int numberOfBeds = DataAccess.BedTable.MAX_BEDS;

    public Hospital() {
        beds = new ArrayList<>();
    }

    public boolean reserveBed(Patient patient) {
        return reserveBed(patient, NUMBER_OF_DAYS);
    }

    public boolean reserveBed(Patient patient, int numberOfDays) {
        if (isBedAvailable()) {
            beds.add(new Bed(patient, numberOfDays));
            reserveBed();
            return true;
        }
        return false;
    }


    private void reserveBed() {
        numberOfBeds--;
    }

    private boolean isBedAvailable() {
        return numberOfBeds > 0;
    }
}
