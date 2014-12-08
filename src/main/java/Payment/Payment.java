package Payment;

/**
 * Created by Prin Kammasitt on 8/12/2557.
 */
public class Payment {
    private String paymentNum;
    private String paymentType;
    private String paymentDate;
    private String creditNumber;
    private String creditName;
    private String creditAddress;
    private String creditPhoneNumber;
    private String securityCode;
    private String monthlyExpirationDate;
    private String yearExpirationDate;

    public Payment(String paymentNum, String paymentType, String paymentDate, String creditNumber, String creditName, String creditAddress, String creditPhoneNumber, String securityCode, String monthlyExpirationDate, String yearExpirateionDate) {
        this.paymentNum = paymentNum;
        this.paymentType = paymentType;
        this.paymentDate = paymentDate;
        this.creditNumber = creditNumber;
        this.creditName = creditName;
        this.creditAddress = creditAddress;
        this.creditPhoneNumber = creditPhoneNumber;
        this.securityCode = securityCode;
        this.monthlyExpirationDate = monthlyExpirationDate;
        this.yearExpirationDate = yearExpirateionDate;
    }

    public String getPaymentNum() {
        return paymentNum;
    }

    public void setPaymentNum(String paymentNum) {
        this.paymentNum = paymentNum;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }

    public String getCreditAddress() {
        return creditAddress;
    }

    public void setCreditAddress(String creditAddress) {
        this.creditAddress = creditAddress;
    }

    public String getCreditPhoneNumber() {
        return creditPhoneNumber;
    }

    public void setCreditPhoneNumber(String creditPhoneNumber) {
        this.creditPhoneNumber = creditPhoneNumber;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getMonthlyExpirationDate() {
        return monthlyExpirationDate;
    }

    public void setMonthlyExpirationDate(String monthlyExpirationDate) {
        this.monthlyExpirationDate = monthlyExpirationDate;
    }

    public String getYearExpirationDate() {
        return yearExpirationDate;
    }

    public void setYearExpirationDate(String yearExpirationDate) {
        this.yearExpirationDate = yearExpirationDate;
    }
}
