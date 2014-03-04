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
  
     SelfServiceCashRegister newSale = new SelfServiceCashRegister();
     
     newSale.newCustomerSale(new Reciept(), new FakeDatabase(), "GX589");
     newSale.addNewItemToSale("A197", 2);
     newSale.addNewItemToSale("A999", 5);
     newSale.addNewItemToSale("A109", 2);
     newSale.addNewItemToSale("A812", 4);
     newSale.addNewItemToSale("A164", 1);
     newSale.addNewItemToSale("A111", 1);
     newSale.endSale();

    }
    
}
