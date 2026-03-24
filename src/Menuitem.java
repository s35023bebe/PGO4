public class Menuitem {
    private String code;
    private String name;
    private double price;
    private String category;
    private static int productCount = 0;

    public Menuitem(String code, String name, double price, String category) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.category = category;
        productCount++;
    }
    public String getCode() { return code; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }

    public static int getProductCount() {
        return productCount;
    }
    @Override
    public String toString() {
        return String.format("[%s] %s - %.2f PLN", code, name, price);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menuitem other = (Menuitem) o;
        return code != null && code.equals(other.code);
    }
}