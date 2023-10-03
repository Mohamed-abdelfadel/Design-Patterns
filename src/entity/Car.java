package entity;

import builder.Builder;
import product.Product;

/**
 * This entity implements Builder interface to get the functionality required as a "Product"
 * @see Builder
 * @see Product
 */
public class Car implements Builder {

    private final String brand;

    private final Product product;

    public Car(String brand) {
        this.product = new Product();
        this.brand = brand;
    }

    @Override
    public void startUpOperations() {
        product.add("entity.Car model name is " + brand + " ");
    }

    @Override
    public void buildBody() {
        product.add("Building body ");
    }

    @Override
    public void insertWheels() {
        product.add("Inserting wheels ");
    }

    @Override
    public void addLights() {
        product.add("Adding lights ");
    }

    @Override
    public void endOperation() {
        product.add("Ending operation ");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
