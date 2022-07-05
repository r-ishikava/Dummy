import java.util.regex.Pattern;

/**
 *Patient class.
 */
public class Patient extends Person {
    private String patientId;
    private java.util.Date dateOfBirth;

    /**
     * Patient class constructor.
     *
     * @param fullName patient's fullname
     * @param cpf patient's cpf
     * @param address patient's address
     * @param mobilePhone patient's phone number
     * @param email patient's email
     * @param patientId patient's id
     * @param dateOfBirth patient't date of birth
     */
    public Patient(String fullName, String cpf, String address, 
                   String mobilePhone, String email, String patientId, 
                   java.util.Date dateOfBirth) {
        super(fullName, cpf, address, mobilePhone, email);
        setPatientId(patientId);
        setDateOfBirth(dateOfBirth);
    }

    public String getPatientId() {
        return patientId;
    }

    /**
     * patientId setter.
     *
     * @param patientId patient's id must be a fifteen length number sequence
     */
    public void setPatientId(String patientId) {
        if (!Pattern.matches("\\d{15}", patientId)) {
            throw new IllegalArgumentException("patientId must have a length" 
                                               + "of fifteen, all numbers");
        }
        this.patientId = patientId;
    }

    public java.util.Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(java.util.Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
