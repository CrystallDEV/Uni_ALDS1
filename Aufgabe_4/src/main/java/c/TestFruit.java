package c;

/**
 * Created by CrystallDEV on 03/05/2021
 */
public class TestFruit {

  public static void main(String[] args) {
    Fruit fruit1 = new Apple("green", 200.0f);
    Fruit fruit2 = new Apple("green", 200.0f);
    Fruit fruit3 = new Apple("red", 150.0f);
    System.out.println(fruit1); // soll "c.Fruit with color=green and weight=200.0" ausgeben
    System.out.println(fruit1.equals(null)); // soll "false" ausgeben
    System.out.println(fruit1.equals(fruit2)); // soll "true" ausgeben
    System.out.println(fruit1.equals(fruit3)); // soll "false" ausgeben
  }

}