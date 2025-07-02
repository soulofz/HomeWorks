package HW7.Clinic;

public class Therapist extends Doctor{
    @Override
    void treat() {
        System.out.println("Терапевт лечит пациента.");
    }
    void assignDoctor(Patient patient){
        int plan = patient.getTreatmentPlan();
        switch (plan){
            case 1 -> patient.setDoctor(new Surgeon());
            case 2 -> patient.setDoctor(new Dentist());
            default -> patient.setDoctor(this);
        }
        patient.getDoctor().treat();
    }
}
