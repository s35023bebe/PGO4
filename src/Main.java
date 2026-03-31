public class main {
    public static void main(String[] args) {

        Menuitem m1 = new Menuitem("C-01", "Espresso", 9.0, "coffee");
        Menuitem m2 = new Menuitem("C-02", "Cappuccino", 13.5, "coffee");
        Menuitem m3 = new Menuitem("D-01", "Cheesecake", 16.0, "dessert");
        System.out.println("Number of products created: " + Menuitem.getProductCount());
        System.out.println("Product 1: " + m1);
        System.out.println("Product 2: " + m2);
        Menuitem espressoCopy = new Menuitem("C-01", "Espresso duplicate", 9.0, "coffee");
        System.out.println("Are the products equal (by code)? " + m1.equals(espressoCopy));

    }
}