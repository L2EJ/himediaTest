package management.test;

import java.util.ArrayList;

public class Store {

    ArrayList<ProductDTO> products = new ArrayList<>();

    public void addProduct(String productName, String productCode, int price, int productNumber, boolean isFreeze) {

        ProductDTO product = new ProductDTO(productName, productCode, price, productNumber, isFreeze);
        products.add(product);

    }

    public void getProduct() {}

    public void setProduct() {}

    public void deleteProduct() {}

    public void getAllProduct() {}

}
