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

    
    private Customer[] customers = {
        new Customer("Henry Ford", "AX187"),
        new Customer("Gerald Ford", "AX121"),
        new Customer("Joseph Brown", "GX589"),
        new Customer("Jimmy Dean", "SX227")
    };

    private Product[] products = {
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
   
    public final Customer retrieveCustomer(String customerID) {
        if (customerID == null || customerID.length() == 0) {
            System.out.println("Must have customer ID to process sale");
            return null;
        } 
            
            Customer customer = null;
            for (Customer c : customers) {
                if (customerID.equals(c.getCustomerID())) {
                    customer = c;
                    break;
                }
            }
            return customer;
        }
        
    

    public final Product retrieveProduct(String productID) {
        Product product = null;
        if (productID == null || productID.length() == 0) {
            System.out.println("Sorry must enter a product");
        } else {
            for (Product p : products) {
                if (productID.equals(p.getProductID())) {
                    product = p;
                    break;
                }
            }
        }
        return product;
    }

}
