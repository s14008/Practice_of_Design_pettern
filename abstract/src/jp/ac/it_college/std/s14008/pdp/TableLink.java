package jp.ac.it_college.std.s14008.pdp;

/**
 * Created by nao on 15/06/10.
 */
public class TableLink extends Link {
 public TableLink(String caption, String url) {
  super(caption, url);
 }

 public String makeHTML() {
  return "<td><a href=\"" + url + "\">" + caption + "</s><td>\n";
 }
}
