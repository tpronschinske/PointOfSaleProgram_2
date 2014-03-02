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
public class Customer {
    
    private String customerName;
    private String customerID;
    
    
    
    public Customer(String customerName, String customerID) {
        setCustomerName(customerName);
        setCustomerID(customerID); 
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

  
   
    
    
    
    
    
    
    
    
    
}
