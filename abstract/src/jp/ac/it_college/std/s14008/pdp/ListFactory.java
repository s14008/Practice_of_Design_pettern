package jp.ac.it_college.std.s14008.pdp;

/**
 * Created by nao on 15/06/10.
 */
public class ListFactory extends Factory {
 @Override
 public Link createLink(String captionk, String url) {
  return new ListLink(caption, url);
 }

 @Override
 public Tray creatTray(String caption) {
  return new ListTray(caption);
 }

 @Override
 public Page createPage(String title, String author) {
  return new LIstPage(title, author);
 }
}
