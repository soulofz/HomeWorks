package HW7.Clinic;

public class Patient {
    private int treatmentPlan;
    private Doctor doctor;

    Patient(int code){
        this.treatmentPlan = code;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int code) {
        this.treatmentPlan = code;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
