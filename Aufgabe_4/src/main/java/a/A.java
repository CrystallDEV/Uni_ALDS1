package a;

import java.util.Scanner;

/**
 * Created by CrystallDEV on 03/05/2021
 */
public class A {

  // Globale variable. Wird bei Programmstart bzw. beim laden der Klasse initialisiert. Verweist für alle Instanzen dieser Klasse auf den selben Wert.
  // Ist trotz static deklaration nur innerhalb der Klasse A nutzbar, da diese als private deklariert ist
  // Wird erst bei Programmende vom OS aufgeräumt.
  private static int r;

  public static int m1(int y) {
    // Wird beim initialen aufruf der Funktion gesetzt. Ist so lange gültig bis alle Zeilen der Funktion durchgelaufen sind. Kann nur innerhalb der Funktion m1 genutzt werden.
    int r = 1;
    int x = 0;
    // Y ist nur innerhalb der for loop gültig und ist auch nur innerhalb dieser sichtbar.
    for (int i = 1; i < y; ++i) {
      // Z ist nur innerhalb der for loop gültig und ist auch nur innerhalb dieser sichtbar.
      int z = x + r;
      x = r;
      r = z;
    }
    return r;
  }

  public static void main(String[] args) {
    // Nur innerhalb der Main funktion gültig und nutzbar. Könnte in die m1 Funktion als Funktionsparameter weitergegeben und dann dort genutzt werden.
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print(" Geben Sie n ein : ");
    n = sc.nextInt();
    r = m1(n);
    System.out.println(r);
    r = m1(20);
    System.out.println(r);
  }
}
