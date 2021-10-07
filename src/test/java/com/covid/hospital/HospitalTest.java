package com.covid.hospital;

import com.covid.patient.Patient;
import com.covid.patient.Symptom;
import org.junit.jupiter.api.Test;

class HospitalTest {

    @Test
    public void testReserveBed() {
        Patient patient = new Patient("Patient1", 23, Symptom.SYMPTOMATIC);
        Hospital hospital = new Hospital();
        assert (hospital.reserveBed(patient) == true);
    }

}