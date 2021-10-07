package com.covid;

import com.covid.hospital.Hospital;
import com.covid.patient.Patient;
import com.covid.patient.PatientComparator;
import com.covid.patient.Symptom;

import java.util.PriorityQueue;

public class BedReservation {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>(new PatientComparator());

        //Create Input Data Queue
        for (int i = 0; i < 50; i++) {
            pq.add(new Patient("Patient" + i, 25 + i, i % 2 == 0 ? Symptom.SYMPTOMATIC : Symptom.ASYMPTOMATIC));
        }

        Hospital hospital = new Hospital();

        //Reserve bed
        pq.parallelStream().forEach(e -> {
            if (hospital.reserveBed(e))
                System.out.println("Bed Reserved for Patient -" + e.getPatientName());
            else
                System.out.println("Bed Not Reserved for Patient -" + e.getPatientName());
        });


    }
}
