/**
 * Created by nao on 15/06/16.
 */
public class OddSupport extends Support{
 public OddSupport(String name) {
  super(name);
 }

 @Override
 protected boolean resolve(Trouble trouble) {
  if (trouble.getNumber() % 2 == 1) {
   return true;
  } else {
   return false;
  }
 }
}
