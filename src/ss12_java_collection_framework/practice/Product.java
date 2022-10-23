package ss12_java_collection_framework.practice;

public class Product {
    private String productName;
    private int id;
    private double price;

    public Product() {
    }

    public Product(String productName, int id, double price) {
        this.productName = productName;
        this.id = id;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Game:'" + productName + '\'' +
                ", ID = " + id +
                ", Price = " + price +
                '}';
    }
}
