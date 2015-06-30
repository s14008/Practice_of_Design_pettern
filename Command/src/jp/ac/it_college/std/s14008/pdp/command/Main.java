package jp.ac.it_college.std.s14008.pdp.command;

import sun.plugin2.ipc.windows.WindowsEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by nao on 15/06/18.
 */
public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener{
 private  MacroCommand history = new MacroCommand();
 private DrawCanvas canvas = new DrawCanvas(400, 400, history);
 private JButton clearButton = new JButton("clear");

 public Main(String title) {
  super(title);

  this.addWindowListener(this);
  canvas.addMouseListener(this);
  clearButton.addActionListener(this);

  Box buttonBox = new Box(BoxLayout.X_AXIS);
  buttonBox.add(clearButton);
  Box mainBox = new Box(BoxLayout.Y_AXIS);
  mainBox.add(buttonBox);
  mainBox.add(canvas);
  getContentPane().add(mainBox);

  pack();
  show();
 }

 public void actionPerformed(ActionEvent e) {
  if (e.getSource() == clearButton) {
   history.clear();
   canvas.repaint();
  }
 }

 public void mouseDragged(MouseEvent e) {
  Command cmd = new DrawCommand(canvas, e.getPoint());
  history.appned(cmd);
  cmd.execute();
 }

 @Override
 public void mouseMoved(MouseEvent e) {}
 @Override
 public void windowOpened(WindowEvent e) {}

 @Override
 public void windowClosing(WindowEvent e) {
  System.exit(0);
 }

 @Override
 public void windowClosed(WindowEvent e) {}

 @Override
 public void windowIconified(WindowEvent e) {}

 @Override
 public void windowDeiconified(WindowEvent e) {}

 @Override
 public void windowActivated(WindowEvent e) {}

 public static void main(String[] args) {
  new Main("Command Pattern Smple");
 }
 }