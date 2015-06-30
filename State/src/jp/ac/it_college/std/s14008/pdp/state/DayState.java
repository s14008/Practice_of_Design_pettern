package jp.ac.it_college.std.s14008.pdp.state;

import javax.naming.Context;

/**
 * Created by nao on 15/06/17.
 */
public class DayState implements State {
 private static DayState singleton = new DayState();
 private DayState() {
 }
 public static State getInstance() {
  return singleton;
 }
 @Override
 public void doClock(Context context, int hour) {
  if (hour < 9 || 17 <= hour) {
   context.changeState(NightState.getInstace());
  }
 }

 @Override
 public void doUse(Context context) {
  context.recordLog("KINKO");
 }

 @Override
 public void doAlarm(Context context) {
  context.callSecurityCenter("BELL");
 }

 @Override
 public void doPhone(Context context) {
  context.callSecurityCenter("CALL");
 }
 public String toString() {
  return "HIRU";
 }
}
