import com.sun.org.apache.bcel.internal.generic.IREM;
import sun.reflect.generics.visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by nao on 15/06/11.
 */
public class Directory extends Entry {
   private String name;
   private ArrayList dir = new ArrayList();
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
  Iterator it = dir.iterator();
  while (it.hasNext)
 }

 @Override
 public void accept(Visitor v) {

 }
}
