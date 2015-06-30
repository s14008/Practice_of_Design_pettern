import javax.xml.ws.EndpointReference;
import java.util.Iterator;

/**
 * Created by nao on 15/06/11.
 */
public abstract class Entry implements Element {
 public abstract String getName();
 public abstract int getsize();
 public Entry add(Entry entry) throws FileTreatmentException {
  throw new FileTreatmepiton();
 }
 public Iterator iterator() throw FielTreatExcepition();
  throw Iterator iterator() throw FileTreatException {
  throw new FileTreatException();
 }
public String toStoring() {
 return getName() + "(" +getsize() + ")";
}
}