/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labpossystem;

/**
 *
 * @author tpronschinske
 */
public class SelfServiceCashRegister  {

    private PaymentStrategy paymentStrategy;
    private Reciept reciept;

    public void newCustomerSale(RecieptOutputStrategy output, FakeDatabase fakeDatabase,String customerID){
       reciept = new Reciept(output,fakeDatabase,customerID);
       setPaymentStrategy(paymentStrategy);
    }

    
    public void addNewItemToSale(String productID, double quantity){
        
        reciept.addNewLineItem(productID, quantity);
    }
 
    public void getPayment(){
        paymentStrategy.getPayment();
    }
    
    public void endSale(){
        reciept.getRecieptOutput();
    }

    public Reciept getReciept() {
        return reciept;
    }

    public void setReciept(Reciept reciept) {
        this.reciept = reciept;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    
    
}
