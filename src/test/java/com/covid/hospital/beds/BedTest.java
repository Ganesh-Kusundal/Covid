package com.covid.hospital.beds;

import com.covid.patient.Patient;
import com.covid.patient.Symptom;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BedTest {
    @Test
    public void testGetNumberOfDaysRemaining() throws Exception{

        Patient patient = new Patient("TestPatient", 25, Symptom.SYMPTOMATIC);
        Bed bed = new Bed(patient, 14);

        assert(bed.getNumberOfDaysRemaining() == 14);
    }
}