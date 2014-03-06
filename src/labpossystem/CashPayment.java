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
public class CashPayment implements PaymentStrategy {
    
    private Customer customer;
    private double cashPayment = 0.0;

    public CashPayment(double cashPayment) {
        this.cashPayment = cashPayment;
    }

    @Override
    public void getPayment(){
        System.out.println("Customer ID:"); customer.getCustomerID();
        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Paid In Full With Cash, Thank You For Shopping At Kohls");
              
    }
    
    public double getCashPayment() {
        return cashPayment;
    }

    public void setCashPayment(double cashPayment) {
        this.cashPayment = cashPayment;
    }
    
    
    
    
}
