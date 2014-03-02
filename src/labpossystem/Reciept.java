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

    public Reciept(RecieptOutputStrategy recieptOutputStrategy, FakeDatabase fakedatabase, Customer customerID) {
        this.recieptOutputStrategy = recieptOutputStrategy;
        this.fakedatabase = fakedatabase;
        this.customer = retrieveCustomer(customerID);
        lineItem = new LineItem[0];

    }

   
    

    
}
