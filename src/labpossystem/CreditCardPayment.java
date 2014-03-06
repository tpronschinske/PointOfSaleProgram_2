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
public class CreditCardPayment implements PaymentStrategy {
    
    
    private Customer customer;
    private int cardNumber;
    private int cvvNumber;
    private String expirationDate;
   

    

    public CreditCardPayment(Customer customer, int cardNumber, int cvvNumber, String expirationDate) {
        this.customer = customer;
        this.cardNumber = cardNumber;
        this.cvvNumber = cvvNumber;
        this.expirationDate = expirationDate;
    }

    @Override
    public void getPayment(){
      
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please Enter Your 16 Digit Card Number: "); 
         cardNumber = keyboard.nextInt();
         String ccNum = new Integer(cardNumber).toString();
         
         //validation
         if(ccNum.length() > 16 ){
             System.out.println("Invalid Card Number Please Re-Enter: ");
              cardNumber = keyboard.nextInt();
         }
        System.out.println("Please Enter Your 3 Digit Code On The Back Of Your Card: ");
        cvvNumber = keyboard.nextInt();
        String cvvNum = new Integer(cvvNumber).toString();
        //validation
         if(cvvNum.length() > 3){
             System.out.println("Invalid Please Re-Enter Your 3 Digit CVV Number Located On Back Of Card: ");
             cvvNumber = keyboard.nextInt();
         }
        //needs validation
        System.out.println("Please Enter Your Expiration Date: "); 
        expirationDate = keyboard.nextLine();
        
        
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvvNumber() {
        return cvvNumber;
    }

    public void setCvvNumber(int cvvNumber) {
        this.cvvNumber = cvvNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    
    
}
