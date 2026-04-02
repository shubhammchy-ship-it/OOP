package Workshop;

// Superclass
class Person {
    protected String address;

    Person(String address) {
        this.address = address;
    }
}

// Subclass
class Employee extends Person {
    String department;

    Employee(String address, String department) {
        super(address);
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
    }
}

// Main class
public class Q4 {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Kathmandu", "IT");

        System.out.println("Employee Details:");
        emp1.displayDetails();
    }
}