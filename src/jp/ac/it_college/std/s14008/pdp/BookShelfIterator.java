package jp.ac.it_college.std.s14008.pdp;

/**
 * Created by nao on 15/06/02.
 */
public class BookShelfIterator implements Iterator{
 private BookShelf bookShelf;
 private int index;
 public BookShelfIterator(BookShelf bookShelf) {
  this.bookShelf = bookShelf;
  this.index = 0;
 }
 public boolean hasNext() {
  if (index < bookShelf.getLength()) {
   return true;
  } else {
   return false;
  }
 }
 public Object next() {
  Book book = bookShelf.getBookAt(index);
  index++;
  return book;
 }
}
