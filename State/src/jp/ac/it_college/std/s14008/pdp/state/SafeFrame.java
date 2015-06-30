package jp.ac.it_college.std.s14008.pdp.state;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.Button;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Created by nao on 15/06/17.
 */
public class SafeFrame extends Frame implements ActionListener, Context {
 private TextField textClock = new TextField(60);
 private TextArea textScreen = new TextArea(10, 60);
 private Button buttonUse = new Button("KINKO");
 private Button buttonAlame = new Button("CALL");
 private Button buttonPhone = new Button("BELL");
 private Button buttonExit = new Button("OWARI");

 private State state = DayState.getInstance();


 public SafeFrame(String title) {
  super(title);
  setBackground(Color.lightGray);
  setLayout(new BorderLayout());

  add(textClock, BorderLayout.NORTH);
  textClock.setEditable(false);

  add(textScreen, BorderLayout.CENTER);
  textScreen.setEditable(false);

  Panel panel = new Panel();
  panel.add(buttonUse);
  panel.add(buttonAlame);
  panel.add(buttonPhone);
  panel.add(buttonExit);

  add(panel, BorderLayout.SOUTH);

  pack();
  show();

  buttonUse.addActionListener(this);
  buttonAlame.addActionListener(this);
  buttonPhone.addActionListener(this);
  buttonExit.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e) {
  System.out.println(e.toString());
  if (e.getSource() == buttonUse) {
   state.doUse((javax.naming.Context) this);
  } else if (e.getSource() == buttonAlame) {
   state.doAlarm((javax.naming.Context) this);
  } else if (e.getSource() == buttonPhone) {
   state.doPhone((javax.naming.Context) this);
  } else if (e.getSource() == buttonExit) {
   System.exit(0);
  } else {
   System.out.println("?");
  }
 }

 @Override
 public void setClock(int hour) {
  String clockstring = "GENN,JIKOKU";
  if (hour < 10) {
   clockstring += "0" + hour + "00";
  } else {
   clockstring += hour + ":00";
  }
  System.out.println(clockstring);
  textClock.setText(clockstring);
  state.doClock((javax.naming.Context) this, hour);
 }

 public void changeState(State state) {
  System.out.println(this.state + "KARA" + state + "HE JYOUTAI HENNKA");
  this.state = state;
 }

 public void callSecurityCenter(String msg){
  textScreen.append("call!" + msg + "\n");
 }
 public void recordLog(String msg) {
  textScreen.append("recode ... " + msg + "\n");
 }
}