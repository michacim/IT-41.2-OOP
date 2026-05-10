/**
 * -  Customer erweitert (erbt von) Person
 * - Child (Kind)
 * - Unterklasse
 * - Customer ist Person
 */


public class Customer extends Person {

    private String customerNumber;


    public Customer(String firstname, String lastname, String customerNumber) {
        super(firstname, lastname);
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber='" + customerNumber + '\'' +
                "} " + super.toString();
    }


    @Override
    public void info() {
        System.out.print("Customer "+lastname);
        super.info() ;

    }
}
