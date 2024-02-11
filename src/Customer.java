public abstract class Customer {

    private String name;
    private String type;
    private String email;

    public Customer() {
    }

    public Customer(Customer customer) {
        if(customer != null){
            this.name = customer.name;
            this.type = customer.type;
            this.email = customer.email;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract Customer copy();

    public abstract String print();

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", email='" + email + '\'';
    }
}
