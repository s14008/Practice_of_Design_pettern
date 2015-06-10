package jp.ac.it_college.std.s14008.pdp;

/**
 * Created by nao on 15/06/10.
 */
public abstract class Factory {
 public static Factory getFactory(String classname) {
  Factory factory = null;
     try {
      factory = (Factory)Class.forName(classname).newInstance();
     } catch (ClassNotFoundException e) {
      System.out.println("classs" + classname + "notfuncd");
     } catch (Exception e) {
      e.printStackTrace();
     }
  return factory;
 }
 public abstract Link createLink(String captionk, String url);
 public abstract Tray creatTray(String caption);
 public abstract Page createPage(String title, String author);
}
