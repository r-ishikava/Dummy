
/**
 *HealthCarePlan class.
 */
public class HealthCarePlan {
    private String name;
    private String regulatorCode;
    private double refundPercent;

    /**
     * HealthCarePlan class constructor.
     *
     * @param name healthcare plan name
     * @param regulatorCode healthcare plan code
     * @param refundPercent the refund percentage
     */
    public HealthCarePlan(String name, String regulatorCode, double refundPercent) {
        setName(name);
        setRegulatorCode(regulatorCode);
        setRefundPercent(refundPercent);
    }

    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getRegulatorCode() {
        return regulatorCode;
    }

    public void setRegulatorCode(String regulatorCode) {
        this.regulatorCode = regulatorCode;
    }

    public double getRefundPercent() {
        return refundPercent;
    }

    /**
     * refundPercent setter.
     *
     * @param refundPercent refund percent, must be a number between 0 and 1
     */
    public void setRefundPercent(double refundPercent) {
        if (refundPercent > 1 || refundPercent < 0) {
            throw new IllegalArgumentException("refundPercent must be a number between 0 and 1");
        }
        this.refundPercent = refundPercent;
    }
}