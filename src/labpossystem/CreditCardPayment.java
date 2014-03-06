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
public class CreditCardPayment implements PaymentStrategy {
    
    private String cardType;
    private String cardNumber;
    private int cvvNumber;
    private String expirationDate;
   

    public CreditCardPayment(String cardType, String cardNumber, int cvvNumber, String expirationDate) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cvvNumber = cvvNumber;
        this.expirationDate = expirationDate;
    }

    @Override
    public void getPayment(){
      
        System.out.println("Card: " + cardType + " Card Number: " + cardNumber + " CVV Code: " + cvvNumber + " Exp: " + expirationDate);  
        System.out.println("Payment Approved");
        System.out.println("Thank You For Shopping At Kohls");
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

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    
    
    
}
