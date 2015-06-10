/**
 * Created by nao on 15/06/10.
 */
public interface Strategy {
 public abstract Hand nextHand();
 public abstract void study(boolean win);
}
