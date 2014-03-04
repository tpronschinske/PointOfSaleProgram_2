/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labpossystem;

import java.util.Date;

/**
 *
 * @author Celeste
 */
public class Reciept implements RecieptOutputStrategy {
    
    private RecieptOutputStrategy newReciept;
    private FakeDatabase fakeDatabase;
    private Customer customer;
    private LineItem[] lineItem;
   

    public Reciept(RecieptOutputStrategy newReciept, FakeDatabase fakeDatabase,String customerID) {
        this.newReciept = newReciept;
        this.fakeDatabase = fakeDatabase;
        this.customer = retrieveCustomer(customerID);
        lineItem = new LineItem[0];
      

    }

     
   private Customer retrieveCustomer(String customerID){
       Customer customer = fakeDatabase.retrieveCustomer(customerID);
       return customer;
   }
    

  //Gets the bill total before discount
   private double getTotalBillForReciept(){
       double billTotal = 0.0;
       for(LineItem items: lineItem){
           billTotal += items.getProduct().getPrice();
           
       }
       return billTotal;
   }

   //Gets discount of all items
   public double getTotalDiscountForReciept(){
       double discountTotal = 0.0;
       for(LineItem items: lineItem){
           discountTotal += items.getAmountSaved();
       }
       return discountTotal;
   }
   
   
   //Line item finds product through its ID
   
   public final void addNewLineItem(String productID, double quantity){
       LineItem items = new LineItem(fakeDatabase, productID, quantity);
       addNewItemToArray(items);
   }
   
   
   public final void addNewItemToArray(LineItem items){
        LineItem[] tempItems = new LineItem[lineItem.length + 1];
        System.arraycopy(lineItem, 0, tempItems, 0, lineItem.length);
        tempItems[lineItem.length] = items;
        lineItem = tempItems;
       
       
   }
   
    @Override
   public final void getRecieptOutput(){
       
          Date date = new Date();
          
          System.out.println("Store: Kohls Department Store" + "  ---   Date of Sale:" + date.toString());
          System.out.println("CustomerID: " + customer.getCustomerID() + "Customer Name: " + customer.getCustomerName());
          System.out.println("-------------------------------------------------------------------------------------------");
          System.out.println("Item ID:          Item Description:       Price:         Quantity:          Discount: " );
          System.out.println("-------------------------------------------------------------------------------------------");
          System.out.println("-------------------------------------------------------------------------------------------");
        for (LineItem items : lineItem) {
           items.getProduct().getProductID();
           items.getProduct().getProductName();
           items.getProduct().getPrice();
           items.getQuantity();
           items.getAmountSaved();
        }
            generateRecieptTotals();
   }
   
    @Override
   public final void generateRecieptTotals(){
        double overallBillTotal = getTotalBillForReciept();
        double overallTotalDiscount = getTotalDiscountForReciept();
        
          System.out.println("-------------------------------------------------------------------------------------------");
          System.out.println(                                                         "Bill Total: "  +  "Discount Total: ");
          System.out.println("                                                      $" +overallBillTotal + "  $" + overallTotalDiscount);
   }

   
   
    public RecieptOutputStrategy getReciept() {
        return newReciept;
    }

    public void setRecieptOutputStrategy(RecieptOutputStrategy newReciept) {
        this.newReciept = newReciept;
    }

    public FakeDatabase getFakeDatabase() {
        return fakeDatabase;
    }

    public void setFakeDatabase(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LineItem[] getLineItem() {
        return lineItem;
    }

    public void setLineItem(LineItem[] lineItem) {
        this.lineItem = lineItem;
    }
   
   
   
   
}