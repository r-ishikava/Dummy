import java.util.Locale;

/**
 *Billing class.
 */
public class Billing {
    private Doctor doctor;
    private Patient patient;
    private HealthCarePlan healthCarePlan;
    private int hours;

    /**
     *Billing class constructor.
     *
     * @param doctor the doctor
     * @param patient the patient
     * @param healthCarePlan the healthCarePlan
     * @param hours the amount of hours
     */
    public Billing(Doctor doctor, Patient patient, HealthCarePlan healthCarePlan,
                   int hours) {
        Locale.setDefault(Locale.US);
        setDoctor(doctor);
        setPatient(patient);
        setHealthCarePlan(healthCarePlan);
        setHours(hours);
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public HealthCarePlan getHelthCarePlan() {
        return healthCarePlan;
    }

    public void setHealthCarePlan(HealthCarePlan helthCarePlan) {
        this.healthCarePlan = helthCarePlan;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * Calculates de bill value.
     *
     * @return the final value with the discount applied
     */
    public double getBill() {
        double bill = hours * doctor.getOfficeVisitFee() 
               * (1 - healthCarePlan.getRefundPercent());
        return Double.parseDouble(String.format("%.2f%n", bill));
    }
}
