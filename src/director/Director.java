package director;

import builder.Builder;
import product.Product;
/**
 * Director class used to "build" all the product at one time using "construct()" method
 * @see Product
 * @see entity
 */
public class Director {

    Builder builder;

    public void construct(Builder builder) {
        this.builder = builder;
        builder.startUpOperations();
        builder.buildBody();
        builder.insertWheels();
        builder.addLights();
        builder.endOperation();
    }
}
