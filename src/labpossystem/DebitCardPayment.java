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
public class DebitCardPayment implements PaymentStrategy{
    
    private Customer customer;
    private int pinNumber;

    public DebitCardPayment(int pinNumber) {
        this.customer = customer;
        this.pinNumber = pinNumber;
    }
    
    
    @Override
    public void getPayment(){
        //needs pin validation
        System.out.println("Your 4 Digit Pin Is: " + pinNumber);
        System.out.println("Payment Approved");
        System.out.println("Thank You For Shopping At Kohls");
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }
    
    
    
    
    
    
}
