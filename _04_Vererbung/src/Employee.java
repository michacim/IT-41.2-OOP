public class Employee extends Person{


    public Employee(String firstname, String lastname) {
        super(firstname, lastname);
    }

    @Override
    public String toString() {
        return "Employee{} " + super.toString();
    }
}
