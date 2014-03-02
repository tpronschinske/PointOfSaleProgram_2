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
public class FakeDatabase {

   private Customer[] customer = {
    new Customer("Henry Ford", "A187"),
    new Customer("Gerald Ford", "A121"),
    new Customer("Joseph Brown", "G589"),
    new Customer("Jimmy Dean", "S227")
   };
    
   private Product[] product = {
       new Product("A999", "Men's Jacket", 89.95, new NoDiscount()),
       new Product("A197", "Women's Jacket", 79.95, new PercentOffDiscount(.20)),
       new Product("A914", "Men's T-Shirt", 9.95, new BuyOneGetOneFreeDiscount()),
       new Product("A989", "Women's T-Shirt", 14.95, new BuyOneGetOneFreeDiscount()),
       new Product("A897", "Men's Suit", 189.95, new PercentOffDiscount(.15)),
       new Product("A812", "Women's Suit", 149.95, new PercentOffDiscount(.20)),
       new Product("A109", "Men's Tie", 39.95, new HolidayDiscount("Thanksgiving")),
       new Product("A164", "Women's Shoes", 49.95, new HolidayDiscount("BlackFriday")),
       new Product("A111", "Men's Sweater", 29.95, new HolidayDiscount("Christmas")),
       new Product("A659", "Women's Sweater", 49.95, new PercentOffDiscount(.05)),
       new Product("A789", "Men's Jeans", 19.95, new NoDiscount())
       
    }; 
   
public final Product retrieveProduct(final String productId) {
        Product product = null;
        // validation is needed for method parameter
        if (productId == null || productId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findProduct method has "
                    + "illegal argument");
        } else {
            for (Product p : products) {
                if (productId.equals(p.getProductId())) {
                    product = p;
                    break;
                }
            }
        }
        return product;
    }

}
