import sun.reflect.generics.visitor.Visitor;

/**
 * Created by nao on 15/06/11.
 */
public interface Element {
 public abstract void accept(Visitor v);
}
