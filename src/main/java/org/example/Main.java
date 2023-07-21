package org.example;

import repository.Product;
import repository.ProductRepository;

public class Main {
    public static void main(String[] args) {

        Product pr1 = new Product(1, "auto", 100000, "ojeta kara");
        Product pr2 = new Product(2, "kolo", 75000, "pumpickaruv sen");

        ProductRepository repo = new ProductRepository();
        repo.addProduct(pr1);
        repo.addProduct(pr2);

        Product pr3 = repo.getProductById(2);
        System.out.println(pr3.name + " " + pr3.description);

        Product pr4 = new Product(3, "boty", 350, "ponekud skrpaly");
        repo.addProduct(pr4);
        Product pr5 = new Product(3, "boty", 1590, "o neco lepsi");
        repo.updateProduct(pr5);
        Product pr6 = repo.getProductById(3);
        System.out.println(pr6.name + " " + pr6.description);

        System.out.println(repo.getProducts());
        repo.deleteProductById(1);
        System.out.println(repo.getProducts());

    }
}