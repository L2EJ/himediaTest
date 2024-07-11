package management.test;

import java.util.ArrayList;
import java.util.List;

public class Store {

    ArrayList<ProductDTO> products = new ArrayList<>();

    public void addProduct(String productName, String productCode, int price, int productNumber, boolean isFreeze) {

        ProductDTO product = new ProductDTO(productName, productCode, price, productNumber, isFreeze);
        products.add(product);

    }

    public ProductDTO getProduct(String productCode2) {
        for(ProductDTO p : products) {
            if(p.getProductCode().equals(productCode2)) {   // 문자열 비교는 .equals() 잊지말자!
                return p;
            }
        }
        return null;
    }

    public ProductDTO setProductName(String productCode9, String productCode3, String productName1) {
        for(ProductDTO p : products) {
            if(p.getProductCode().equals(productCode9)) {
                p.setProductName(productName1);
                return p;
            }
        }
        return null;
    }

    public ProductDTO setProductCode(String productCode9, String productCode4, String productCode5) {
        for(ProductDTO p : products) {
            if(p.getProductCode().equals(productCode9)) {
                p.setProductCode(productCode5);
                return p;
            }
        }
        return null;
    }

    public ProductDTO setPrice(String productCode9, String productCode6, int price1) {
        for(ProductDTO p : products) {
            if(p.getProductCode().equals(productCode9)) {
                p.setPrice(price1);
                return p;
            }
        }
        return null;

    }

    public ProductDTO setProductNumber(String productCode9, String productCode7, int productNumber1) {
        for(ProductDTO p : products) {
            if(p.getProductCode().equals(productCode9)) {
                p.setProductNumber(productNumber1);
                return p;
            }
        }
        return null;

    }

    public ProductDTO setFreeze(boolean isFreeze2, String productCode8, String productCode9) {
        for(ProductDTO p : products) {
            if(p.getProductCode().equals(productCode9)) {
                p.setFreeze(isFreeze2);
                return p;
            }
        }
        return null;

    }



    public Boolean deleteProduct(String productCode10) {
        for(ProductDTO p : products) {
            if(p.getProductCode().equals(productCode10)) {
                products.remove(p);
                return true;
            }
        }
        return false;
    }

    public List<ProductDTO> getAllProduct() {
        return products;
    }

}
