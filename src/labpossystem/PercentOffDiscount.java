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
public class PercentOffDiscount implements DiscountStrategy {
    
    private double discountRate = 0.10;
    
    //

    public PercentOffDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    

     
    @Override
    public final double getDiscountAmount(double price, double quantity){
        return price * quantity * discountRate;
    }
    
    @Override
    public final double getDiscountRate(){
        return discountRate;        
    }
   
    @Override
    public final void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }
    
    
    
    
}
