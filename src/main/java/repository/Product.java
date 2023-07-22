package repository;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    private long id;
    private String name;
    private double price;
    private String description;

    Product() {}

    public Product(long id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }
    public long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }
}
