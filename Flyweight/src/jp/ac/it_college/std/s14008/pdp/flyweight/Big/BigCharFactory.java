package jp.ac.it_college.std.s14008.pdp.flyweight.Big;

import java.util.HashMap;

/**
 * Created by nao on 15/06/17.
 */
public class BigCharFactory {

 private HashMap pool = new HashMap();

 private static BigCharFactory singleton = new BigCharFactory();

 private BigCharFactory() {
 }

 public static BigCharFactory getInstance() {
  return singleton;
 }

 public synchronized BigChar getBigChar(char charname) {
  BigChar bc = (BigChar)pool.get("" + charname);
  if (bc == null) {
   bc = new BigChar(charname);
   pool.put("" + charname, bc);
  }
  return bc;
 }
}
