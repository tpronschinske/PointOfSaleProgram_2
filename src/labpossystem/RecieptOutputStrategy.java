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
public interface RecieptOutputStrategy {
    
    // prints reciept header with items 
    public abstract void getRecieptOutput();
    
    //to populate the reciept totals
    public abstract void generateRecieptTotals();
    
    
    
    
}
