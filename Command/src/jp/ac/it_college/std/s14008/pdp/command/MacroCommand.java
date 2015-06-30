package jp.ac.it_college.std.s14008.pdp.command;

import javax.activation.CommandObject;
import java.util.Iterator;
import java.util.Stack;

/**
 * Created by nao on 15/06/18.
 */
public class MacroCommand implements Command {
 private Stack command = new Stack();

 public void execute() {
  Iterator it = commands.iterator();
  while (it.hasNext()) {
   ((Command) it.next()).execute();
  }

 public void appned(Command cmd) {
  if (cmd != this) {
   commands.push(cmd);
  }
 }

 public void undo() {
  if (!commands.empty()) {
   commands.pop();
  }
 }

 public void clear() {
  commands.clear();
 }
}
