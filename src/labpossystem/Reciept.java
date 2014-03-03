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
public class Reciept {
    
    private RecieptOutputStrategy recieptOutputStrategy;
    private FakeDatabase fakeDatabase;
    private Customer customer;
    private LineItem[] lineItem;
   

    public Reciept(RecieptOutputStrategy recieptOutputStrategy, FakeDatabase fakedatabase,String customerID ) {
        this.recieptOutputStrategy = recieptOutputStrategy;
        this.fakeDatabase = fakedatabase;
        this.customer = retrieveCustomer(customerID);
        lineItem = new LineItem[0];
      

    }

     
   private Customer retrieveCustomer(String customerID){
       Customer customer = fakeDatabase.retrieveCustomer(customerID);
       return customer;
   }
    

  //Gets the bill total before discount
   private double getTotalBill(){
       double billTotal = 0.0;
       for(LineItem items: lineItem){
           billTotal += items.getProduct().getPrice();
           
       }
       return billTotal;
   }

   //Gets discount of all items
   public double getTotalDiscount(){
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
   
   
   
   
   
   
   
}
