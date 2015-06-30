package jp.ac.it_college.std.s14008.pdp.flyweight.Big;

/**
 * Created by nao on 15/06/17.
 */
public class BigString {
 private BigChar[] bigChars;

 public BigString(String string) {
  bigChars = new BigChar[string.length()];
  BigCharFactory factory = BigCharFactory.getInstance().getInstance();
  for (int i = 0; i < bigChars.length; i++) {
   bigChars[i] = factory.getBigChar(string.charAt(i));
  }
 }

 public void print() {
  for (int i = 0; i < bigChars.length; i++) {
   bigChars[i].print();
   }
  }
 }
