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

   
    private Reciept reciept;

    public void newCustomerSale(Reciept reciept, FakeDatabase fakeDatabase,String customerID){
        reciept = new Reciept(reciept,fakeDatabase,customerID);
    }
    
    
    public void addNewItemToSale(String productID, double quantity){
        
        reciept.addNewLineItem(productID, quantity);
    }
    
    
    public void endSale(){
        reciept.getRecieptOutput();
        reciept.generateRecieptTotals();
    }
    
    
}
