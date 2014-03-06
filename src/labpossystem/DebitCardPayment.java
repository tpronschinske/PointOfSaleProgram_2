/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labpossystem;
import java.util.Scanner;
/**
 *
 * @author Celeste
 */
public class DebitCardPayment implements PaymentStrategy{
    
    private Customer customer;
    private int pinNumber;

    public DebitCardPayment(Customer customer, int pinNumber) {
        this.customer = customer;
        this.pinNumber = pinNumber;
    }
    
    
    @Override
    public void getPayment(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please Enter Your 4 Digit Pin Number: ");
        pinNumber = keyboard.nextInt();
        
        if(pinNumber > 4){
            System.out.println("Invalid Pin Please Re-Enter Your Pin Number");
            pinNumber = keyboard.nextInt();
        }
        
        
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