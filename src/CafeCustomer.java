public class CafeCustomer {
    // 1. Private fields (Encapsulation)
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;

    // 2. Constructor to initialize customer data
    public CafeCustomer(int customerId, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // 3. toString Method for a readable summary
    @Override
    public String toString() {
        return String.format("Customer: %s %s (ID: %d)", firstName, lastName, customerId);
    }

    // 4. equals Method to compare customers by ID or Email
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CafeCustomer other = (CafeCustomer) o;
        return customerId == other.customerId || email.equals(other.email);
    }
}
