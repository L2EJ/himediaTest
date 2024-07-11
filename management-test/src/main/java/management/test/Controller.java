package management.test;

public class Controller {

    Store store = new Store();
    View view = new View();

    public void addProduct(String productName, String productCode, int price, int productNumber, boolean isFreeze) {

        store.addProduct(productName, productCode, price, productNumber, isFreeze);
        view.displayMessage(" 발주 상품 등록이 완료 되었습니다! ");
    }

    public void getProduct() {}

    public void setProduct() {}

    public void deleteProduct() {}

    public void getAllProduct() {}

}
