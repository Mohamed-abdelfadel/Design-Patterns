package product;

import java.util.LinkedList;

/**This Product class deals with all the entities that could have the same functionality.
 * Once new Product is created a LinkedList of Strings being declared.
 * Here we have parts of the product, and we store it in a linked list.
 * So we can return it in readable format when the "show()" is called.
 */
public class Product {

    LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }


    /** Every time it called
     *  This method adds the variable from type string "part" to the "parts" LinkedList after the last element
     * @param part
     */
    public void add(String part) {
        parts.addLast(part);
    }

    /** This method used to "show" the created LinkedList "parts" in readable proper way
     * Using StringBuilder instead of adding to the original string to save memory
     * @return String
     */
    public String show() {
        StringBuilder result = new StringBuilder();
        result.append("product.Product component are : ");
        for (String part : parts) {
            result.append(part);
        }
        return result.toString();
    }
}
