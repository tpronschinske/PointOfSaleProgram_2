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
public class NoDiscount implements DiscountStrategy {

    private double discountRate = 0;
    
    //
    @Override
    public final double getDiscountAmount(double price, double quantity){
        return 0;
    }
    
    @Override
    public final double getDiscountRate(){
        return discountRate;        
    }
   
    @Override
    public final void setDiscountRate(double discountRate){
        this.discountRate = 0.0;
    }
    
    
}


