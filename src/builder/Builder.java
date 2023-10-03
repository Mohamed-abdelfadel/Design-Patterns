package builder;

import product.Product;
import director.Director;
/**
 * This interface Builder used to define all the functionalities(steps) needed from the product to be built successfully.
 * It should be implemented with the entities we have under the name of Product
 * @see Director
 * @see entity
 */
public interface Builder {

    void startUpOperations();

    void buildBody();

    void insertWheels();

    void addLights();

    void endOperation();

    Product getProduct();
}
