/**
 * 依据数据（湖南）科技有限公司 版权所有Copyright (C) 2012
 * <p>
 * $$Id$$
 * $$Revision$$
 * $$Author$$
 * $$Date$$
 */
package 数据集主题子集;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czs
 * @since 2019/4/22
 */
public class 去除字段名描述记录结果后要取单词
{
    public static void main (String[] args)
    {
        List<String> items  = new ArrayList<> ();

        items.add("     APGAR_CODE                              ");
        items.add("     VISIT_NO                                ");
        items.add("     B_ULTRA_RESULT                          ");
        items.add("     CT_RESULT                               ");
        items.add("     MRI_ULTRA_RESULT                        ");
        items.add("     DRUG_NAME                               ");
        items.add("     DRUG_USAGE                              ");
        items.add("     TCM_FOUR_OBSERVATIONS                   ");
        items.add("     TCM_FOUR_RESULTS                        ");
        items.add("     TCM_TREAT_OTHERCOST                     ");
        items.add("     DIALECTICAL_ACCROD                      ");
        items.add("     TCM_TREAT_CATEREDCOST                   ");
        items.add("     TCD_CPM_COST                            ");
        items.add("     CHIN_DECOC_DECWAY                       ");
        items.add("     TCD_DECOCTION_METHOD                    ");
        items.add("     CHIN_DRINK_DECWAY                       ");
        items.add("     TCD_MEDICATION_METHOD                   ");
        items.add("     TCD_USAGE                               ");
        items.add("     TCM_TREAT_DISPATCHCOST                  ");
        items.add("     TCD_DECOCTIONPIECES                     ");
        items.add("     TCD_DECOCTIONPIECES_DECOCTION           ");
        items.add("     TREAT_NOOPERATION_PHYSICSCOST           ");
        items.add("     TREAT_NOOPERATION_ITEMCOST              ");
        items.add("     TREAT_NOOPERATION_ITEMCOST              ");
        items.add("     TREAT_OPERATIONTREAT_COST               ");
        items.add("     TREAT_OPERATIONTREAT_COST               ");
        items.add("     OTHER_MEDICAL_TREATMENT                 ");
        items.add("     TCD_USAGE_TYPE                          ");
        items.add("     TCD_TYPE_CODE                           ");
        items.add("     DIAG_CLINICAL_COST                      ");
        items.add("     DIAG_CLINICAL_COST                      ");
        items.add("     OPERATION_DOCTOR_NAME                   ");
        items.add("     OPERATE_MZFS_ID                         ");
        items.add("     OPERATION_DOCTOR_NAME                   ");
        items.add("     OPERATOR_NAME                           ");
        items.add("     OPERATION_DOCTOR_SIGN                   ");
        items.add("     OPERTOR_CODE                            ");
        items.add("     APPLY_ABO_BLOOD                         ");
        items.add("     APPLY_RH_BLOOD                          ");
        items.add("     ANAESTHESIA_METHOD_FLAG                 ");
        items.add("     SIMULOPERATE_ANAESTHESIA_CODE           ");
        items.add("     INTENT_ANESTHESIA_CODE                  ");
        items.add("     COMPERE_SUMMARY_SUGGESTION              ");
        items.add("     COMPERE_SUMMARY_SUGGESTION              ");
        items.add("     COMPERE_NAME                            ");
        items.add("     CURRENTLY_TCM_DIAGCODE                  ");
        items.add("     CURRENTLY_TCM_SYMPTOMCODE               ");
        items.add("     CURRENTLY_WM_DIAGCODE                   ");
        items.add("     HANDOVER_DATATIME                       ");
        items.add("     HANDOVER_SIGN                           ");
        items.add("     CARDIOTACH                              ");
        items.add("     AFTER_DELIVERY_DRUG                     ");
        items.add("     BLOODPRESSUREH                          ");
        items.add("     POSTPARTUM_EXAMINATION_TIME             ");
        items.add("     PULSE                                   ");
        items.add("     BLOODPRESSUREL                          ");
        items.add("     POSTPARTUM_OBSERVATION_TIME             ");
        items.add("     INTERTUBEROUS_DIAMETER                  ");
        items.add("     PRENATAL_EXAMINATION_ABNORMAL           ");
        items.add("     POSTPARTUM_UTERINE_HEIGHT               ");
        items.add("     BLOOD_LOSSED                            ");
        items.add("     SUTURE_NEEDLE_NUMBER                    ");
        items.add("     PERINEAL_LACERATION_CODE                ");
        items.add("     OPERATION_CODE                          ");
        items.add("     BED_NO                                  ");
        items.add("     AREA_NO                                 ");
        items.add("     OPERATION_INDICATIONS                   ");
        items.add("     ANTE_PARTUM_WEIGHT                      ");
        items.add("     POSTPARTUM_UTERINE_CONTRACTION          ");
        items.add("     ANAL_EXAMINATION                        ");
        items.add("     DELIVERY_TIME                           ");
        items.add("     DELIVERY_SPECIAL_CONDITION              ");
        items.add("     SECOND_BIRTHPROCESS_TIME                ");
        items.add("     FULL_BIRTHPROCESS_TIME                  ");
        items.add("     FIRST_BIRTHPROCESS_TIME                 ");
        items.add("     THIRD_BIRTHPROCESS_TIME                 ");
        items.add("     BREATH_FREQUENCY                        ");
        items.add("     PATIENT_NAME                            ");
        items.add("     PATIENT_NAME                            ");
        items.add("     DEPT_NAME                               ");
        items.add("     UTERINE_WALL_SUTURE                     ");
        items.add("     PREPREGNANCY_WEIGHT                     ");
        items.add("     PMOUTH_OPFULL_TIME                      ");
        items.add("     UTERINE_ORIFICE_CONDITION               ");
        items.add("     CERVICAL_CONDITION                      ");
        items.add("     CERVICAL_SUTURE                         ");
        items.add("     AGE_YEAR                                ");
        items.add("     AGE_YEAR                                ");
        items.add("     AREA_NAME                               ");
        items.add("     POSTPARTUM_UTERINE_CONTRACTION          ");
        items.add("     POSTPARTUM_UTERINE_HEIGHT               ");
        items.add("     postoper_BLOOD_LOSSED                   ");
        items.add("     SPHYGMUS                                ");
        items.add("     EXTERNALCONJUGATE                       ");
        items.add("     FUNDUS_HEIGHT                           ");
        items.add("     EMBRYOLEMMA_CODE                        ");
        items.add("     ABDOMINAL_GIRTH                         ");
        items.add("     BIRTH_DATETIME                          ");
        items.add("     HEIGHT                                  ");
        items.add("     PREDELIVERY_DATETIME                    ");
        items.add("     PREDELIVERY_DATETIME                    ");
        items.add("     DELIVERY_DRUG                           ");
        items.add("     TUMOR_SIZE                              ");
        items.add("     TUMOR_SIZE                              ");
        items.add("     TUMOR_LOCATION                          ");
        items.add("     BIRTH_PROCESS                           ");
        items.add("     DELIVERY_DATETIME                       ");
        items.add("     AFTER_TREAT_PLAN                        ");
        items.add("     NEXT_TREATMENT_PLAN                     ");
        items.add("     INP_TOTALCOST_OWNPAY                    ");
        items.add("     CONSULTATION_DOCTOR_ORGNAME             ");
        items.add("     CONSULTATION_DOCTOR_SIGN                ");
        items.add("     CONSULTATION__ORGNAME                   ");
        items.add("     CONSULTATION_DEPT_NAME                  ");
        items.add("     CONSULTATION_DATATIME                   ");
        items.add("     INCISION_LOCATION                       ");
        items.add("     INP_COURSE                              ");
        items.add("     INP_COST_AMOUNT                         ");
        items.add("     TEMPERATURE                             ");
        items.add("     PHYSICALEXAM_TEMPERATURE                ");
        items.add("     OXYGEN_SUPPLY_TIME                      ");
        items.add("     REPAIR_PROCEDURE                        ");
        items.add("     ADVICE_ENDER_SIGN                       ");
        items.add("     PEDIATRICIAN_SIGN                       ");
        items.add("     PRESENTATION_POSITION                   ");
        items.add("     INP_DIAG_CODE                           ");
        items.add("     OTHER_DRUG_NAME                         ");
        items.add("     OTHER_DRUG_USE                          ");
        items.add("     DIAG_PLAN                               ");
        items.add("     ARCHIATER_DOCTOR_SIGN                   ");
        items.add("     PHYSICIAN_DOCTOR_SIGN                   ");
        items.add("     SUPER_DOCTOR_SIGN                       ");
        items.add("     SUPERIOR_DOCTOR_SIGN                    ");
        items.add("     MAIN_TREAT_MEASURES                     ");
        items.add("     DISEASE_OUTCOME_CODE                    ");
        items.add("     DISEASE_OUTCOME                         ");
        items.add("     OUTP_DIAGNOSIS_CN_CODE                  ");
        items.add("     DISHOSPITAL_TCM_DIAGCODE                ");
        items.add("     DISHOSPITAL_TCM_SYMPTOMCODE             ");
        items.add("     OUTP_DIAGNOSIS_TCM_CODE                 ");
        items.add("     DISHOSPITAL_DIAG_CODE                   ");
        items.add("     OUTP_DIAGNOSIS_TYPE_CODE                ");
        items.add("     DISHOSPITAL_WM_DIAGCODE                 ");
        items.add("     TCM_TREAT_COST                          ");
        items.add("     PAMNIOTIC_FLUID_VOLUME                  ");
        items.add("     FOREWATERS_VOLUME                       ");
        items.add("     CESAREAN_PROCESS                        ");
        items.add("     MEDICAL_TCDDIALECTIC_COST               ");
        items.add("     MEDICAL_TCD_DISCOST                     ");
        items.add("     ADVICE_END_DATETIME                     ");
        items.add("     ADVICE_CONTENT                          ");
        items.add("     ADVICE_OPEN_DATETIME                    ");
        items.add("     ADVICE_OPEN_DATETIME                    ");
        items.add("     ADVICE_EXEC_DATETIME                    ");
        items.add("     ADVICE_REMAKR                           ");
        items.add("     ADVICEPLAN_START_DATETIME               ");
        items.add("     ADVICEPLAN_END_DATETIME                 ");
        items.add("     ADVICE_ITEM_TYPE                        ");
        items.add("     DISCUSS_DATATIME                        ");
        items.add("     MEASURES_GUIDE_DESC                     ");
        items.add("     DOCTOR_SIGN                             ");
        items.add("     DOCTOR_SIGN                             ");
        items.add("     DOCTOR_NAME_SIGN                        ");
        items.add("     DOCTOR_SIGN_DATETIME                    ");
        items.add("     MAJOR_TECHNIQUE_FLAG                    ");
        items.add("     PROFE_TECHNICAL_TYPE                    ");
        items.add("     EDUCATIONAL_CONTENTS                    ");
        items.add("     REPLACE_SCHEME                          ");
        items.add("     EXP_SUPPLIER                            ");
        items.add("     EXP_CODE                                ");
        items.add("     EXP_FACTORY                             ");
        items.add("     FIRST_ASSISTANT_NAME                    ");
        items.add("     SECONDE_ASSISTANT_NAME                  ");
        items.add("     DRUG_DOSAGE                             ");
        items.add("     DRUG_USAGE_DOSAGE                       ");
        items.add("     SINGLE_DOSAGE                           ");
        items.add("     VISIT_NO                                ");
        items.add("     SALVAGE_NAMES                           ");
        items.add("     DEVELOPMENT_DEGREE_CODE                 ");
        items.add("     CANCEL_ADVICE_DATETIME                  ");
        items.add("     CANCEL_ADVICE_SIGN                      ");
        items.add("     CANCEL_PERSON_SIGN                      ");
        items.add("     CONCEPTION_CODE                         ");
        items.add("     BLOOD_TRANSFUSION_INDICATION            ");
        items.add("     BBLOOD_TRANSFUSION_INDICATION           ");
        items.add("     MEDICAL_COMMONLYOPERATION_COST          ");
        items.add("     MEDICAL_COMMONLYOPERATION_COST          ");
        items.add("     MEDICAL_OTHER_COST                      ");
        items.add("     MEDICAL_COMMONLYSERVICE_COST            ");
        items.add("     MEDICAL_COMMONLYSERVICE_COST            ");
        items.add("     BREATH_TYPE_FLAG                        ");
        items.add("     INSTRU_NURSE_NAME                       ");
        items.add("     NSTRUMENT_NURSE_NAME                    ");
        items.add("     INSTRUMENT_NURSE_SING                   ");
        items.add("     INP_REASON                              ");
        items.add("     PERSONAL_COST_AMOUNT                    ");
        items.add("     NURSING_SIGN                            ");
        items.add("     INTERNSHIP_DOCTOR_SIGN                  ");
        items.add("     REFRESHER_DOCTOR_SIGN                   ");
        items.add("     DISPOSAL_PLAN                           ");
        items.add("     PRE_ANAESTHESIA_DRUG                    ");
        items.add("     ABO_BLOOD                               ");
        items.add("     BLOOD_ABO_CODE                          ");
        items.add("     ABO_BLOOD_CODE                          ");
        items.add("     RH_BLOOD_CODE                           ");
        items.add("     RH_BLOOD                                ");
        items.add("     ABO_BLOOD                               ");
        items.add("     ABO_BLOOD_CODE                          ");
        items.add("     RH_BLOOD_CODE                           ");
        items.add("     RH_BLOOD                                ");
        items.add("     BLOOD_RH_CODE                           ");
        items.add("     ORG_OPINION                             ");
        items.add("     RECIPE_COSTS_AMOUNT                     ");
        items.add("     NURSING_OPERATION_RESULT                ");
        items.add("     NURSING_OPERATION_ITEM                  ");
        items.add("     NURSING_OPERATION_ITEM_NAME             ");
        items.add("     DELIVERY_TIMEGRAVIDITY_TIME             ");
        items.add("     UTERINE_CONDITIONS                      ");
        items.add("     SAFETY_NURSING_CODE                     ");
        items.add("     CREATE_DATETIME                         ");
        items.add("     RECORD_DATATIME                         ");
        items.add("     INTER_NAME                              ");
        items.add("     OPERATION_POSITION_NAME                 ");
        items.add("     OPERATIVE_SITE_NAME                     ");
        items.add("     RESCUE_BEGIN_DATETIME                   ");
        items.add("     SALVAGE_BEGIN_DATATIME                  ");
        items.add("     SALVAGE_END_DATETIME                    ");
        items.add("     RESCUE_END_DATETIME                     ");
        items.add("     OPERTOR_TARGET                          ");
        items.add("     OPERATOR_NUM                            ");
        items.add("     OPERATOR_NUMBER                         ");
        items.add("     ANESTHESIA_EFFECT                       ");
        items.add("     UTEROTONICS_USE                         ");
        items.add("     EXPLORATION_TREATMENT_UTERINE           ");
        items.add("     ADVICE_REMARK                           ");
        items.add("     ADVICE_CONTENT                          ");
        items.add("     LOCHIA_SITUATION                        ");
        items.add("     AFTDELIVERY_ICD_CODE                    ");
        items.add("     DOCTOR_ANES                             ");
        items.add("     UTERINE_CONTRACTION                     ");
        items.add("     OPERATION_START_TIME                    ");
        items.add("     DISPOSITION_PLAN                        ");
        items.add("     PAST_PREGNANCY_HISTORY                  ");
        items.add("     OPERATION_HISTORY                       ");
        items.add("     OPERATE_AFTER_NAME                      ");
        items.add("     SPECIAL_CASES_PREGNANCY                 ");
        items.add("     OPERATE_END_TIME                        ");
        items.add("     PREVENTIVE                              ");
        items.add("     CHECK_ADVICE_DATETIME                   ");
        items.add("     CHECK_PERSON_SIGN                       ");
        items.add("     ADVICE_CHECK_DATETIME                   ");
        items.add("     ADVICE_ITEM_CONTENT                     ");
        items.add("     MATTERS_NEEDING_ATTENTION               ");
        items.add("     ATTENTION                               ");
        items.add("     MATTERS_NEED_ATTENTION                  ");
        items.add("     ADVERSE_DRUG_REACTIONS                  ");
        items.add("     RESPIRATOR_MONITORING_ITEM              ");
        items.add("     RECIPE_REMARK                           ");
        items.add("     HEADPOS_DYSTOCIA_EVAL                   ");
        items.add("     SPECIAL_STATUS                          ");
        items.add("     EMERGENCY_RESCUE_RECORD                 ");
        items.add("     ORD_EXAM_RESULT                         ");
        items.add("     ORD_EXAM_RESULT                         ");
        items.add("     EXAM_GENERALEXAM_RESULT                 ");
        items.add("     INP_SITUATION                           ");
        items.add("     SYMPTOM_DESC                            ");
        items.add("     OUTP_ADIVCE                             ");
        items.add("     LIFESTYLE_COUNSELLING                   ");
        items.add("     DISHOSPITAL_STATUS                      ");
        items.add("     DISHOSPITAL_SITUATION                   ");
        items.add("     PHYSICALEXAM_LIMBS_RESULT               ");
        items.add("     PHYSICALEXAM_GENITALS_RESULT            ");
        items.add("     PHYSICALEXAM_HEADORGAN_RESULT           ");
        items.add("     OPERATION_ROOM_NO                       ");
        items.add("     OPERATOR_DATE                           ");
        items.add("     ANAESTHESIA_DOCTOR_NAME                 ");
        items.add("     ANESTHESIA_DOCTOR_SIGN                  ");
        items.add("     ANAESTHESIA_DOCTOR_NAME                 ");
        items.add("     OPERATION_BEGIN_DATETIME                ");
        items.add("     START_DATE_TIME                         ");
        items.add("     PRESENT_DISEASE_HISTORY                 ");
        items.add("     CURRENTLY_SITUATION                     ");
        items.add("     ECG_RESULT                              ");
        items.add("     ORG_NAME                                ");
        items.add("     DISEASE_HISTORY                         ");
        items.add("     DISEASES_HISTORY                        ");
        items.add("     OPERATION_HISTORY                       ");
        items.add("     CHIEF_COMPLAINT                         ");
        items.add("     OPERATION_AFTER_MEDICATION              ");
        items.add("     OPERATION_PRE_MEDICATION                ");
        items.add("     WARDROUNDS_RECORD                       ");
        items.add("     BRIEF_HISTORY                           ");
        items.add("     ILLNESS_CHANGE_SITUATION                ");
        items.add("     MR_EXCERPTS                             ");
        items.add("     PHYSICALEXAM_SKINMUCOSA_RESULT          ");
        items.add("     EXAM_SUPERFICIALLYMPH_RESULT            ");
        items.add("     SYMPTOMS_DESC                           ");
        items.add("     EXAM_NERVOUSSYSTEM_RESULT               ");
        items.add("     OPERATIION_END_DATETIME                 ");
        items.add("     END_DATE_TIME                           ");
        items.add("     PHYSICALEXAM_ANUS_RESULT                ");
        items.add("     LIVER_FUNCTION_RESULT                   ");
        items.add("     CHEST_X_RAY__RESULT                     ");
        items.add("     PHYSICALEXAM_CHEST_RESULT               ");
        items.add("     PHYSICALEXAM_SPINE_RESULT               ");
        items.add("     PHYSICALEXAM_ABDOMAN_RESULT             ");
        items.add("     DIAG_PROCESS_DESC                       ");
        items.add("     DIAGNOSE_DESC                           ");
        items.add("     DIAG_DESC                               ");
        items.add("     DIAG_TREAT_DESC                         ");
        items.add("     TRANSFER_PURPOSE                        ");
        items.add("     REFERRAL_REASON                         ");
        items.add("     REFERRAL_DESC                           ");
        items.add("     BLOOD_TRANSFUSION_PROCESS               ");
        items.add("     CATHETER_CARE_CODE                      ");
        items.add("     ENDOTRACHEAL_CARE_DESC                  ");
        items.add("     RECOVERY_COST                           ");
        items.add("     SKIN_CARE                               ");
        items.add("     FOLLOWUP_DATE                           ");
        items.add("     ISOLATION_TYPE_CODE                     ");
        items.add("     TREAT_TYPE_CODE                         ");
        items.add("     PHYSICALEXAM_NECK_RESULT                ");
        items.add("     DRAINAGE_MATERIAL                       ");
        items.add("     DRAINAGE_MATERIAL_NUM                   ");
        items.add("     OPERATION_INCISION_DESC                 ");
        items.add("     SKIN_DISINFECTION_DESC                  ");
        items.add("     NURSING_OBSERVATION_RESULT              ");
        items.add("     ISSUE_SSC_FLAG                          ");
        items.add("     ISSUE_ORA_FLAG                          ");
        items.add("     WITHDRAW_SSC_FLAG                       ");
        items.add("     WITHDRAW_ORA_FLAG                       ");
        items.add("     APGAR_SCORE                             ");
        items.add("     APGAR_GRADE                             ");
        items.add("     DISPOSE_OPINION                         ");
        items.add("     PATIENT_CONDITION                       ");
        items.add("     CASE_FEATURE                            ");
        items.add("     QUALITYCONTROL_DATE                     ");
        items.add("     QUALITYCONTROL_DOCTOR_SIGN              ");
        items.add("     QUALITYCONTROL_DATE                     ");
        items.add("     QUALITYCONTROL_DOCTOR_SIGN              ");
        items.add("     QUALITYCONTROL_NURSE_NAME               ");
        items.add("     PLACENTAL_EXPULSION_SITUATION           ");
        items.add("     DIALECTICAL_DESC                        ");
        items.add("     CHECK_PERSON_NAME                       ");
        items.add("     ALLOCATE_PERSON_NAME                    ");
        items.add("     ANAESTHESIA_RECOVERY                    ");
        items.add("     UNDERLYING_CAUSE_DEATH                  ");
        items.add("     DEATH_DIAG_NAME                         ");
        items.add("     DEATH_TCM_DIAGNAME                      ");
        items.add("     DEATH_TCM_SYMPTOMNAME                   ");
        items.add("     DEATH_WM_DIAGNAME                       ");
        items.add("     VISIT_REASONS                           ");
        items.add("     PUNCTURE_PROCESS                        ");
        items.add("     TOUR_NURSE_NAME                         ");
        items.add("     CIRCULATING_NURSE_SING                  ");
        items.add("     AGE_MONTH                               ");
        items.add("     AGE_MONTH                               ");
        items.add("     AGE_MONTH                               ");
        items.add("     AGE_MONTH                               ");
        items.add("     AGE_MONTH                               ");
        items.add("     AGE_MONTH                               ");
        items.add("     RECIPE_OPENDEPT_NAME                    ");
        items.add("     RECIPE_OPENDOCTOR_NAME                  ");
        items.add("     WARDROUNDS_DATATIME                     ");
        items.add("     ADVICE_OPENDOCTOR_NAME                  ");
        items.add("     ADVICE_OPENDOCTOR_SIGN                  ");
        items.add("     ADVICE_OPENDEPT_NAME                    ");
        items.add("     OPERATION_PLACE                         ");
        items.add("     ESTIMATED_FETAL_WEIGHT                  ");
        items.add("     EXAM_METHOD_CODE                        ");
        items.add("     PSYCHOLOGICAL_CARE_CODE                 ");
        items.add("     CARDIOTACH                              ");
        items.add("     CARDIOTACH                              ");
        items.add("     IN_OBSERVATION_DATETIME                 ");
        items.add("     EMERGENCY_OBSERVATION_COURSE            ");
        items.add("     PATIENT_AGENT_OPINION                   ");
        items.add("     PATIENT_AGENT_OPINION                   ");
        items.add("     PATIENT_AGENT_OPINION                   ");
        items.add("     SIGN_DATETIME                           ");
        items.add("     FAMILY_HISTORY                          ");
        items.add("     PERSON_HISTORY                          ");
        items.add("     BED_NO                                  ");
        items.add("     AREA_NO                                 ");
        items.add("     TCD_CPM_COST                            ");
        items.add("     TCD_CHM_COST                            ");
        items.add("     TCD_CHM_COST                            ");
        items.add("     BLOOD_COST                              ");
        items.add("     BLOOD_COST                              ");
        items.add("     BLOOD_COGULATIONFACTOR_COST             ");
        items.add("     TCD_CPM_PREPARATIONCOST                 ");
        items.add("     DRUG_ANTIBIOTICS_COST                   ");
        items.add("     DRUG_ANTIBIOTICS_COST                   ");
        items.add("     BLOOD_GLOBULIN_COST                     ");
        items.add("     BLOOD_ALBURMIN_COST                     ");
        items.add("     BLOOD_CELLFACTOR_COST                   ");
        items.add("     DRUG_COST                               ");
        items.add("     OPERATION_CODE                          ");
        items.add("     OTHER_COST                              ");
        items.add("     EXP_EXAM_COST                           ");
        items.add("     EXP_TREAT_COST                          ");
        items.add("     MEDICAL_NURSING_COST                    ");
        items.add("     TRANSFER_DEPT_NAME                      ");
        items.add("     TRANSFER_DEPT_NAME                      ");
        items.add("     DIAG_LABORATORY_COST                    ");
        items.add("     EXP_OPERTION_COST                       ");
        items.add("     DIAG_PATHOLOGY_COST                     ");
        items.add("     DIAG_PATHOLOGY_COST                     ");
        items.add("     DIAG_IMAGE_COST                         ");
        items.add("     DIAG_IMAGE_COST                         ");
        items.add("     BED_NO                                  ");
        items.add("     ROOM_NO                                 ");
        items.add("     AREA_NO                                 ");
        items.add("     Ward_NO                                 ");
        items.add("     BODY_WEIGHT                             ");
        items.add("     BODY_WEIGHT                             ");
        items.add("     Weight                                  ");
        items.add("     WEIGHT                                  ");
        items.add("     PHYSICALEXAM_WEIGHT                     ");
        items.add("     PACEMAKER_HEARTRATE                     ");
        items.add("     STOP_SMOKING_DAY                        ");
        items.add("     INITIAL_TCM_DIAGCODE                    ");
        items.add("     INITIAL_TCM_SYMPTOMCODE                 ");
        items.add("     INITIAL_WM_DIAGCODE                     ");
        items.add("     ASSESSMENT_DATETIME                     ");
        items.add("     NURSING_PROBLEMS                        ");
        items.add("     INP_TCM_DIAGCODE                        ");
        items.add("     INP_TCM_SYMPTOMCODE                     ");
        items.add("     INP_DIAG_CODE                           ");
        items.add("     INP_WM_DIAGCODE                         ");
        items.add("     INP_DIAG_CODE                           ");
        items.add("     INP_DOCTOR_SIGN                         ");
        items.add("     INP_DEPT_NAME                           ");
        items.add("     INP_ROOM                                ");
        items.add("     OPERATION_INDICATION                    ");
        items.add("     OPERATIVE_INDICATION                    ");
        items.add("     SYMPTOM_NAME                            ");
        items.add("     SYMPTOMPTOM                             ");
        items.add("     BIRTHDAY                                ");
        items.add("     PATIENT_BIRTHDAY                        ");
        items.add("     BIRTHPLACE_COUNTY                       ");
        items.add("     BIRTHPLACE_CITY                         ");
        items.add("     BIRTHPLACE_PROVINCE                     ");
        items.add("     SECOND_CLINIC                           ");
        items.add("     DRUG_USAGE                              ");
        items.add("     DUTY_NURSE_SIGN                         ");
        items.add("     INP_DOCTOR_SIGN                         ");
        items.add("     PHYSICIAN_DOCTOR_SIGN                   ");
        items.add("     DIRECTOR_SIGN                           ");
        items.add("     DEPT_DIRECTOR_SIGN                      ");
        items.add("     DISHOSPITAL_TCM_DIAGNAME                ");
        items.add("     DISHOSPITAL_TCM_SYMPTOMNAME             ");
        items.add("     DISHOSPITAL_WM_DIAGNAME                 ");
        items.add("     DISHOSPITAL_SYMPTOM                     ");
        items.add("     DISHOSPITAL_SIGNS                       ");
        items.add("     OUTP_DIAGNOSIS_TYPE_NAME                ");
        items.add("     DISHOSPITAL_DEPT_NAME                   ");
        items.add("     DISHOSPITAL_ROOM                        ");
        items.add("     BREATH_FREQUENCY                        ");
        items.add("     BREATH_FREQUENCY                        ");
        items.add("     MEDICAL_PAY_WAY                         ");
        items.add("     PAY_WAY                                 ");
        items.add("     BLOODTRANSFERED_TYPE_CODE               ");
        items.add("     OUTP_TCM_DIAGNAME                       ");
        items.add("     OUTP_DIAGNOSIS_TCM_NAME                 ");
        items.add("     OUTP_WM_DIAGNAME                        ");
        items.add("     OUTP_DIAG_NAME                          ");
        items.add("     INP_TOTALCOST                           ");
        items.add("     OUTP_DIAGNOSIS_CN_NAME                  ");
        items.add("     ORG_NAME                                ");
        items.add("     DEPT_NAME                               ");
        items.add("     INFORMED_CONSENT_NAME                   ");
        items.add("     WORKUNIT_NAME                           ");
        items.add("     DRUG_ALLERGY_FLAG                       ");
        items.add("     ALLERGY_DRUG                            ");
        items.add("     VISIT_DATETIME                          ");
        items.add("     TRANSFER_RECORD_TYPE                    ");
        items.add("     MARITAL_HISTORY                         ");
        items.add("     OPERATION_ROOM_NO                       ");
        items.add("     INP_DATETIME                            ");
        items.add("     INP_DATETIME                            ");
        items.add("     INP_DATE                                ");
        items.add("     DISHOSPITAL_DATE                        ");
        items.add("     DISHOSPITAL_DATETIME                    ");
        items.add("     INP_DAYS                                ");
        items.add("     DEPT_NAME                               ");
        items.add("     PATIENT_TYPE_CODE                       ");
        items.add("     DRINKING_PER_DAY                        ");
        items.add("     AGE_YEAR                                ");
        items.add("     AGE_YEAR                                ");
        items.add("     AGE_YEAR                                ");
        items.add("     OCCUPATION_TYPE_CODE                    ");
        items.add("     OCCUPATIENTION_TYPE_CODE                ");
        items.add("     OCCUPATIENTION_CLASS_CODE               ");
        items.add("     MARITAL_STATUS_CODE                     ");
        items.add("     MARITAL_STATUS_CODE                     ");
        items.add("     INP_DAYS                                ");
        items.add("     AREA_NAME                               ");
        items.add("     WORKUNIT_TOWNSHIP                       ");
        items.add("     WORKUNIT_COUNTY                         ");
        items.add("     WORKUNIT_CITY                           ");
        items.add("     WORKUNIT_VILLAGE                        ");
        items.add("     WORKUNIT_PROVINCE                       ");
        items.add("     WORKUNIT_ZIP_CODE                       ");
        items.add("     WORKUNIT_DOORS                          ");
        items.add("     WORKUNIT_PHONE                          ");
        items.add("     WORK_PHONE                              ");
        items.add("     PATIENT_DIRECTION_CODE                  ");
        items.add("     PSYCHOLOGICAL_STATUS                    ");
        items.add("     ACCOUNT_TOWNSHIP                        ");
        items.add("     ACCOUNT_COUNTY                          ");
        items.add("     ACCOUNT_CITY                            ");
        items.add("     ACCOUNT_VILLAGE                         ");
        items.add("     ACCOUNT_PROVINCE                        ");
        items.add("     ACCOUNT_ZIP_CODE                        ");
        items.add("     ACCOUNT_DOORS                           ");
        items.add("     NATIONNALITY_CODE                       ");
        items.add("     NATIONNALITY                            ");
        items.add("     NATIONNALITY_CODE                       ");
        items.add("     NATION                                  ");
        items.add("     OUTP_DIAGNOSIS_TCM_NAME                 ");
        items.add("     TCM_DIAG_CODE                           ");
        items.add("     TCM_SYMPTOM_CODE                        ");
        items.add("     DIAG_NAME                               ");
        items.add("     BASE_DESEASE_POSSIBLE_INFLU             ");
        items.add("     PATIENT_UNDERLYING_DISEASE              ");
        items.add("     DIAG_CODE                               ");
        items.add("     HEATH_CARD_NO                           ");
        items.add("     HEALTH_CARD_NO                          ");
        items.add("     HEATH_CARD_NO                           ");
        items.add("     INQU_CYCLE_CODE                         ");
        items.add("     INP_APPROACH                            ");
        items.add("     INP_APPROACH_CODE                       ");
        items.add("     DISEASE_HISTORY                         ");
        items.add("     ALLERGY_HISTORY                         ");
        items.add("     COMMUNICABLE_DISEASES_HISTORY           ");
        items.add("     INFECT_HISTORY                          ");
        items.add("     OPERATION_HISTORY                       ");
        items.add("     BLOOD_TRANSFUSION_HISTORY               ");
        items.add("     FIRST_VISIT_FLAG                        ");
        items.add("     MENSTRUATION_HISTORY                    ");
        items.add("     DEGREE_CODE                             ");
        items.add("     PATIENT_NAME                            ");
        items.add("     PATIENT_NAME                            ");
        items.add("     PATIENT_NAME                            ");
        items.add("     PATIENT_AGENT_SIGN                      ");
        items.add("     ADDRESS_TOWNSHIP                        ");
        items.add("     ADDRESS_TOWNSHIP                        ");
        items.add("     ADDRESS_COUNTY                          ");
        items.add("     ADDRESS_CITY                            ");
        items.add("     ADDRESS_VILLAGE                         ");
        items.add("     ADDRESS_VILLAGE                         ");
        items.add("     ADDRESS_PROVINCE                        ");
        items.add("     ADDRESS_DOORS                           ");
        items.add("     ADDRESS_TYPE_FLAG                       ");
        items.add("     SELF_CARE_STATUS                        ");
        items.add("     PATIENT_PHONE                           ");
        items.add("     CURRENT_PHONE                           ");
        items.add("     PATIENT_SIGN                            ");
        items.add("     RECEIVE_ORG_NAME                        ");
        items.add("     DISHOSPITAL_WAY_CODE                    ");
        items.add("     DISHOSPITAL_DISPOSITION_CODE            ");
        items.add("     CURRENT_TOWNSHIP                        ");
        items.add("     CURRENT_COUNTY                          ");
        items.add("     CURRENT_CITY                            ");
        items.add("     CURRENT_VILLAGE                         ");
        items.add("     CURRENT_PROVINCE                        ");
        items.add("     CURRENT_ZIP_CODE                        ");
        items.add("     CURRENT_DOORS                           ");
        items.add("     INP_DOCTOR_SIGN                         ");
        items.add("     DEATH_DATETIME                          ");
        items.add("     DEATH_DATE                              ");
        items.add("     DEATH_REASON                            ");
        items.add("     PHYSICALEXAM_BREATH_FREQUENCY           ");
        items.add("     SPHYGMUS                                ");
        items.add("     SPHYGMUS                                ");
        items.add("     PHYSICALEXAM_SPHYGMUS                   ");
        items.add("     LEGAL_AGENT_SIGN                        ");
        items.add("     SEX_CODE                                ");
        items.add("     SEX_CODE                                ");
        items.add("     PATIENT_SEX                             ");
        items.add("     MEDICALHIS_NAME                         ");
        items.add("     RELATION_CODE                           ");
        items.add("     CRITICAL_ILLNESS_CONTENT                ");
        items.add("     EMAIL                                   ");
        items.add("     IDENTITY_NO                             ");
        items.add("     SLEEP_STATUS                            ");
        items.add("     NATIVEPLACE_CITY                        ");
        items.add("     NATIVEPLACE_PROVINCE                    ");
        items.add("     OUT_ROOM_DATETIME                       ");
        items.add("     OUT_OPERATEROOM_DATETIME                ");
        items.add("     PULM_FUNCTION_RESULT                    ");
        items.add("     ABDOMINAL_GIRTH                         ");
        items.add("     NUTRITION_STATUS                        ");
        items.add("     DISHOSPITAL_31D_BACKPURPOSE             ");
        items.add("     DISCUSS_PLACE                           ");
        items.add("     IDENTITY_TYPE                           ");
        items.add("     PHYSICALEXAM_HEIGHT                     ");
        items.add("     OVERINTO_DATATIME                       ");
        items.add("     INSTI_DEPART_TRANSI_NAME                ");
        items.add("     RECEIV_MECHAN_IN                        ");
        items.add("     OVERINTO_DIAGPLAN                       ");
        items.add("     OVERINTO_DEPT_NAME                      ");
        items.add("     OVERINTO_DEPT_SIGN                      ");
        items.add("     TURNOUT_DEPT_NAME                       ");
        items.add("     TRANSFER_DATATIME                       ");
        items.add("     INSTI_DEPART_TRANSO_NAME                ");
        items.add("     RECEIV_MECHANOUT_CODE                   ");
        items.add("     REFERRAL_DATE                           ");
        items.add("     AUXILIARYEXAMI_RESULT                   ");
        items.add("     AUXILIARYEXAMI_ITEM                     ");
        items.add("     AUXILIARYEXAMI_RESULT                   ");
        items.add("     AUXILIARYEXAMI_RESULT                   ");
        items.add("     AUXILIARYEXAMI_ITEM                     ");
        items.add("     AUXILIARYEXAMI_RESULT                   ");
        items.add("     BLOOD_TRANSFERED_DATETIME               ");
        items.add("     SMOKING_STATUS                          ");
        items.add("     ENTER_ROOM_DATETIME                     ");
        items.add("     INTO_ROOM_WAY                           ");
        items.add("     OUTP_COST_AMOUNT                        ");
        items.add("     PREVENT_HISTORY                         ");
        items.add("     PREVENTIVE_INOCULATION_HISTORY          ");
        items.add("     DRINKING_FREQUENCY                      ");
        items.add("     DIETARY_STATUS_CODE                     ");
        items.add("     AFTER_OPERATION_DAY                     ");
        items.add("     UTEROTONICS_NAME                        ");
        items.add("     RESCUE_PERSONNEL_LIST                   ");
        items.add("     SALVAGE_NAMES                           ");
        items.add("     ANESTH_DRUG_NAME                        ");
        items.add("     OPERATOR_METHOD                         ");
        items.add("     BLOOD_LOSSED                            ");
        items.add("     OPERATION_BLEEDING                      ");
        items.add("     OPERATION_BLEEDING                      ");
        items.add("     OPEATION_POSSIBLE_VENTURE               ");
        items.add("     OPERATE_ALL_TIME                        ");
        items.add("     OPERATION_CUTHEAL_CODE                  ");
        items.add("     OPERATTION_CUTHEAL_TYPE                 ");
        items.add("     OPERATION_BEFORE_PREPARE                ");
        items.add("     PREOPERATIVE_READY                      ");
        items.add("     OPERATION_ASSISTANT_NAME                ");
        items.add("     OPEA_AFTER_POS_VENTURE                  ");
        items.add("     HANDOVER_DATETIME                       ");
        items.add("     OPERATE_DRUG                            ");
        items.add("     OPERATION_PLANS                         ");
        items.add("     OPERATION_MATERNITY                     ");
        items.add("     OPERATION_LOCATION_FLAG                 ");
        items.add("     TREAT_OPERATIONTREAT_OPERCOST           ");
        items.add("     TREAT_OPER_ANAESTHESIACOST              ");
        items.add("     TREAT_OPER_ANAESTHESIACOST              ");
        items.add("     OPERATE_DRUG_DOSAGE                     ");
        items.add("     OPERATION_POINTS                        ");
        items.add("     OPERATE_INFUSION_ITEM                   ");
        items.add("     OPERATION_PROCESS_DESC                  ");
        items.add("     SURGICAL_INDICATION                     ");
        items.add("     EXEC_PERSON_SIGN                        ");
        items.add("     ADVICE_EXEC_SIGN                        ");
        items.add("     EXEC_DEPT_NAME                          ");
        items.add("     NURSING_OBSERVATION_NAME                ");
        items.add("     Nurse_SIGN                              ");
        items.add("     NURSING_SIGN                            ");
        items.add("     NURSING_TYPE_CODE                       ");
        items.add("     NURSING_GRADE_CODE                      ");
        items.add("     NURSING_OBSERVATION_NAME                ");
        items.add("     NURSING_OBSERVATION_NAME                ");
        items.add("     NURSING_OBSERVATION_NAME                ");
        items.add("     INTENT_OPERATE_CODE                     ");
        items.add("     SIMULOPERATION_CODE                     ");
        items.add("     OPERATION_METHOD                        ");
        items.add("     OPERATION_CONTRAINDICATION              ");
        items.add("     SURGERY_CONTRAINDICATION                ");
        items.add("     OPERATIVE_SIGN                          ");
        items.add("     OPERATOR_SIGN                           ");
        items.add("     INTENT_OPERATE_DATETIME                 ");
        items.add("     INTENT_TRANSFUSION_DATE                 ");
        items.add("     SPEICAL_EXAMTREAT_ITEM                  ");
        items.add("     SPEICAL_EXAMTREAT_INTENT                ");
        items.add("     SPEICAL_EXAMTREAT_COMPLICATION          ");
        items.add("     CONTACT_NAME                            ");
        items.add("     CONTACTS_NAME                           ");
        items.add("     OPTERTOR_NAME                           ");
        items.add("     OPERATION_NAME                          ");
        items.add("     PATHOLOGY_NO                            ");
        items.add("     MR_QUALITY_CODE                         ");
        items.add("     MR_QUALITY_CODE                         ");
        items.add("     VERIFY_PERSON_NAME                      ");
        items.add("     DISPENSING_PERSON_NAME                  ");
        items.add("     OPERATION_GRADE                         ");
        items.add("     INP_NO                                  ");
        items.add("     OUTP_NO                                 ");
        items.add("     INP_NO                                  ");
        items.add("     INFORMED_CONSENT_NO                     ");
        items.add("     APPLY_NO                                ");
        items.add("     ELECTRONIC_APPLY_NO                     ");
        items.add("     INP_NO                                  ");
        items.add("     RECIPE_NO                               ");
        items.add("     OUTP_NO                                 ");
        items.add("     BLOOD_NO                                ");
        items.add("     INP_NO                                  ");
        items.add("     HANDOVER_DIAGPLAN                       ");
        items.add("     TAKE_DATATIME                           ");
        items.add("     TAKE_SIGN                               ");
        items.add("     MIDWIVES_SIGN                           ");
        items.add("     OPERATOR_DESC                           ");
        items.add("     SYSTOLIC_PRESSURE                       ");
        items.add("     SYSTOLIC_PRESSURE                       ");
        items.add("     PHYSICALEXAM_SYSTOLIC_PRESSURE          ");
        items.add("     BIRTH_WEIGHT                            ");
        items.add("     NEWBORN_BIRTH_WEIGHT                    ");
        items.add("     BIRTH_WEIGHT                            ");
        items.add("     NEWBORN_HEIGHT                          ");
        items.add("     NEWBORN_HEIGHT                          ");
        items.add("     NEWBORN_ABNORMAL_CODE                   ");
        items.add("     NEWBORN_INP_WEIGHT                      ");
        items.add("     NEWBORN_SEX                             ");
        items.add("     PAST_HISTORY                            ");
        items.add("     BLOOD_TRANSFUSION_CODE                  ");
        items.add("     BLOOD_TRANSFUSION_HISTORY               ");
        items.add("     ANESTH_COMPLIC_CODE                     ");
        items.add("     CLINICAL_PATH_CODE                      ");
        items.add("     DEATHPATIENT_AUTOPSY_FLAG               ");
        items.add("     DEATHPATIENT_AUTOPSY_FLAG               ");
        items.add("     ADVICE_EXEC_STATUS                      ");
        items.add("     SMOKING_PER_DAY                         ");
        items.add("     DOSAGE_TOTAL                            ");
        items.add("     USAGE_DOSAGE_TOTAL                      ");
        items.add("     DRUG_USAGE_TOTAL                        ");
        items.add("     DRUG_USAGE_TOTAL                        ");
        items.add("     LAST_MENSTRUAL_PERIOD                   ");
        items.add("     MR_NO                                   ");
        items.add("     TCD_DECOCTIONPIECES_FORM                ");
        items.add("     OPERATION_ITEM                          ");
        items.add("     OPERATION_INFUSION                      ");
        items.add("     TRANS_UNIT                              ");
        items.add("     COMPERE_NAME                            ");
        items.add("     DISCUSS_CONCLUSION                      ");
        items.add("     DISCUSS_SUGGESTION                      ");
        items.add("     PREOPERATION_DIAG_CODE                  ");
        items.add("     PRE_OPERATION_CODE                      ");
        items.add("     PREOPERATION_DIAG                       ");
        items.add("     OPERATE_ANESTHESIA_ADVICE               ");
        items.add("     CARDIOTACH                              ");
        items.add("     BLOODPRESSUREH                          ");
        items.add("     POSTOPER_EXAMINATION_TIME               ");
        items.add("     PULSE                                   ");
        items.add("     BLOODPRESSUREL                          ");
        items.add("     POSTOPER_OBSERVATION_DATE               ");
        items.add("     AFTEROPERATION_DIAG_ICD                 ");
        items.add("     POSTPARTUM_BLADDER_FILLING              ");
        items.add("     FLATULENCE_CODE                         ");
        items.add("     MATERNALPERINEAL_INCISION_CODE          ");
        items.add("     PERINEAL_HEMATOMA_CODE                  ");
        items.add("     BODY_POSITION_CARE                      ");
        items.add("     TRACHEAL_INTUBATION_CODE                ");
        items.add("     DRUG_USAGE_FREQUENCY                    ");
        items.add("     DRUG_USAGE_FRE                          ");
        items.add("     FREQUENCY                               ");
        items.add("     PRENATAL_EXAMINATION_CODE               ");
        items.add("     ABNUMBERRMAL_UTERINE_EXP                ");
        items.add("     CERVICAL_LACERATION_CODE                ");
        items.add("     ISOLATION_INDICATOR                     ");
        items.add("     IS_AGREE_POSTMORTEM                     ");
        items.add("     HEALTH_STATUS                           ");
        items.add("     HEALTH_STATUS_CODE                      ");
        items.add("     COMMUNICABLE_DISEASES_FLAG              ");
        items.add("     INFECT_FLAG                             ");
        items.add("     RESPIRATOR_FLAG                         ");
        items.add("     ANESTHESIA_ANALGESIA_FLAG               ");
        items.add("     ANESTHESIA_SAFE_FLAG                    ");
        items.add("     SMOKING_FLAG                            ");
        items.add("     DPAP_FLAG                               ");
        items.add("     INCASIVE_OPERTOR_CODE                   ");
        items.add("     EMESIS_FLAG                             ");
        items.add("     DYSURIA_FLAG                            ");
        items.add("     DRINKING_FLAG                           ");
        items.add("     OPERATION_FLAG                          ");
        items.add("     ALLERGY_HOSTORY_FLAG                    ");
        items.add("     ALLERGY_HISTORY_TYPE                    ");
        items.add("     ALLERGY_FLAG                            ");
        items.add("     ALLERGY_HISTORY_FLAG                    ");
        items.add("     DISHOSPITAL_31D_BACKFLAG                ");
        items.add("     BLOODTRANSFERED_REACTION_CODE           ");
        items.add("     MENTAL_STATE_FLAG                       ");
        items.add("     SPIRIT_STATUS_FLAG                      ");
        items.add("     CLOSEBEFORE_CHECK_FLAG                  ");
        items.add("     CLOSEAFTER_CHECK_FLAG                   ");
        items.add("     EXP_IMPLANTABLE_FLAG                    ");
        items.add("     USE_TCMTECHNOLOGY_FLAG                  ");
        items.add("     USE_TCMEQUIPMENT_FLAG                   ");
        items.add("     USE_TCMPREPARATION_FLAG                 ");
        items.add("     TRACHEAL_INTUB_CODE                     ");
        items.add("     INFORM_DOCTOR_FLG                       ");
        items.add("     UMBILICAL_BLOOD_CORD                    ");
        items.add("     DIALECTIC_FLAG                          ");
        items.add("     DURING_OPERATION_FLAG                   ");
        items.add("     IS_DRAINAGE                             ");
        items.add("     PREOPERATION_CHECK_FLAG                 ");
        items.add("     VAGINAL_DELIVERY_CODE                   ");
        items.add("     INTACT_FETALMEMBRANES_CODE              ");
        items.add("     ABNUMBERRMAL_UMBILICAL_CORD             ");
        items.add("     BLADDER_FILLING_CODE                    ");
        items.add("     DOSAGE_UNIT                             ");
        items.add("     DRUG_DOSAGE_UNIT                        ");
        items.add("     ABNUMBERRMAL_UMBILICAL_CORD             ");
        items.add("     VAGINAL_HEMATOMA_CODE                   ");
        items.add("     LACERATION_VAGINA_CODE                  ");
        items.add("     IS_CREDIBLE                             ");
        items.add("     ADVICE_CHECKNURSE_SIGN                  ");
        items.add("     SPECIALTY_SITUATION                     ");
        items.add("     EDC_DESC                                ");
        items.add("     EDC_DESC                                ");
        items.add("     TREATMENT_PLAN                          ");
        items.add("     HEALTH_ASSESSMENT_DESC                  ");
        items.add("     ASA                                     ");
        items.add("     THERAPEUTIC_PRINCIPLE                   ");
        items.add("     THERAPEUTIC_PRINCIPLE                   ");
        items.add("     DIS_DEATH_RECORDS                       ");
        items.add("     DEATH_TCM_DIAGCODE                      ");
        items.add("     DEATH_TCM_SYMPTOMCODE                   ");
        items.add("     DEATH_DIAG_CODE                         ");
        items.add("     DEATH_WM_DIAGCODE                       ");
        items.add("     FETAL_HEART_RATE                        ");
        items.add("     ENDOTRACHEAL_CARE_CODE                  ");
        items.add("     RELATION_CODE                           ");
        items.add("     SIGN_DATETIME                           ");
        items.add("     LEGAL_AGENT_SIGN                        ");
        items.add("     POSITIVE_AUXILIARYEXAMI_RESULT          ");
        items.add("     POSITIVE_EXAM_RESULTS                   ");
        items.add("     CONSULTATION_SUGGESTION                 ");
        items.add("     CONSULTATION_REASON                     ");
        items.add("     INP_TCM_DIAGNAME                        ");
        items.add("     INP_TCM_SYMPTOMNAME                     ");
        items.add("     INP_WM_DIAGNAME                         ");
        items.add("     RECIPE_GROUP_NO                         ");
        items.add("     RECIPE_GROUP_NO                         ");
        items.add("     PHYSICAL_EXAM                           ");
        items.add("     ZIP_CODE                                ");
        items.add("     CONSULTATION_PURPOSE                    ");
        items.add("     APPLY_ORG_NAME                          ");
        items.add("     APPLY_DOCTOR_NAME                       ");
        items.add("     APPLY_DEPT_NAME                         ");
        items.add("     CONSULTATION_TYPE                       ");
        items.add("     COMPERE_NAME                            ");
        items.add("     DISCUSS_SUGGESTION                      ");
        items.add("     MORBIDITY_DATETIME                      ");
        items.add("     DIAG_EVIDENCE                           ");
        items.add("     HANDOVER_NURSE_SIGN                     ");
        items.add("     TRANSPORTER_SIGN                        ");
        items.add("     PATIENT_TRANSFER_CHECKITEM              ");
        items.add("     CRITICAL_ILLNESS_DATETIME               ");
        items.add("     CONDITION_EMERGENCY_MEASURES            ");
        items.add("     EXAM_SKIN_DESC                          ");
        items.add("     REASON_DEATH                            ");
        items.add("     REASON_DEATH_CODE                       ");
        items.add("     INFORMED_CONSENT_CONENT                 ");
        items.add("     BLOOD_GLUCOSE_VALUE                     ");
        items.add("     ORG_ID                                  ");
        items.add("     ORG_ID                                  ");
        items.add("     TREATING_DOCTOR_SIGN                    ");
        items.add("     TCM_DIAG_COST                           ");
        items.add("     AMNIOTIC_FLUID_CHARACTER                ");
        items.add("     AMNIOTIC_FLUID_CONDITION                ");
        items.add("     AMNIOTIC_FLUID_VOLUME                   ");
        items.add("     AMNIOTIC_FLUID_VOLUME                   ");
        items.add("     RELATION_CODE                           ");
        items.add("     RELATION                                ");
        items.add("     CONTACT_NAME                            ");
        items.add("     CONTACTS_NAME                           ");
        items.add("     CONTACT_TOWNSHIP                        ");
        items.add("     CONTACT_COUNTY                          ");
        items.add("     CONTACT_CITY                            ");
        items.add("     CONTACT_VILLAGE                         ");
        items.add("     CONTACT_PROVINCE                        ");
        items.add("     CONTACT_DOORS                           ");
        items.add("     CONTACT_TOWNSHIP                        ");
        items.add("     CONTACT_COUNTY                          ");
        items.add("     CONTACT_CITY                            ");
        items.add("     CONTACT_VILLAGE                         ");
        items.add("     CONTACT_PROVINCE                        ");
        items.add("     CONTACT_DOORS                           ");
        items.add("     CONTACT_PHONE                           ");
        items.add("     CONTACTS_PHONE                          ");
        items.add("     DELIVERY_OUTCOME_CODE                   ");
        items.add("     FETAL_CHILDBIRTH_WAY                    ");
        items.add("     FETAL_DISENGAGE_TIME                    ");
        items.add("     VAGINAL_DELIVERY_MODE                   ");
        items.add("     FETAL_POSITION_CODE                     ");
        items.add("     PLACENTAL_EXPULSION_TIME                ");
        items.add("     RUPTURE_MEMBRANES_DATETIME              ");
        items.add("     OXYHEMOGLOBIN_SATURATION                ");
        items.add("     UMBILICAL_CORD_LENGTH                   ");
        items.add("     UMBILICALCORD_WINDING_NUMBER            ");
        items.add("     UMBILICALCORD_WINDING_NUMBER            ");
        items.add("     ABDOMINAL_EXPLORATION_UTERUS            ");
        items.add("     ABDOMINAL_EXP_ACCESSORIES               ");
        items.add("     DIASTOLIC_PRESSURE                      ");
        items.add("     DIASTOLIC_PRESSURe                      ");
        items.add("     DIASTOLIC_PRESSURE                      ");
        items.add("     EXAM_DIASTOLIC_PRESSURE                 ");
        items.add("     DRUG_USAGE_WAY                          ");
        items.add("     ROUTE_ADMINISTRATION                    ");
        items.add("     DRUG_FORM                               ");
        items.add("     DRUG_FORM_CODE                          ");
        items.add("     DRUG_SPEC                               ");
        items.add("     DRUG_NAME                               ");
        items.add("     ANAESTHESIA_DRUG_NAME                   ");
        items.add("     DRUG_USAGE                              ");
        items.add("     NUTRITION_CARE                          ");
        items.add("     ADIVCE_TYPE_CODE                        ");
        items.add("     BLOODTRANSFERED_REASON                  ");
        items.add("     PLANNED_DELIVERY_CODE                   ");
        items.add("     RECORD_SIGN                             ");
        items.add("     RECORD_SIGN                             ");
        items.add("     STAGE_SUMMARY_DATATIME                  ");
        items.add("     CURRENTLY_TCM_DIAGCODE                  ");
        items.add("     CURRENTLY_TCM_SYMPTOMCODE               ");
        items.add("     CURRENTLY_WM_DIAGCODE                   ");
        items.add("     DIAGTREAT_PROCESSES_NAME                ");
        items.add("     RECEIVE_DOCTOR_SIGN                     ");
        items.add("     RECEPTION_NURSING_SIGN                  ");
        items.add("     RESPONSIBLE_DOCTOR                      ");
        items.add("     CODER_SIGN                              ");
        items.add("     TURNOUT_DOCTOR_SIGN                     ");
        items.add("     CURRENTLY_TCM_DIAGCODE                  ");
        items.add("     CURRENTLY_TCM_SYMPTOMCODE               ");
        items.add("     CURRENTLY_WM_DIAGCODE                   ");
        items.add("     REFERRAL_DOCTOR_NAME                    ");
        items.add("     BLOODTRANSFUSION_TYPE_CODE              ");
        items.add("     BLOOD_TRANSFUSION_VARIETY_CODE          ");
        items.add("     BLOOD_TRANSFERED                        ");
        items.add("     BLOOD_TRANSFERED_VALUE                  ");
        items.add("     BLOODTRANSFERED_VALUE_DOSAGE            ");
        items.add("     BLOODTRANSFERED_VALUE_DOSAGE            ");
        items.add("     BLOOD_TRANSFUSION_EXAM_ITEM             ");
        items.add("     BLOOD_TRANSFUSION_WAY                   ");
        items.add("     BLOOD_NATURE_CODE                       ");
        items.add("     TRANS_INGREDIENTS                       ");
        items.add("     TIME_BLOOD                              ");
        items.add("     BIRTHPROCESS_RECORD_SIGN                ");
        items.add("     FOLLOWUP_CODE                           ");
        items.add("     RESCUE_MEASURES                         ");
        items.add("     NURSING_OPERATION_NAME                  ");
        items.add("     SIGN_DATETIME                           ");
        items.add("     SIGN_DATATIME                           ");
        items.add("     INFORM_DOCTOR_DATETIME                  ");
        items.add("     TCM_TREAT_EXTERNALCOST                  ");
        items.add("     TCM_TREAT_COST                          ");
        items.add("     TCM_TREAT_MASSAGECOST                   ");
        items.add("     TCM_TREAT_ANORECTALCOST                 ");
        items.add("     TCM_TREAT_SPECIALCOST                   ");
        items.add("     TCM_TREAT_ACUPUNCTURECOST               ");
        items.add("     TCM_TREAT_BONEFRACTURECOST              ");
        items.add("     RUPTURE_MEMBRANE_CODE                   ");
        items.add("     PREPARE_ITEM                            ");
        items.add("     RECIPE_OPEN_DATE                        ");
        items.add("     RECIPE_EFFECTIVE_DAY                    ");
        items.add("     RECIPE_TYPE_CODE                        ");
        items.add("     OUTP_TCM_DIAGCODE                       ");
        items.add("     OUTP_TCM_SYMPTOMCODE                    ");
        items.add("     OUTP_DIAG_CODE                          ");
        items.add("     OUTP_WM_DIAGCODE                        ");
        items.add("     TREATMENT_VAGINAL_HEMATOMA              ");
        items.add("     VAGINAL_HEMATOMA_Size                   ");
        items.add("     IDENTIFY_WM_DIAGNAME                    ");
        items.add("     IDENTIFY_TCM_DIAGNAME                   ");
        items.add("     IDENTIFY_TCM_SYMPTOMNAME                ");
        items.add("     HEADINJURY_INPBEFORE_MIN                ");
        items.add("     HEADINJURY_INPBEFOR_MIN                 ");
        items.add("     HEADINJURY_INPBEFORECOMA_DAY            ");
        items.add("     HEADINJURY_INPBEFORECOMA__HOUR          ");
        items.add("     HEADINJURY_INPAFTERCOMA_MINUTE          ");
        items.add("     HEADINJURY_INPAFTERCOMA_DAY             ");
        items.add("     HEADINJURY_INPAFTERCOMA__HOUR           ");
        items.add("     DIET_GUIDE_CODE                         ");
        items.add("     EXP_NAME                                ");
        items.add("     EXP_UNIT                                ");
        items.add("     QUANTITY                                ");
        items.add("     USE_APPROACH                            ");
        items.add("     ANAESTHESIA_POSSIBLE_ACCIDENT           ");
        items.add("     Anesthesia_POSITION                     ");
        items.add("     ANAESTHESIA_LOCATION                    ");
        items.add("     ANESTHESIA_SIGN_DATETIME                ");
        items.add("     CONSCIOUS_DATETIME                      ");
        items.add("     ANESTHE_BEGIN_DATE                      ");
        items.add("     LIMBS_RESULT                            ");
        items.add("     CARDIAC_AUSCULTATION_RESULT             ");
        items.add("     COAGULATION_RESULT                      ");
        items.add("     URINE_ROUTINE_RESULT                    ");
        items.add("     LUNG_AUSCULTATION_RESULT                ");
        items.add("     BLOOD_ROUT_RESULT                       ");
        items.add("     BGA_RESULT                              ");
        items.add("     TRACHEALl_RESULT                        ");
        items.add("     DENTAL_RESULT                           ");
        items.add("     SPINAL_RESULT                           ");
        items.add("     ABDOMINAL_RESULT                        ");
        items.add("     INT_INVASE_OP_MON_WAY                   ");
        items.add("     ROUTINE_MONITOR_RESULT                  ");
        items.add("     ROUTINE_MONITOR_NAME                    ");
        items.add("     ANAESTHESIA_DESC                        ");
        items.add("     ANESTHESIA_INDICATION                   ");


        List<String> format  = new ArrayList<> ();

        for (String item : items)
        {
            System.err.println (item.replace ("_"," ").trim ());
        }
    }
}

/**
 APGAR CODE
 VISIT NO
 B ULTRA RESULT
 CT RESULT
 MRI ULTRA RESULT
 DRUG NAME
 DRUG USAGE
 TCM FOUR OBSERVATIONS
 TCM FOUR RESULTS
 TCM TREAT OTHERCOST
 DIALECTICAL ACCROD
 TCM TREAT CATEREDCOST
 TCD CPM COST
 CHIN DECOC DECWAY
 TCD DECOCTION METHOD
 CHIN DRINK DECWAY
 TCD MEDICATION METHOD
 TCD USAGE
 TCM TREAT DISPATCHCOST
 TCD DECOCTIONPIECES
 TCD DECOCTIONPIECES DECOCTION
 TREAT NOOPERATION PHYSICSCOST
 TREAT NOOPERATION ITEMCOST
 TREAT NOOPERATION ITEMCOST
 TREAT OPERATIONTREAT COST
 TREAT OPERATIONTREAT COST
 OTHER MEDICAL TREATMENT
 TCD USAGE TYPE
 TCD TYPE CODE
 DIAG CLINICAL COST
 DIAG CLINICAL COST
 OPERATION DOCTOR NAME
 OPERATE MZFS ID
 OPERATION DOCTOR NAME
 OPERATOR NAME
 OPERATION DOCTOR SIGN
 OPERTOR CODE
 APPLY ABO BLOOD
 APPLY RH BLOOD
 ANAESTHESIA METHOD FLAG
 SIMULOPERATE ANAESTHESIA CODE
 INTENT ANESTHESIA CODE
 COMPERE SUMMARY SUGGESTION
 COMPERE SUMMARY SUGGESTION
 COMPERE NAME
 CURRENTLY TCM DIAGCODE
 CURRENTLY TCM SYMPTOMCODE
 CURRENTLY WM DIAGCODE
 HANDOVER DATATIME
 HANDOVER SIGN
 CARDIOTACH
 AFTER DELIVERY DRUG
 BLOODPRESSUREH
 POSTPARTUM EXAMINATION TIME
 PULSE
 BLOODPRESSUREL
 POSTPARTUM OBSERVATION TIME
 INTERTUBEROUS DIAMETER
 PRENATAL EXAMINATION ABNORMAL
 POSTPARTUM UTERINE HEIGHT
 BLOOD LOSSED
 SUTURE NEEDLE NUMBER
 PERINEAL LACERATION CODE
 OPERATION CODE
 BED NO
 AREA NO
 OPERATION INDICATIONS
 ANTE PARTUM WEIGHT
 POSTPARTUM UTERINE CONTRACTION
 ANAL EXAMINATION
 DELIVERY TIME
 DELIVERY SPECIAL CONDITION
 SECOND BIRTHPROCESS TIME
 FULL BIRTHPROCESS TIME
 FIRST BIRTHPROCESS TIME
 THIRD BIRTHPROCESS TIME
 BREATH FREQUENCY
 PATIENT NAME
 PATIENT NAME
 DEPT NAME
 UTERINE WALL SUTURE
 PREPREGNANCY WEIGHT
 PMOUTH OPFULL TIME
 UTERINE ORIFICE CONDITION
 CERVICAL CONDITION
 CERVICAL SUTURE
 AGE YEAR
 AGE YEAR
 AREA NAME
 POSTPARTUM UTERINE CONTRACTION
 POSTPARTUM UTERINE HEIGHT
 postoper BLOOD LOSSED
 SPHYGMUS
 EXTERNALCONJUGATE
 FUNDUS HEIGHT
 EMBRYOLEMMA CODE
 ABDOMINAL GIRTH
 BIRTH DATETIME
 HEIGHT
 PREDELIVERY DATETIME
 PREDELIVERY DATETIME
 DELIVERY DRUG
 TUMOR SIZE
 TUMOR SIZE
 TUMOR LOCATION
 BIRTH PROCESS
 DELIVERY DATETIME
 AFTER TREAT PLAN
 NEXT TREATMENT PLAN
 INP TOTALCOST OWNPAY
 CONSULTATION DOCTOR ORGNAME
 CONSULTATION DOCTOR SIGN
 CONSULTATION  ORGNAME
 CONSULTATION DEPT NAME
 CONSULTATION DATATIME
 INCISION LOCATION
 INP COURSE
 INP COST AMOUNT
 TEMPERATURE
 PHYSICALEXAM TEMPERATURE
 OXYGEN SUPPLY TIME
 REPAIR PROCEDURE
 ADVICE ENDER SIGN
 PEDIATRICIAN SIGN
 PRESENTATION POSITION
 INP DIAG CODE
 OTHER DRUG NAME
 OTHER DRUG USE
 DIAG PLAN
 ARCHIATER DOCTOR SIGN
 PHYSICIAN DOCTOR SIGN
 SUPER DOCTOR SIGN
 SUPERIOR DOCTOR SIGN
 MAIN TREAT MEASURES
 DISEASE OUTCOME CODE
 DISEASE OUTCOME
 OUTP DIAGNOSIS CN CODE
 DISHOSPITAL TCM DIAGCODE
 DISHOSPITAL TCM SYMPTOMCODE
 OUTP DIAGNOSIS TCM CODE
 DISHOSPITAL DIAG CODE
 OUTP DIAGNOSIS TYPE CODE
 DISHOSPITAL WM DIAGCODE
 TCM TREAT COST
 PAMNIOTIC FLUID VOLUME
 FOREWATERS VOLUME
 CESAREAN PROCESS
 MEDICAL TCDDIALECTIC COST
 MEDICAL TCD DISCOST
 ADVICE END DATETIME
 ADVICE CONTENT
 ADVICE OPEN DATETIME
 ADVICE OPEN DATETIME
 ADVICE EXEC DATETIME
 ADVICE REMAKR
 ADVICEPLAN START DATETIME
 ADVICEPLAN END DATETIME
 ADVICE ITEM TYPE
 DISCUSS DATATIME
 MEASURES GUIDE DESC
 DOCTOR SIGN
 DOCTOR SIGN
 DOCTOR NAME SIGN
 DOCTOR SIGN DATETIME
 MAJOR TECHNIQUE FLAG
 PROFE TECHNICAL TYPE
 EDUCATIONAL CONTENTS
 REPLACE SCHEME
 EXP SUPPLIER
 EXP CODE
 EXP FACTORY
 FIRST ASSISTANT NAME
 SECONDE ASSISTANT NAME
 DRUG DOSAGE
 DRUG USAGE DOSAGE
 SINGLE DOSAGE
 VISIT NO
 SALVAGE NAMES
 DEVELOPMENT DEGREE CODE
 CANCEL ADVICE DATETIME
 CANCEL ADVICE SIGN
 CANCEL PERSON SIGN
 CONCEPTION CODE
 BLOOD TRANSFUSION INDICATION
 BBLOOD TRANSFUSION INDICATION
 MEDICAL COMMONLYOPERATION COST
 MEDICAL COMMONLYOPERATION COST
 MEDICAL OTHER COST
 MEDICAL COMMONLYSERVICE COST
 MEDICAL COMMONLYSERVICE COST
 BREATH TYPE FLAG
 INSTRU NURSE NAME
 NSTRUMENT NURSE NAME
 INSTRUMENT NURSE SING
 INP REASON
 PERSONAL COST AMOUNT
 NURSING SIGN
 INTERNSHIP DOCTOR SIGN
 REFRESHER DOCTOR SIGN
 DISPOSAL PLAN
 PRE ANAESTHESIA DRUG
 ABO BLOOD
 BLOOD ABO CODE
 ABO BLOOD CODE
 RH BLOOD CODE
 RH BLOOD
 ABO BLOOD
 ABO BLOOD CODE
 RH BLOOD CODE
 RH BLOOD
 BLOOD RH CODE
 ORG OPINION
 RECIPE COSTS AMOUNT
 NURSING OPERATION RESULT
 NURSING OPERATION ITEM
 NURSING OPERATION ITEM NAME
 DELIVERY TIMEGRAVIDITY TIME
 UTERINE CONDITIONS
 SAFETY NURSING CODE
 CREATE DATETIME
 RECORD DATATIME
 INTER NAME
 OPERATION POSITION NAME
 OPERATIVE SITE NAME
 RESCUE BEGIN DATETIME
 SALVAGE BEGIN DATATIME
 SALVAGE END DATETIME
 RESCUE END DATETIME
 OPERTOR TARGET
 OPERATOR NUM
 OPERATOR NUMBER
 ANESTHESIA EFFECT
 UTEROTONICS USE
 EXPLORATION TREATMENT UTERINE
 ADVICE REMARK
 ADVICE CONTENT
 LOCHIA SITUATION
 AFTDELIVERY ICD CODE
 DOCTOR ANES
 UTERINE CONTRACTION
 OPERATION START TIME
 DISPOSITION PLAN
 PAST PREGNANCY HISTORY
 OPERATION HISTORY
 OPERATE AFTER NAME
 SPECIAL CASES PREGNANCY
 OPERATE END TIME
 PREVENTIVE
 CHECK ADVICE DATETIME
 CHECK PERSON SIGN
 ADVICE CHECK DATETIME
 ADVICE ITEM CONTENT
 MATTERS NEEDING ATTENTION
 ATTENTION
 MATTERS NEED ATTENTION
 ADVERSE DRUG REACTIONS
 RESPIRATOR MONITORING ITEM
 RECIPE REMARK
 HEADPOS DYSTOCIA EVAL
 SPECIAL STATUS
 EMERGENCY RESCUE RECORD
 ORD EXAM RESULT
 ORD EXAM RESULT
 EXAM GENERALEXAM RESULT
 INP SITUATION
 SYMPTOM DESC
 OUTP ADIVCE
 LIFESTYLE COUNSELLING
 DISHOSPITAL STATUS
 DISHOSPITAL SITUATION
 PHYSICALEXAM LIMBS RESULT
 PHYSICALEXAM GENITALS RESULT
 PHYSICALEXAM HEADORGAN RESULT
 OPERATION ROOM NO
 OPERATOR DATE
 ANAESTHESIA DOCTOR NAME
 ANESTHESIA DOCTOR SIGN
 ANAESTHESIA DOCTOR NAME
 OPERATION BEGIN DATETIME
 START DATE TIME
 PRESENT DISEASE HISTORY
 CURRENTLY SITUATION
 ECG RESULT
 ORG NAME
 DISEASE HISTORY
 DISEASES HISTORY
 OPERATION HISTORY
 CHIEF COMPLAINT
 OPERATION AFTER MEDICATION
 OPERATION PRE MEDICATION
 WARDROUNDS RECORD
 BRIEF HISTORY
 ILLNESS CHANGE SITUATION
 MR EXCERPTS
 PHYSICALEXAM SKINMUCOSA RESULT
 EXAM SUPERFICIALLYMPH RESULT
 SYMPTOMS DESC
 EXAM NERVOUSSYSTEM RESULT
 OPERATIION END DATETIME
 END DATE TIME
 PHYSICALEXAM ANUS RESULT
 LIVER FUNCTION RESULT
 CHEST X RAY  RESULT
 PHYSICALEXAM CHEST RESULT
 PHYSICALEXAM SPINE RESULT
 PHYSICALEXAM ABDOMAN RESULT
 DIAG PROCESS DESC
 DIAGNOSE DESC
 DIAG DESC
 DIAG TREAT DESC
 TRANSFER PURPOSE
 REFERRAL REASON
 REFERRAL DESC
 BLOOD TRANSFUSION PROCESS
 CATHETER CARE CODE
 ENDOTRACHEAL CARE DESC
 RECOVERY COST
 SKIN CARE
 FOLLOWUP DATE
 ISOLATION TYPE CODE
 TREAT TYPE CODE
 PHYSICALEXAM NECK RESULT
 DRAINAGE MATERIAL
 DRAINAGE MATERIAL NUM
 OPERATION INCISION DESC
 SKIN DISINFECTION DESC
 NURSING OBSERVATION RESULT
 ISSUE SSC FLAG
 ISSUE ORA FLAG
 WITHDRAW SSC FLAG
 WITHDRAW ORA FLAG
 APGAR SCORE
 APGAR GRADE
 DISPOSE OPINION
 PATIENT CONDITION
 CASE FEATURE
 QUALITYCONTROL DATE
 QUALITYCONTROL DOCTOR SIGN
 QUALITYCONTROL DATE
 QUALITYCONTROL DOCTOR SIGN
 QUALITYCONTROL NURSE NAME
 PLACENTAL EXPULSION SITUATION
 DIALECTICAL DESC
 CHECK PERSON NAME
 ALLOCATE PERSON NAME
 ANAESTHESIA RECOVERY
 UNDERLYING CAUSE DEATH
 DEATH DIAG NAME
 DEATH TCM DIAGNAME
 DEATH TCM SYMPTOMNAME
 DEATH WM DIAGNAME
 VISIT REASONS
 PUNCTURE PROCESS
 TOUR NURSE NAME
 CIRCULATING NURSE SING
 AGE MONTH
 AGE MONTH
 AGE MONTH
 AGE MONTH
 AGE MONTH
 AGE MONTH
 RECIPE OPENDEPT NAME
 RECIPE OPENDOCTOR NAME
 WARDROUNDS DATATIME
 ADVICE OPENDOCTOR NAME
 ADVICE OPENDOCTOR SIGN
 ADVICE OPENDEPT NAME
 OPERATION PLACE
 ESTIMATED FETAL WEIGHT
 EXAM METHOD CODE
 PSYCHOLOGICAL CARE CODE
 CARDIOTACH
 CARDIOTACH
 IN OBSERVATION DATETIME
 EMERGENCY OBSERVATION COURSE
 PATIENT AGENT OPINION
 PATIENT AGENT OPINION
 PATIENT AGENT OPINION
 SIGN DATETIME
 FAMILY HISTORY
 PERSON HISTORY
 BED NO
 AREA NO
 TCD CPM COST
 TCD CHM COST
 TCD CHM COST
 BLOOD COST
 BLOOD COST
 BLOOD COGULATIONFACTOR COST
 TCD CPM PREPARATIONCOST
 DRUG ANTIBIOTICS COST
 DRUG ANTIBIOTICS COST
 BLOOD GLOBULIN COST
 BLOOD ALBURMIN COST
 BLOOD CELLFACTOR COST
 DRUG COST
 OPERATION CODE
 OTHER COST
 EXP EXAM COST
 EXP TREAT COST
 MEDICAL NURSING COST
 TRANSFER DEPT NAME
 TRANSFER DEPT NAME
 DIAG LABORATORY COST
 EXP OPERTION COST
 DIAG PATHOLOGY COST
 DIAG PATHOLOGY COST
 DIAG IMAGE COST
 DIAG IMAGE COST
 BED NO
 ROOM NO
 AREA NO
 Ward NO
 BODY WEIGHT
 BODY WEIGHT
 Weight
 WEIGHT
 PHYSICALEXAM WEIGHT
 PACEMAKER HEARTRATE
 STOP SMOKING DAY
 INITIAL TCM DIAGCODE
 INITIAL TCM SYMPTOMCODE
 INITIAL WM DIAGCODE
 ASSESSMENT DATETIME
 NURSING PROBLEMS
 INP TCM DIAGCODE
 INP TCM SYMPTOMCODE
 INP DIAG CODE
 INP WM DIAGCODE
 INP DIAG CODE
 INP DOCTOR SIGN
 INP DEPT NAME
 INP ROOM
 OPERATION INDICATION
 OPERATIVE INDICATION
 SYMPTOM NAME
 SYMPTOMPTOM
 BIRTHDAY
 PATIENT BIRTHDAY
 BIRTHPLACE COUNTY
 BIRTHPLACE CITY
 BIRTHPLACE PROVINCE
 SECOND CLINIC
 DRUG USAGE
 DUTY NURSE SIGN
 INP DOCTOR SIGN
 PHYSICIAN DOCTOR SIGN
 DIRECTOR SIGN
 DEPT DIRECTOR SIGN
 DISHOSPITAL TCM DIAGNAME
 DISHOSPITAL TCM SYMPTOMNAME
 DISHOSPITAL WM DIAGNAME
 DISHOSPITAL SYMPTOM
 DISHOSPITAL SIGNS
 OUTP DIAGNOSIS TYPE NAME
 DISHOSPITAL DEPT NAME
 DISHOSPITAL ROOM
 BREATH FREQUENCY
 BREATH FREQUENCY
 MEDICAL PAY WAY
 PAY WAY
 BLOODTRANSFERED TYPE CODE
 OUTP TCM DIAGNAME
 OUTP DIAGNOSIS TCM NAME
 OUTP WM DIAGNAME
 OUTP DIAG NAME
 INP TOTALCOST
 OUTP DIAGNOSIS CN NAME
 ORG NAME
 DEPT NAME
 INFORMED CONSENT NAME
 WORKUNIT NAME
 DRUG ALLERGY FLAG
 ALLERGY DRUG
 VISIT DATETIME
 TRANSFER RECORD TYPE
 MARITAL HISTORY
 OPERATION ROOM NO
 INP DATETIME
 INP DATETIME
 INP DATE
 DISHOSPITAL DATE
 DISHOSPITAL DATETIME
 INP DAYS
 DEPT NAME
 PATIENT TYPE CODE
 DRINKING PER DAY
 AGE YEAR
 AGE YEAR
 AGE YEAR
 OCCUPATION TYPE CODE
 OCCUPATIENTION TYPE CODE
 OCCUPATIENTION CLASS CODE
 MARITAL STATUS CODE
 MARITAL STATUS CODE
 INP DAYS
 AREA NAME
 WORKUNIT TOWNSHIP
 WORKUNIT COUNTY
 WORKUNIT CITY
 WORKUNIT VILLAGE
 WORKUNIT PROVINCE
 WORKUNIT ZIP CODE
 WORKUNIT DOORS
 WORKUNIT PHONE
 WORK PHONE
 PATIENT DIRECTION CODE
 PSYCHOLOGICAL STATUS
 ACCOUNT TOWNSHIP
 ACCOUNT COUNTY
 ACCOUNT CITY
 ACCOUNT VILLAGE
 ACCOUNT PROVINCE
 ACCOUNT ZIP CODE
 ACCOUNT DOORS
 NATIONNALITY CODE
 NATIONNALITY
 NATIONNALITY CODE
 NATION
 OUTP DIAGNOSIS TCM NAME
 TCM DIAG CODE
 TCM SYMPTOM CODE
 DIAG NAME
 BASE DESEASE POSSIBLE INFLU
 PATIENT UNDERLYING DISEASE
 DIAG CODE
 HEATH CARD NO
 HEALTH CARD NO
 HEATH CARD NO
 INQU CYCLE CODE
 INP APPROACH
 INP APPROACH CODE
 DISEASE HISTORY
 ALLERGY HISTORY
 COMMUNICABLE DISEASES HISTORY
 INFECT HISTORY
 OPERATION HISTORY
 BLOOD TRANSFUSION HISTORY
 FIRST VISIT FLAG
 MENSTRUATION HISTORY
 DEGREE CODE
 PATIENT NAME
 PATIENT NAME
 PATIENT NAME
 PATIENT AGENT SIGN
 ADDRESS TOWNSHIP
 ADDRESS TOWNSHIP
 ADDRESS COUNTY
 ADDRESS CITY
 ADDRESS VILLAGE
 ADDRESS VILLAGE
 ADDRESS PROVINCE
 ADDRESS DOORS
 ADDRESS TYPE FLAG
 SELF CARE STATUS
 PATIENT PHONE
 CURRENT PHONE
 PATIENT SIGN
 RECEIVE ORG NAME
 DISHOSPITAL WAY CODE
 DISHOSPITAL DISPOSITION CODE
 CURRENT TOWNSHIP
 CURRENT COUNTY
 CURRENT CITY
 CURRENT VILLAGE
 CURRENT PROVINCE
 CURRENT ZIP CODE
 CURRENT DOORS
 INP DOCTOR SIGN
 DEATH DATETIME
 DEATH DATE
 DEATH REASON
 PHYSICALEXAM BREATH FREQUENCY
 SPHYGMUS
 SPHYGMUS
 PHYSICALEXAM SPHYGMUS
 LEGAL AGENT SIGN
 SEX CODE
 SEX CODE
 PATIENT SEX
 MEDICALHIS NAME
 RELATION CODE
 CRITICAL ILLNESS CONTENT
 EMAIL
 IDENTITY NO
 SLEEP STATUS
 NATIVEPLACE CITY
 NATIVEPLACE PROVINCE
 OUT ROOM DATETIME
 OUT OPERATEROOM DATETIME
 PULM FUNCTION RESULT
 ABDOMINAL GIRTH
 NUTRITION STATUS
 DISHOSPITAL 31D BACKPURPOSE
 DISCUSS PLACE
 IDENTITY TYPE
 PHYSICALEXAM HEIGHT
 OVERINTO DATATIME
 INSTI DEPART TRANSI NAME
 RECEIV MECHAN IN
 OVERINTO DIAGPLAN
 OVERINTO DEPT NAME
 OVERINTO DEPT SIGN
 TURNOUT DEPT NAME
 TRANSFER DATATIME
 INSTI DEPART TRANSO NAME
 RECEIV MECHANOUT CODE
 REFERRAL DATE
 AUXILIARYEXAMI RESULT
 AUXILIARYEXAMI ITEM
 AUXILIARYEXAMI RESULT
 AUXILIARYEXAMI RESULT
 AUXILIARYEXAMI ITEM
 AUXILIARYEXAMI RESULT
 BLOOD TRANSFERED DATETIME
 SMOKING STATUS
 ENTER ROOM DATETIME
 INTO ROOM WAY
 OUTP COST AMOUNT
 PREVENT HISTORY
 PREVENTIVE INOCULATION HISTORY
 DRINKING FREQUENCY
 DIETARY STATUS CODE
 AFTER OPERATION DAY
 UTEROTONICS NAME
 RESCUE PERSONNEL LIST
 SALVAGE NAMES
 ANESTH DRUG NAME
 OPERATOR METHOD
 BLOOD LOSSED
 OPERATION BLEEDING
 OPERATION BLEEDING
 OPEATION POSSIBLE VENTURE
 OPERATE ALL TIME
 OPERATION CUTHEAL CODE
 OPERATTION CUTHEAL TYPE
 OPERATION BEFORE PREPARE
 PREOPERATIVE READY
 OPERATION ASSISTANT NAME
 OPEA AFTER POS VENTURE
 HANDOVER DATETIME
 OPERATE DRUG
 OPERATION PLANS
 OPERATION MATERNITY
 OPERATION LOCATION FLAG
 TREAT OPERATIONTREAT OPERCOST
 TREAT OPER ANAESTHESIACOST
 TREAT OPER ANAESTHESIACOST
 OPERATE DRUG DOSAGE
 OPERATION POINTS
 OPERATE INFUSION ITEM
 OPERATION PROCESS DESC
 SURGICAL INDICATION
 EXEC PERSON SIGN
 ADVICE EXEC SIGN
 EXEC DEPT NAME
 NURSING OBSERVATION NAME
 Nurse SIGN
 NURSING SIGN
 NURSING TYPE CODE
 NURSING GRADE CODE
 NURSING OBSERVATION NAME
 NURSING OBSERVATION NAME
 NURSING OBSERVATION NAME
 INTENT OPERATE CODE
 SIMULOPERATION CODE
 OPERATION METHOD
 OPERATION CONTRAINDICATION
 SURGERY CONTRAINDICATION
 OPERATIVE SIGN
 OPERATOR SIGN
 INTENT OPERATE DATETIME
 INTENT TRANSFUSION DATE
 SPEICAL EXAMTREAT ITEM
 SPEICAL EXAMTREAT INTENT
 SPEICAL EXAMTREAT COMPLICATION
 CONTACT NAME
 CONTACTS NAME
 OPTERTOR NAME
 OPERATION NAME
 PATHOLOGY NO
 MR QUALITY CODE
 MR QUALITY CODE
 VERIFY PERSON NAME
 DISPENSING PERSON NAME
 OPERATION GRADE
 INP NO
 OUTP NO
 INP NO
 INFORMED CONSENT NO
 APPLY NO
 ELECTRONIC APPLY NO
 INP NO
 RECIPE NO
 OUTP NO
 BLOOD NO
 INP NO
 HANDOVER DIAGPLAN
 TAKE DATATIME
 TAKE SIGN
 MIDWIVES SIGN
 OPERATOR DESC
 SYSTOLIC PRESSURE
 SYSTOLIC PRESSURE
 PHYSICALEXAM SYSTOLIC PRESSURE
 BIRTH WEIGHT
 NEWBORN BIRTH WEIGHT
 BIRTH WEIGHT
 NEWBORN HEIGHT
 NEWBORN HEIGHT
 NEWBORN ABNORMAL CODE
 NEWBORN INP WEIGHT
 NEWBORN SEX
 PAST HISTORY
 BLOOD TRANSFUSION CODE
 BLOOD TRANSFUSION HISTORY
 ANESTH COMPLIC CODE
 CLINICAL PATH CODE
 DEATHPATIENT AUTOPSY FLAG
 DEATHPATIENT AUTOPSY FLAG
 ADVICE EXEC STATUS
 SMOKING PER DAY
 DOSAGE TOTAL
 USAGE DOSAGE TOTAL
 DRUG USAGE TOTAL
 DRUG USAGE TOTAL
 LAST MENSTRUAL PERIOD
 MR NO
 TCD DECOCTIONPIECES FORM
 OPERATION ITEM
 OPERATION INFUSION
 TRANS UNIT
 COMPERE NAME
 DISCUSS CONCLUSION
 DISCUSS SUGGESTION
 PREOPERATION DIAG CODE
 PRE OPERATION CODE
 PREOPERATION DIAG
 OPERATE ANESTHESIA ADVICE
 CARDIOTACH
 BLOODPRESSUREH
 POSTOPER EXAMINATION TIME
 PULSE
 BLOODPRESSUREL
 POSTOPER OBSERVATION DATE
 AFTEROPERATION DIAG ICD
 POSTPARTUM BLADDER FILLING
 FLATULENCE CODE
 MATERNALPERINEAL INCISION CODE
 PERINEAL HEMATOMA CODE
 BODY POSITION CARE
 TRACHEAL INTUBATION CODE
 DRUG USAGE FREQUENCY
 DRUG USAGE FRE
 FREQUENCY
 PRENATAL EXAMINATION CODE
 ABNUMBERRMAL UTERINE EXP
 CERVICAL LACERATION CODE
 ISOLATION INDICATOR
 IS AGREE POSTMORTEM
 HEALTH STATUS
 HEALTH STATUS CODE
 COMMUNICABLE DISEASES FLAG
 INFECT FLAG
 RESPIRATOR FLAG
 ANESTHESIA ANALGESIA FLAG
 ANESTHESIA SAFE FLAG
 SMOKING FLAG
 DPAP FLAG
 INCASIVE OPERTOR CODE
 EMESIS FLAG
 DYSURIA FLAG
 DRINKING FLAG
 OPERATION FLAG
 ALLERGY HOSTORY FLAG
 ALLERGY HISTORY TYPE
 ALLERGY FLAG
 ALLERGY HISTORY FLAG
 DISHOSPITAL 31D BACKFLAG
 BLOODTRANSFERED REACTION CODE
 MENTAL STATE FLAG
 SPIRIT STATUS FLAG
 CLOSEBEFORE CHECK FLAG
 CLOSEAFTER CHECK FLAG
 EXP IMPLANTABLE FLAG
 USE TCMTECHNOLOGY FLAG
 USE TCMEQUIPMENT FLAG
 USE TCMPREPARATION FLAG
 TRACHEAL INTUB CODE
 INFORM DOCTOR FLG
 UMBILICAL BLOOD CORD
 DIALECTIC FLAG
 DURING OPERATION FLAG
 IS DRAINAGE
 PREOPERATION CHECK FLAG
 VAGINAL DELIVERY CODE
 INTACT FETALMEMBRANES CODE
 ABNUMBERRMAL UMBILICAL CORD
 BLADDER FILLING CODE
 DOSAGE UNIT
 DRUG DOSAGE UNIT
 ABNUMBERRMAL UMBILICAL CORD
 VAGINAL HEMATOMA CODE
 LACERATION VAGINA CODE
 IS CREDIBLE
 ADVICE CHECKNURSE SIGN
 SPECIALTY SITUATION
 EDC DESC
 EDC DESC
 TREATMENT PLAN
 HEALTH ASSESSMENT DESC
 ASA
 THERAPEUTIC PRINCIPLE
 THERAPEUTIC PRINCIPLE
 DIS DEATH RECORDS
 DEATH TCM DIAGCODE
 DEATH TCM SYMPTOMCODE
 DEATH DIAG CODE
 DEATH WM DIAGCODE
 FETAL HEART RATE
 ENDOTRACHEAL CARE CODE
 RELATION CODE
 SIGN DATETIME
 LEGAL AGENT SIGN
 POSITIVE AUXILIARYEXAMI RESULT
 POSITIVE EXAM RESULTS
 CONSULTATION SUGGESTION
 CONSULTATION REASON
 INP TCM DIAGNAME
 INP TCM SYMPTOMNAME
 INP WM DIAGNAME
 RECIPE GROUP NO
 RECIPE GROUP NO
 PHYSICAL EXAM
 ZIP CODE
 CONSULTATION PURPOSE
 APPLY ORG NAME
 APPLY DOCTOR NAME
 APPLY DEPT NAME
 CONSULTATION TYPE
 COMPERE NAME
 DISCUSS SUGGESTION
 MORBIDITY DATETIME
 DIAG EVIDENCE
 HANDOVER NURSE SIGN
 TRANSPORTER SIGN
 PATIENT TRANSFER CHECKITEM
 CRITICAL ILLNESS DATETIME
 CONDITION EMERGENCY MEASURES
 EXAM SKIN DESC
 REASON DEATH
 REASON DEATH CODE
 INFORMED CONSENT CONENT
 BLOOD GLUCOSE VALUE
 ORG ID
 ORG ID
 TREATING DOCTOR SIGN
 TCM DIAG COST
 AMNIOTIC FLUID CHARACTER
 AMNIOTIC FLUID CONDITION
 AMNIOTIC FLUID VOLUME
 AMNIOTIC FLUID VOLUME
 RELATION CODE
 RELATION
 CONTACT NAME
 CONTACTS NAME
 CONTACT TOWNSHIP
 CONTACT COUNTY
 CONTACT CITY
 CONTACT VILLAGE
 CONTACT PROVINCE
 CONTACT DOORS
 CONTACT TOWNSHIP
 CONTACT COUNTY
 CONTACT CITY
 CONTACT VILLAGE
 CONTACT PROVINCE
 CONTACT DOORS
 CONTACT PHONE
 CONTACTS PHONE
 DELIVERY OUTCOME CODE
 FETAL CHILDBIRTH WAY
 FETAL DISENGAGE TIME
 VAGINAL DELIVERY MODE
 FETAL POSITION CODE
 PLACENTAL EXPULSION TIME
 RUPTURE MEMBRANES DATETIME
 OXYHEMOGLOBIN SATURATION
 UMBILICAL CORD LENGTH
 UMBILICALCORD WINDING NUMBER
 UMBILICALCORD WINDING NUMBER
 ABDOMINAL EXPLORATION UTERUS
 ABDOMINAL EXP ACCESSORIES
 DIASTOLIC PRESSURE
 DIASTOLIC PRESSURe
 DIASTOLIC PRESSURE
 EXAM DIASTOLIC PRESSURE
 DRUG USAGE WAY
 ROUTE ADMINISTRATION
 DRUG FORM
 DRUG FORM CODE
 DRUG SPEC
 DRUG NAME
 ANAESTHESIA DRUG NAME
 DRUG USAGE
 NUTRITION CARE
 ADIVCE TYPE CODE
 BLOODTRANSFERED REASON
 PLANNED DELIVERY CODE
 RECORD SIGN
 RECORD SIGN
 STAGE SUMMARY DATATIME
 CURRENTLY TCM DIAGCODE
 CURRENTLY TCM SYMPTOMCODE
 CURRENTLY WM DIAGCODE
 DIAGTREAT PROCESSES NAME
 RECEIVE DOCTOR SIGN
 RECEPTION NURSING SIGN
 RESPONSIBLE DOCTOR
 CODER SIGN
 TURNOUT DOCTOR SIGN
 CURRENTLY TCM DIAGCODE
 CURRENTLY TCM SYMPTOMCODE
 CURRENTLY WM DIAGCODE
 REFERRAL DOCTOR NAME
 BLOODTRANSFUSION TYPE CODE
 BLOOD TRANSFUSION VARIETY CODE
 BLOOD TRANSFERED
 BLOOD TRANSFERED VALUE
 BLOODTRANSFERED VALUE DOSAGE
 BLOODTRANSFERED VALUE DOSAGE
 BLOOD TRANSFUSION EXAM ITEM
 BLOOD TRANSFUSION WAY
 BLOOD NATURE CODE
 TRANS INGREDIENTS
 TIME BLOOD
 BIRTHPROCESS RECORD SIGN
 FOLLOWUP CODE
 RESCUE MEASURES
 NURSING OPERATION NAME
 SIGN DATETIME
 SIGN DATATIME
 INFORM DOCTOR DATETIME
 TCM TREAT EXTERNALCOST
 TCM TREAT COST
 TCM TREAT MASSAGECOST
 TCM TREAT ANORECTALCOST
 TCM TREAT SPECIALCOST
 TCM TREAT ACUPUNCTURECOST
 TCM TREAT BONEFRACTURECOST
 RUPTURE MEMBRANE CODE
 PREPARE ITEM
 RECIPE OPEN DATE
 RECIPE EFFECTIVE DAY
 RECIPE TYPE CODE
 OUTP TCM DIAGCODE
 OUTP TCM SYMPTOMCODE
 OUTP DIAG CODE
 OUTP WM DIAGCODE
 TREATMENT VAGINAL HEMATOMA
 VAGINAL HEMATOMA Size
 IDENTIFY WM DIAGNAME
 IDENTIFY TCM DIAGNAME
 IDENTIFY TCM SYMPTOMNAME
 HEADINJURY INPBEFORE MIN
 HEADINJURY INPBEFOR MIN
 HEADINJURY INPBEFORECOMA DAY
 HEADINJURY INPBEFORECOMA  HOUR
 HEADINJURY INPAFTERCOMA MINUTE
 HEADINJURY INPAFTERCOMA DAY
 HEADINJURY INPAFTERCOMA  HOUR
 DIET GUIDE CODE
 EXP NAME
 EXP UNIT
 QUANTITY
 USE APPROACH
 ANAESTHESIA POSSIBLE ACCIDENT
 Anesthesia POSITION
 ANAESTHESIA LOCATION
 ANESTHESIA SIGN DATETIME
 CONSCIOUS DATETIME
 ANESTHE BEGIN DATE
 LIMBS RESULT
 CARDIAC AUSCULTATION RESULT
 COAGULATION RESULT
 URINE ROUTINE RESULT
 LUNG AUSCULTATION RESULT
 BLOOD ROUT RESULT
 BGA RESULT
 TRACHEALl RESULT
 DENTAL RESULT
 SPINAL RESULT
 ABDOMINAL RESULT
 INT INVASE OP MON WAY
 ROUTINE MONITOR RESULT
 ROUTINE MONITOR NAME
 ANAESTHESIA DESC
 ANESTHESIA INDICATION
 * */