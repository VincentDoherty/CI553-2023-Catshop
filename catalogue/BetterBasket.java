package catalogue;

import java.io.Serializable;
import java.util.Collections;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;
  

  // You need to add code here
  // let's start by overriding the add method
  @Override
  public boolean add( Product pr ){
	  boolean added = false;
	  
	// Check if the product is already in the basket
      for (Product existingProduct : this) {
          if (existingProduct.getProductNum().equals(pr.getProductNum())) {
              // Product already exists, merge quantities
              existingProduct.setQuantity(existingProduct.getQuantity() + pr.getQuantity());
              added = true;
              break;
          }
      }
      
      if (!added) {
          // Product not found, add it to the basket
          super.add(pr);
      }
   // Sort the basket based on product numbers
      Collections.sort(this, (p1, p2) -> p1.getProductNum().compareTo(p2.getProductNum()));

      return true; 
  }
}
