package management.test;

public class Controller {

    Store store = new Store();
    View view = new View();

    public void addProduct(String productName, String productCode, int price, int productNumber, boolean isFreeze) {

        store.addProduct(productName, productCode, price, productNumber, isFreeze);
        view.displayMessage(" ---------- 발주 상품 등록 완료 ---------- ");
    }

    public void getProduct(String productCode2) {

      ProductDTO product = store.getProduct(productCode2);

      if(product != null) {
          view.displayProduct(product);
          view.displayMessage("");
          view.displayMessage(" ---------- 발주 상품 조회 완료 ---------- ");
      } else {
          view.displayMessage(" ---------- 조회 실패 : 일치하는 상품 찾을 수 없음 ---------- ");
      }
    }

//    public ProductDTO setProduct() {
//
//    }
//
//
//    public void setProductName(String productName1, String productCode3) {
//
//        ProductDTO product = store.setProductName(productCode3, productName1);
//        view.displayMessage(" ---------- 상품 이름 수정 완료 ---------- ");
//    }
//
//    public void setProductCode(String productCode4, String productCode3) {
//
//        ProductDTO product = store.setProductCode(productCode3, productCode4);
//        view.displayMessage(" ---------- 상품 코드 수정 완료 ---------- ");
//    }
//
//    public void setPrice(int price1, String productCode3) {
//
//        ProductDTO product = store.setPrice(price1, productCode3);
//        view.displayMessage(" ---------- 상품 가격 수정 완료 ---------- ");
//
//    }
//
//    public void setProductNumber(int productNumber1, String productCode3) {
//
//        ProductDTO product = store.setProductNumber(productNumber1, productCode3);
//        view.displayMessage(" ---------- 상품 개수 수정 완료 ---------- ");
//
//    }
//
//    public void setIsFreeze(boolean isFreeze1, String productCode3) {
//
//        ProductDTO product = store.setIsFreeze(isFreeze1, productCode3);
//        view.displayMessage(" ---------- 상품 냉동 여부 수정 완료 ---------- ");
//
//    }
//
//    public void deleteProduct() {}
//
//    public void getAllProduct() {}

}
