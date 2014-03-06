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
    
    
    private String cardNumber;
    private int cvvNumber;
    private String expirationDate;
   

    public CreditCardPayment(String cardNumber, int cvvNumber, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cvvNumber = cvvNumber;
        this.expirationDate = expirationDate;
    }

    @Override
    public void getPayment(){
        //NEEDS VALIDATION FOR CARD LENGTH AND CVV LENGTH
        System.out.println("Card Number: " + cardNumber + " CVV Code: " + cvvNumber + " Exp: " + expirationDate);  
        System.out.println("Approved Thank You For Shopping At Kohls");
    }



    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
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
