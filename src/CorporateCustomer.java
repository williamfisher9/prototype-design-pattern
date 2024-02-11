public class CorporateCustomer extends Customer{
    private String corporateName;
    private String corporateType;

    public CorporateCustomer(){}

    public CorporateCustomer(CorporateCustomer corporateCustomer){
        super(corporateCustomer);
        this.corporateName = corporateCustomer.corporateName;
        this.corporateType = corporateCustomer.corporateType;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public String getCorporateType() {
        return corporateType;
    }

    public void setCorporateType(String corporateType) {
        this.corporateType = corporateType;
    }

    @Override
    public Customer copy() {
        return new CorporateCustomer(this);
    }

    @Override
    public String print() {
        return "CorporateCustomer{" + super.toString() +
                ", corporateName='" + corporateName + '\'' +
                ", corporateType='" + corporateType + '\'' +
                '}';
    }
}
