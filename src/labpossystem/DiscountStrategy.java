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
public interface DiscountStrategy {
    
    
    public abstract double getDiscountAmount(double price, double quantity);
    public abstract double getDiscountRate();
    
    //ability to change the discountRate...provides flexability
    public abstract void setDiscountRate(double discountRate);
    
}
