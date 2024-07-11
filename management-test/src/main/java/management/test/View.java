package management.test;

import java.util.List;

public class View {

    public void displayProduct(ProductDTO products) {
        System.out.println(products);
    }

    public void displayProductList(List<ProductDTO> allProduct) {
        for(ProductDTO p : allProduct) {
            System.out.println(p);
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

}
