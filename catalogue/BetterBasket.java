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
  public boolean add( Product pr )
  {
	 return super.add( pr ); 		// Call add in ArrayList 
  }
}
