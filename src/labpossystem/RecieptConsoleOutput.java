/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labpossystem;

import java.util.Date;

/**
 *
 * @author tpronschinske
 */
public class RecieptConsoleOutput implements RecieptOutputStrategy {
    
    private final String storeName = "Kohls";
    private LineItem[] lineItem;
   

    @Override
    public void getRecieptOutput() {
          
          Date date = new Date();
          
          System.out.println("Store: " + storeName + "  ---   Date of Sale:" + date.toString());
          System.out.println("-------------------------------------------------------------------------------------------");
          System.out.println("Item ID:          Item Description:       Price:         Quantity:          Discount: " );
          System.out.println("-------------------------------------------------------------------------------------------");
          System.out.println("-------------------------------------------------------------------------------------------");
          generateRecieptItems();
          
          System.out.println(                                                         "Bill Total: "  +  "Discount Total: ");
          
          
          
    }
    
    
    @Override
    public void generateRecieptItems(){
    
     for(LineItem items : lineItem){
         items.getProduct().getProductID();
         items.getProduct().getProductName();
         items.getProduct().getPrice();
         items.getQuantity();
         items.getAmountSaved();
     }
        
     }
        
        
    }
    
    
    

