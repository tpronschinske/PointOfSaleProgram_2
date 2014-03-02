/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labpossystem;

public class Product {
    private String productID;
    private String productName;
    private double price;
    private DiscountStrategy discountStrategy;

    public Product(String productID, String productName, double price, DiscountStrategy discountStrategy) {
       setProductID(productID);
       setProductName(productName);
       setPrice(price);
       setDiscountStrategy(discountStrategy);
    }

    public final String getProductID() {
        return productID;
    }

    public final void setProductID(String productID) {
        this.productID = productID;
    }

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        this.productName = productName;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }

    public final DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public final void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }


  
  
    
}
