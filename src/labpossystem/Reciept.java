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
public class Reciept {
    
    private RecieptOutputStrategy output;
    private FakeDatabase fakeDatabase;
    private Customer customer;
    private LineItem[] lineItem;
    private int recieptNumber;

    public Reciept(RecieptOutputStrategy output, FakeDatabase fakeDatabase,String customerID) {
        this.output = output;
        this.fakeDatabase = fakeDatabase;
        this.customer = retrieveCustomer(customerID);
        lineItem = new LineItem[0];
        recieptNumber++;
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
   
   public final void getRecieptOutput(){
       getRecieptHeader();
       getRecieptItems();
       getRecieptTotals();
       
   }
   
   public final void getRecieptHeader(){
       
          Date date = new Date();
          StringBuilder recieptHeader = new StringBuilder();
          
          recieptHeader.append("Store: Kohls Department Store" + "  ---   Date of Sale:").append(date.toString());
          recieptHeader.append("CustomerID: ").append(customer.getCustomerID()).append("Customer Name: ").append(customer.getCustomerName());
          recieptHeader.append("-------------------------------------------------------------------------------------------------------");
          recieptHeader.append("Item ID:          Item Description:       Price:         Quantity:          SubTotal:       Discount: " );
          recieptHeader.append("-------------------------------------------------------------------------------------------------------");
          recieptHeader.append("-------------------------------------------------------------------------------------------------------");
         output.getRecieptOutput(recieptHeader.toString());
          
   }
   
   public final void getRecieptItems(){
       
       StringBuilder recieptItem = new StringBuilder();
       
        for (LineItem items : lineItem) {
           recieptItem.append(items.getProduct().getProductID());
           recieptItem.append(items.getProduct().getProductName());
           recieptItem.append(items.getProduct().getPrice());
           recieptItem.append(items.getQuantity());
           recieptItem.append(items.getSubtotalForItem());
           recieptItem.append(items.getAmountSaved());
        }         
        
         output.getRecieptOutput(recieptItem.toString());
   }
   
   public final void getRecieptTotals(){
       
        StringBuilder recieptTotalFooter = new StringBuilder();
        
        double overallBillTotal = getTotalBillForReciept();
        double overallTotalDiscount = getTotalDiscountForReciept();
        
          recieptTotalFooter.append("-------------------------------------------------------------------------------------------");
          recieptTotalFooter.append(                                                        "Bill Total: "  +  "Discount Total: ");
          recieptTotalFooter.append("                                                      $").append(overallBillTotal).append("  $").append(overallTotalDiscount);
    output.getRecieptOutput(recieptTotalFooter.toString());
   }
   
    public RecieptOutputStrategy getOutput() {
        return output;
    }

    public void setRecieptOutputStrategy(RecieptOutputStrategy output) {
        this.output = output;
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