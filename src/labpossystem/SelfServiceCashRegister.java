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
public class SelfServiceCashRegister {
    
    Customer customer;
    FakeDatabase fakedatabase;
    RecieptConsoleOutput rco;

    public SelfServiceCashRegister(Customer customerID, FakeDatabase fakedatabase, RecieptConsoleOutput rco) {
        this.customer = customerID;
        this.fakedatabase = fakedatabase;
        this.rco = rco;
    }
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public FakeDatabase getFakedatabase() {
        return fakedatabase;
    }

    public void setFakedatabase(FakeDatabase fakedatabase) {
        this.fakedatabase = fakedatabase;
    }

    public RecieptConsoleOutput getRco() {
        return rco;
    }

    public void setRco(RecieptConsoleOutput rco) {
        this.rco = rco;
    }
   
    
    
    
    
}
