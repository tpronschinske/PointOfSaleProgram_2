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
public class BuyOneGetOneFreeDiscount implements DiscountStrategy {
      
    private double discountRate = 0.0;
   
    //
    public BuyOneGetOneFreeDiscount() {
        this.discountRate = discountRate;
    }
     
    @Override
    public final double getDiscountAmount(double price, double quantity){
        if(quantity == 2 || quantity == 4 || quantity == 6 || quantity == 8 || quantity == 10){
            discountRate = price * quantity - (price / 2);
            return discountRate;
        } else {
            return 0;
        }
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
