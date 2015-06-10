import jp.ac.it_college.std.s14008.pdp.framework.Product;

/**
 * Created by nao on 15/06/04.
 */
public class UnderlinePen implements Product {
 private char ulcahr;
 public UnderlinePen(char ulcahr) {
  this.ulcahr = ulcahr;
 }
 public void use(String s) {
  int length = s.getBytes().length;
  System.out.println("|" + s + "|");
  System.out.println(" ");
  for (int i = 0; i < length; i++) {
   System.out.println(ulcahr);
  }
  System.out.println("");
 }
 public Product createClone() {
  Product p = null;
  try {
   p = (Product)clone();
 } catch (CloneNotSupportedException e) {
   e.printStackTrace();
  }
  return p;
 }
}
