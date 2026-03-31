public class Main {
    public static void main(String[] args) {
        // 1. Create at least three MenuItem objects (Task Requirement)
        Menuitem m1 = new Menuitem("C-01", "Espresso", 9.0, "coffee");
        Menuitem m2 = new Menuitem("C-02", "Cappuccino", 13.5, "coffee");
        Menuitem m3 = new Menuitem("D-01", "Cheesecake", 16.0, "dessert");

        // 2. Create at least one customer
        CafeCustomer customer = new CafeCustomer(100, "Julia", "Mazur", "j.mazur@mail.pl");

        // 3. Create an order and add products to it
        Order order = new Order(customer);
        order.addItem(m1);
        order.addItem(m2);
        order.addItem(m3);

        // 4. Print summaries using toString()
        System.out.println("--- Customer Info ---");
        System.out.println(customer);

        System.out.println("\n--- Order Summary ---");
        System.out.println(order);

        // 5. Calculate and print total values
        System.out.println("Total value: " + order.calculateTotal() + " PLN");
        System.out.println("Number of items in order: " + order.countItems());

        // Check global product counter (Static method)
        System.out.println("Total products in system menu: " + Menuitem.getProductCount());

        // 6. Show meaningful comparison using equals()
        System.out.println("\n--- Testing Equality ---");
        Menuitem espressoCopy = new Menuitem("C-01", "Espresso Duplicate", 9.0, "coffee");
        System.out.println("Are m1 and duplicate equal by code? " + m1.equals(espressoCopy));

        // 7. Finalize payment
        System.out.println("\n--- Payment Process ---");
        order.markAsPaid();
        System.out.println(order); // Should now show 'PAID' or 'Status: true'
    }
}