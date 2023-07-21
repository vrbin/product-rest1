package repository;

public class Product {
    long id;
    String name;
    double price;
    String description;

    public Product(long id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
