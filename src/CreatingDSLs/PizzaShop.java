/***
 * Excerpted from "Programming Groovy, 2nd Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vslg2 for more book information.
***/
//Java code
package CreatingDSLs;

public class PizzaShop {
  public void setSize(Size size) {}
  public void setCrust(Crust crust) {}
  public void setTopping(String... topping) {}
  public void setAddress(String address) {}
  public int setCard(CardType cardType, String cardNumber) { return 25; }
}
