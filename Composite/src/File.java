/**
 * Created by nao on 15/06/11.
 */
public class File extends Entry {
 private String name;
 private int size;

 public File(String name, int size) {
  this.name = name;
  this.size = size;

 }
 @Override
 public String getName() {
  return name;
 }

 @Override
 public int getsize() {
  return size;
 }

 @Override
 protected void printList(String prefix) {
   System.out.println(prefix + "/" + this);
 }
}
