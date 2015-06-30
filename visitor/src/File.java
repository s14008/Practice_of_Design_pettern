import sun.reflect.generics.visitor.Visitor;

/**
 * Created by nao on 15/06/11.
 */
public class File extends Entry {
 private String name;
 public File(String name, int size) {
  this.name = name;
  this.size = size;
 }

 @Override
 public String getName() {
  return name;
 }

 @Override
 public int getSize() {
  return size;
 }

 @Override
 public void accept(Visitor v) {
     v.visit(this);
 }
}
