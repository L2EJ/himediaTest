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

    public void setProduct() {}

    public void deleteProduct() {}

    public void getAllProduct() {}

}
