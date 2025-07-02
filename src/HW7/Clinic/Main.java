package HW7.Clinic;

public class Main {
    public static void main(String[] args) {
        Therapist therapist = new Therapist();
        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(3);
        System.out.println("Пациент 1:");
        therapist.assignDoctor(patient1);
        System.out.println("Пациент 2:");
        therapist.assignDoctor(patient2);
        System.out.println("Пациент 3:");
        therapist.assignDoctor(patient3);
    }
}
