import java.util.regex.Pattern;

/**
 * Person class.
 */
public abstract class Person {
    private String fullName;
    private String cpf;
    private String address;
    private String mobilePhone;
    private String email;

    /**
     * Person class constructor.
     *
     * @param fullName person's fullname
     * @param cpf person's cpf
     * @param address person's address
     * @param mobilePhone person's phone number
     * @param email person's email
     */
    public Person(String fullName, String cpf, String address, 
                   String mobilePhone, String email) {
        setFullName(fullName);
        setCpf(cpf);
        setAddress(address);
        setMobilePhone(mobilePhone);
        setEmail(email);
    }

    public String getFullName() {
        return fullName;
    }

    /**
     * fullName setter.
     *
     * @param fullName name with at least two components
     */
    public void setFullName(String fullName) {
        if (!Pattern.matches(".+\\s.+.*", fullName)) {
            throw new IllegalArgumentException("fullName needs to have at least two components");
        }
        this.fullName = fullName;
    }

    public String getCpf() {
        return cpf;
    }

    /**
     * cpf setter.
     *
     * @param cpf cpf, must follow the 123456789-12 format
     */
    public void setCpf(String cpf) {
        if (!Pattern.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}", cpf)) {
            throw new IllegalArgumentException("cpf must be in the 123.456.789-12 format");
        }
        this.cpf = cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * mobilePhone setter.
     *
     * @param mobilePhone phone number, must follow the (12)12345-1234 format
     */
    public void setMobilePhone(String mobilePhone) {
        if (!Pattern.matches("\\(\\d{2}\\)\\d{5}-\\d{4}", mobilePhone)) {
            throw new IllegalArgumentException("mobilePhone must be in the (12)12345-1234 format");
        }
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
