package management.test;

import java.util.Objects;

public class ProductDTO {

    private String productName;
    private String productCode;
    private int price;
    private int productNumber;
    private boolean isFreeze;

    public ProductDTO() {
    }

    public ProductDTO(String productName, String productCode, int price, int productNumber, boolean isFreeze) {
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
        this.productNumber = productNumber;
        this.isFreeze = isFreeze;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public boolean isFreeze() {
        return isFreeze;
    }

    public void setFreeze(boolean freeze) {
        isFreeze = freeze;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productName='" + productName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", price=" + price +
                ", productNumber=" + productNumber +
                ", isFreeze=" + isFreeze +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDTO that = (ProductDTO) o;
        return price == that.price && productNumber == that.productNumber && isFreeze == that.isFreeze && Objects.equals(productName, that.productName) && Objects.equals(productCode, that.productCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productCode, price, productNumber, isFreeze);
    }
}
