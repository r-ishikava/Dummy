/**
 *Doctor class.
 */
public class Doctor extends Person {
    private String specialty;
    private double officeVisitFee;

    /**
     * Doctor class constructor.
     *
     * @param fullName doctor's name
     * @param cpf doctor's cpf
     * @param address doctor's address
     * @param mobilePhone doctor's phone number
     * @param email doctor's email
     * @param specialty doctor's specialty
     * @param officeVisitFee doctor's visit fee
     */
    public Doctor(String fullName, String cpf, String address, 
                   String mobilePhone, String email, String specialty,
                   double officeVisitFee) {
        super(fullName, cpf, address, mobilePhone, email);
        setSpecialty(specialty);
        setOfficeVisitFee(officeVisitFee);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getOfficeVisitFee() {
        return officeVisitFee;
    }

    /**
     * officeVisitFree setter.
     *
     * @param officeVisitFee visit fee, must be a positive number
     */
    public void setOfficeVisitFee(double officeVisitFee) {
        if (officeVisitFee < 0) {
            throw new IllegalArgumentException("officeVisitFee must be a positive number");
        }
        this.officeVisitFee = officeVisitFee;
    }
}
