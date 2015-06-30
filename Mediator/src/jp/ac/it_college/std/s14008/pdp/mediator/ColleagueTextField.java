package jp.ac.it_college.std.s14008.pdp.mediator;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * Created by nao on 15/06/16.
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague {
 private Mediator mediator;
 public ColleagueTextField(String text, int colimns) {
  super(text, colimns);
 }
 @Override
 public void setMediator(Mediator mediator) {
  this.mediator = mediator;
 }

 @Override
 public void setColleagueEnabled(boolean enabled) {
  setEnabled(enabled);
  setBackground(enabled ? Color.white : Color.lightGray);
 }

 @Override
 public void textValueChanged(TextEvent e) {
  mediator.colleagueChanged();
 }
}
