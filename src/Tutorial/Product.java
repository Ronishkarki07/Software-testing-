package Tutorial;

public class Product {
    private String name;
    private double price;
    private double discountPercentage;

    public Product(String name, double price, double discountPercentage) {
        this.name = name;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    public double calculateTotalPrice() {
        double discountAmount = price * (discountPercentage / 100);
        return price - discountAmount;
    }
}
