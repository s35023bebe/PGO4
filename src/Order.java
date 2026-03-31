import java.util.ArrayList; // Important: needed for the list of items

public class Order {
    // 1. Fields
    private int orderNumber;
    private CafeCustomer customer;
    private ArrayList<Menuitem> items; // This list will hold our products
    private boolean paid;

    // 2. Static counter for automatic order numbering
    private static int nextOrderNumber = 1;

    // 3. Constructor
    public Order(CafeCustomer customer) {
        this.customer = customer;
        this.items = new ArrayList<>(); // Initialize the empty list
        this.paid = false;
        this.orderNumber = nextOrderNumber++; // Assign number and increment for the next one
    }

    // 4. Methods for order logic

    // Add a single item to the list
    public void addItem(Menuitem item) {
        items.add(item);
    }

    // Calculate total price by looping through all items
    public double calculateTotal() {
        double total = 0;
        for (Menuitem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public int countItems() {
        return items.size();
    }

    public void markAsPaid() {
        this.paid = true;
    }

    @Override
    public String toString() {
        String status = paid ? "PAID" : "NOT PAID";
        return "Order #" + orderNumber + " [" + status + "] for " + customer;
    }
}
