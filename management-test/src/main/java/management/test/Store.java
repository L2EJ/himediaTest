package management.test;

import java.util.ArrayList;

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

//    public ProductDTO setProduct() {
//
//    }
//
//    public ProductDTO setProductName(String productName1, String productCode3) {
//        for(ProductDTO p : products) {
//            if(p.getProductName().equals(productCode3)) {
//                p.setProductName(productName1);
//                return p;
//            }
//        }
//        return null;
//    }
//
//    public ProductDTO setProductCode(String productCode4, String productCode3) {
//        for(ProductDTO p : products) {
//            if(p.getProductCode().equals(productCode3)) {
//                p.setProductCode(productCode4);
//                return p;
//            }
//        }
//        return null;
//    }
//
//    public ProductDTO setPrice(int price1, String productCode3) {
//        for(ProductDTO p : products) {
//            if(p.getPrice().equ(productCode3)) {
//                p.setPrice(price1);
//                return p;
//            }
//        }
//        return null;
//
//    }
//
//    public ProductDTO setProductNumber(int productNumber1, String productCode3) {
//        for(ProductDTO p : products) {
//            if(p.getProductNumber() == (productCode3)) {
//                p.setProductNumber(productNumber1);
//                return p;
//            }
//        }
//        return null;
//
//    }
//
//    public ProductDTO setIsFreeze(boolean isFreeze1, String productCode3) {
//        for(ProductDTO p : products) {
//            if(p.isFreeze() == (productCode3)) {
//                p.setFreeze(isFreeze1);
//                return p;
//            }
//        }
//        return null;
//
//    }
//
//    public void deleteProduct() {}
//
//    public void getAllProduct() {}

}
