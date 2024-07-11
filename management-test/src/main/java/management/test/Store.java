package management.test;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Store {

    ArrayList<ProductDTO> products = new ArrayList<>();

    public void addProduct(String productName, String productCode, int price, int productNumber, boolean isFreeze) {

        ProductDTO product = new ProductDTO(productName, productCode, price, productNumber, isFreeze);
        products.add(product);

    }

    public ProductDTO getProduct(String productCode2) {
        for(ProductDTO p : products) {
            if(p.getProductCode().equals(productCode2)) {
                return p;
            }
        }
        return null;
    }

    public void setProduct() {}

    public void deleteProduct() {}

    public void getAllProduct() {}

}
