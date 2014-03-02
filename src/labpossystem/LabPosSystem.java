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
public class LabPosSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     Product product = new Product("A100", "Blue T-Shirt ", 9.95, new NoDiscount());
     System.out.println("ID: " + product.getProductID() + " Name: " +product.getProductName() + "Price: $" + product.getPrice() + " Discount: " + product.getDiscount());
        
     
     
    }
    
}
