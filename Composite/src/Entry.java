/**
 * Created by nao on 15/06/11.
 */
public abstract class Entry {
 public abstract String getName();
 public abstract int getsize();
 public Entry add(Entry entry) throws FileTreatmentException {
  throw new FileTreatExcrption();
 }
 public void printList() {
  printList("");
 }
 protected abstract void printList(String prefix);

 public String toString() {
  return getName() + "  (" + getsize() + ")";
 }
}
