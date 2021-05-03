package dev.crystall.b;

/**
 * Created by CrystallDEV on 03/05/2021
 */
public class B {

  // Bis Ende des Programms oder neuzuweisung verfügbar.
  private static B r = null;
  // Bis Ende des Programms verfügbar.
  private static final String ERROR_MSG = " Error !";

  public static void m1() {
    // Bis Ende der Funktion verfügbar.
    B example = new B();
    if (r == null) {
      // Neuzuweisung der statischen Variable r.
      r = new B();
    }
  }

  public static void main(String[] args) {
    m1();
    if (r == null) {
      // Es wird keine Error msg ausgegeben, da die Variable in Zweile 18 vergeben wird.
      System.out.println(ERROR_MSG);
    }
  }

}
