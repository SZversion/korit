package ch19_generic.products;

public class Product {
    public static void main(String[] args) {
        ProductController<String> product1 = new ProductController<>("Intel i7, 16GB RAM, 512GB SSD", "Laptop");
        ProductController<Double> product2 = new ProductController<>(799.99, "Smartphone");
        ProductController<Boolean> product3 = new ProductController<>(true, "Available");

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}
