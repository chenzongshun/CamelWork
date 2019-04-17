package com.uindata.czs.dict;

import java.util.ArrayList;
import java.util.List;

public class xls唯一的 {
    public static void main(String[] args) {
        List<String > items = new ArrayList<>();
       
        
        items.add ("emr_basicpatient");
        items.add ("emr_basichealth");
        items.add ("emr_healthevents");
        items.add ("emr_medicalbill");
        
        items.add ("OUTPATIENT_EMERGENCY_RECORDS");
        items.add ("EMERGENCY_MEDICAL_RECORDS");
        
        items.add ("PRESCRIPTION_west");
        items.add ("PRESCRIPTION_chine");
        
        items.add ("INSPECTION_RECORD");
        items.add ("SURVEY_RECORD");
        
        items.add ("TREATMENT_RECORD");
        items.add ("GENERAL_OPERATION_RECORDS");
        items.add ("VISITS_REC_BEF_ANESTHESIA");
        items.add ("ANESTHESIA_RECORDS");
        items.add ("VISITS_REC_AFT_ANESTHESIA");
        items.add ("TRANSFUSION_RECORD");
        
        items.add ("EXPECTANT_RECORD");
        items.add ("VBNC_RECORD");
        items.add ("CAESAREAN_SECTION_RECORD");
        
        items.add ("GENERAL_CARER_ECORDS");
        items.add ("WORSE_PATIENT_CARE_RECORD");
        items.add ("OPERATION_CARE_RECORD");
        items.add ("MONITOR_VITAL_SIGNS_RECORD");
        items.add ("INTAKE _OUTPUT_RECORD");
        items.add ("PRECIOUS_CONSUM_USAGE_RECORD");
        
        items.add ("ADMISSION_ASSESSMENT");
        items.add ("CARE_PLAN");
        items.add ("DISCHARGE_ASSESSMENT");
        
        items.add ("OPERATION_INFORMED_CONSENT");
        items.add ("CSE_INFORMED_CONSENT");
        items.add ("TRANSFUSION_INFORMED_CONSENT");
        items.add ("SPECIAL_TREATMENT_CONSENT");
        items.add ("CRITICALLY_ILL_NOTICE");
        items.add ("OTHER_INFORMED_CONSENT");
        
        items.add ("INPATIENT_MEDICAL_RECORD");
        
        items.add ("CN_INPATIENT_MEDICAL_RECORD");
        
        items.add ("ADMISSION_RECORD");
        items.add ("H24_ADMISSION_DISCHARGE_RECORD");
        items.add ("HOURS24_ADMISSION_DEATH_RECORD");
        
        items.add ("FIRST_COURSE_RECORD");
        items.add ("DAILY_COURSE_RECORD");
        items.add ("SUPERIOR_DOCTOR_WARDROUND");
        items.add ("INTRACTABLE_DISCUSS_RECORD");
        items.add ("HANDOVER_RECORD");
        items.add ("TRANSFERENCE_RECORD");
        items.add ("PHASE_SUMMARY");
        items.add ("SALVAGE_RECROD");
        items.add ("CONSULTATION_RECORD");
        items.add ("PRE_OPERATION_SUMMARY");
        items.add ("PRE_OPERATION_DISCUSSION");
        items.add ("POSTOPERAT_FIRST_COURSE");
        items.add ("DISCHARGE_RECORD");
        items.add ("DEATH_RECORD");
        items.add ("DEATH_CASE_DISCUSSION_RECORD");
        
        items.add ("HOSPITALIZATION_ORDER");
        
        items.add ("DISCHARGE_ABSTRACT");
        
        items.add ("DIR_EFP_ROREG_INFO");
        
        items.add ("HOSPITAL_INFO");






        List<String > uin = new ArrayList<>();
        for (String str: items) {
            if(!uin.contains(str)){
                uin.add(str);
            }
            else {

                System.err.println(str);
            }
        }
        System.err.println (uin.size ()==items.size ());
    }
}
