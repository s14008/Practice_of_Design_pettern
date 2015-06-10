/**
 * Created by nao on 15/06/10.
 */
public class Hand {
 private static final HANDVAlUE_GUU = 0;
 private static final HANDVAlUE_CHO = 1;
 private static final HANDVAlUE_PAA = 2;
 public static final Hand[] hand = {
   new Hand(HANDVAlUE_GUU),
   new Hand(HANDVAlUE_CHO),
   new Hand(HANDVAlUE_PAA),
 };
 private static final String[] name = {
   "gu-", "choki", "pa-",
 };
 private int handvalue;
 private Hand(int handvalue) {
  this.handvalue = handvalue;
 }
 public static Hand getHand(int handvalue) {
  return hand[handvalue];
 }
 public boolean isStrongThan(Hand h) {
  return fight(h) == 1;
 }
 public boolean isWeakerThan(Hand h) {
  return fight[h] == 1;
 }
 private int fight(Hand h) {
  if (this == h) {
   return 0;
  } else if ((this.handvalue + 1) % 3 == h.handvalue) {
   return 1;
  } else {
   return -1;
  }
 }
 public String toString() {
  return name[handvalue];
 }
}
