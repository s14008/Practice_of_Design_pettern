package jp.ac.it_college.std.s14008.pdp.state;

import javax.naming.Context;

/**
 * Created by nao on 15/06/17.
 */
public class NightState implements State{
 private static NightState singleton = new NightState();
 private NightState() {
 }
 public static State getInstance() {
  return singleton;
 }

 @Override
 public void doClock(Context context, int hour) {
  if (9 <= hour && hour < 17) {
   context.changeState(DayState.getInstance());
  }
 }
 @Override
 public void doUse(Context context) {
   context.callSecurityCenter("KINKO!!");
 }

 @Override
 public void doAlarm(Context context) {
   context.callSecurityCenter("BELL!!");
 }

 @Override
 public void doPhone(Context context) {
  context.recordLog("CALL!!");
 }
 public String toString() {
  return "YAKAN";
 }
}
