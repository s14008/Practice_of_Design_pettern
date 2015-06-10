package jp.ac.it_college.std.s14008.pdp;

/**
 * Created by nao on 15/06/10.
 */
public class ListLink extends Link {
 public ListLink(String caption, String url) {
         super(caption, url);
 }
 public String makeHTML() {
  return "   <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
 }
}
