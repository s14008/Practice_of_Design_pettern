import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by nao on 15/06/11.
 */
public class Directory extends Entry {
 private String name;
 private ArrayList direcory = new ArrayList();
 public Directory(String name) {
  this.name = name;
 }

 @Override
 public String getName() {
  return name;
 }

 @Override
 public int getsize() {
  int size = 0;
  Iterator it = direcory.iterator();
  while (it.hasNext()) {
   Entry entry = (Entry)it.next();
   size += entry.getsize();
  }
  return size;
 }
 public Entry add(Entry entry) {
  direcory.add(entry);
  return this;
 }

 @Override
 protected void printList(String prefix) {
  System.out.println(prefix + "/" + this);
  Iterator it = direcory.iterator();
  while (it.hasNext()) {
   Entry entry = (Entry)it.next();
   entry.printList(prefix + "/" + name);
  }
 }
}
