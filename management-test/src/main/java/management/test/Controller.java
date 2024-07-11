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


    public void setProductName(String productCode9, String productCode3, String productName1) {

        ProductDTO isSuccess = store.setProductName(productCode9, productCode3, productName1);
        view.displayMessage(" ---------- 상품 이름 수정 완료 ---------- ");
    }

    public void setProductCode(String productCode9, String productCode4, String productCode5) {

        ProductDTO product = store.setProductCode(productCode9, productCode4, productCode5);
        view.displayMessage(" ---------- 상품 코드 수정 완료 ---------- ");
    }

    public void setPrice(String productCode9, String productCode6, int price1) {

        ProductDTO product = store.setPrice(productCode9, productCode6, price1);
        view.displayMessage(" ---------- 상품 가격 수정 완료 ---------- ");

    }

    public void setProductNumber(String productCode9, String productCode7, int productNumber1) {

        ProductDTO product = store.setProductNumber(productCode9, productCode7, productNumber1);
        view.displayMessage(" ---------- 상품 개수 수정 완료 ---------- ");

    }

    public void setFreeze (boolean isFreeze2, String productCode8, String productCode9) {

        ProductDTO product = store.setFreeze(isFreeze2, productCode8, productCode9);
        view.displayMessage(" ---------- 상품 냉동 여부 수정 완료 ---------- ");

    }


    public void deleteProduct(String productCode10) {

        Boolean isDeleteSuccess = store.deleteProduct(productCode10);
        if(isDeleteSuccess) {
        view.displayMessage(" ---------- 상품 삭제 완료 ---------- ");
        } else {
            view.displayMessage(" ---------- 상품 삭제 실패 ---------- ");
        }
    }

    public void getAllProduct() {
        view.displayProductList(store.getAllProduct());
    }

}
