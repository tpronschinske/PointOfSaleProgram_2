/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labpossystem;

/**
 *
 * @author Celeste
 */
public class LineItem {
    
    
    private FakeDatabase fakeDatabase;
    private Product product;
    private double quantity;
  

    public LineItem(FakeDatabase fakeDatabase, String productID, double quantity) {
        this.fakeDatabase = fakeDatabase;
        this.product = retrieveProduct(productID);
        setQuantity(quantity);
    }


    public final Product retrieveProduct(String productID){
        return fakeDatabase.retrieveProduct(productID);
        
    }
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getAmountSaved() {
        // inputed to the line item in order to display to line item reciept
        // object ---------------------------//method
        return product.getDiscountStrategy().getDiscountAmount(product.getPrice(), quantity);
    }

    public void setAmountSaved(double amountSaved) {
        this.amountSaved = amountSaved;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public FakeDatabase getFakeDatabase() {
        return fakeDatabase;
    }

    public void setFakeDatabase(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

 
    
}
