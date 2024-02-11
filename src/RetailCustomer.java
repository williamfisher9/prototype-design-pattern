public class RetailCustomer extends Customer{
    private String socialSecurityNumber;

    public RetailCustomer() {}

    public RetailCustomer(RetailCustomer retailCustomer) {
        super(retailCustomer);
        this.socialSecurityNumber = retailCustomer.socialSecurityNumber;
    }

    @Override
    public Customer copy() {
        return new RetailCustomer(this);
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String print() {
        return "RetailCustomer{" + super.toString() +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' + '}';
    }
}
