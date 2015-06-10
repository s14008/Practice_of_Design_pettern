/**
 * Created by nao on 15/06/04.
 */
public class IDCard extends Product {
 private String owner;
 IDCard(String owner) {
  System.out.println(owner + "new card");
  this.owner = owner;
 }
 @Override
 public void use() {
  System.out.println(owner + "employ card");
 }
 public String getOwner() {
  return owner;
 }
}
