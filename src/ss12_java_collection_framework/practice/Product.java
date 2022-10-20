package ss12_java_collection_framework.practice;

public class Product {
    private String productz;
    private int id;
    private double price;

    public Product() {
    }

    public Product(String productz, int id, double price) {
        this.productz = productz;
        this.id = id;
        this.price = price;
    }

    public String getProductz() {
        return productz;
    }

    public void setProductz(String productz) {
        this.productz = productz;
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
                "Game:'" + productz + '\'' +
                ", ID = " + id +
                ", Price = " + price +
                '}';
    }
}
