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
public class HolidayDiscount implements DiscountStrategy {

    private double discountRate = 0;
    private String holiday;

    public HolidayDiscount(String holiday) {
        this.holiday = holiday;
    }
    
    //
    
    @Override
    public final double getDiscountAmount(double price, double quantity){
        switch (holiday) {
                    case "ValentinesDay":
                        discountRate = price * quantity * .20;
                        break;
                    case "Easter":
                        discountRate = price * quantity * .15;
                        break;
                    case "MothersDay":
                        discountRate = price * quantity * .10;
                        break;
                    case "FathersDay":
                        discountRate = price * quantity * .10;
                        break;
                    case "MemorialDay":
                        discountRate = price * quantity * .18;
                        break;
                    case "Thanksgiving":
                        discountRate = price * quantity * .25;
                        break;
                    case "BlackFriday":
                        discountRate = price * quantity * .30;
                        break;
                    case "Christmas":
                        discountRate = price * quantity * .20;
                        break;
        }
        return discountRate;                         
    }
    
    @Override
    public final double getDiscountRate(){
        return discountRate;        
    }
   
    @Override
    public final void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }
    
    
    
}
