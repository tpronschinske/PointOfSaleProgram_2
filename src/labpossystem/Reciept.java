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
    private FakeDatabase fakedatabase;
    private Customer customer;
    private LineItem[] lineItem;
   

    public Reciept(RecieptOutputStrategy recieptOutputStrategy, FakeDatabase fakedatabase,String customerID ) {
        this.recieptOutputStrategy = recieptOutputStrategy;
        this.fakedatabase = fakedatabase;
        this.customer = retrieveCustomer(customerID);
        lineItem = new LineItem[0];
      

    }

   /// Fake Database underlined in red with  
   private Customer retrieveCustomer(String customerID){
       Customer customer = fakeDatabase.retrieveCustomer(customerID);
       return customer;
   }
    

   //Error lineItems
   private double getTotalBill(){
       double total = 0.0;
       for(LineItem items: lineItems){
           total += items.getProduct().getPrice();
           
       }
       return total;
   }

    public RecieptOutputStrategy getRecieptOutputStrategy() {
        return recieptOutputStrategy;
    }

    public void setRecieptOutputStrategy(RecieptOutputStrategy recieptOutputStrategy) {
        this.recieptOutputStrategy = recieptOutputStrategy;
    }

    public FakeDatabase getFakedatabase() {
        return fakedatabase;
    }

    public void setFakedatabase(FakeDatabase fakedatabase) {
        this.fakedatabase = fakedatabase;
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
