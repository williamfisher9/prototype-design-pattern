public class Main {
    public static void main(String[] args) {
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setName("AmazonCorp");
        corporateCustomer.setEmail("amazoncorp@gmail.com");
        corporateCustomer.setType("IT");
        corporateCustomer.setCorporateName("AmazonCorp LLC");
        corporateCustomer.setCorporateType("Limited Liability Company");

        Customer customer1 = corporateCustomer.copy();
        System.out.println(customer1.print());

        RetailCustomer retailCustomer = new RetailCustomer();
        retailCustomer.setName("John Doe");
        retailCustomer.setEmail("john.doe@gmail.com");
        retailCustomer.setType("RETAIL");
        retailCustomer.setSocialSecurityNumber("SSN82828282");

        Customer customer2 = retailCustomer.copy();
        System.out.println(customer2.print());
    }
}