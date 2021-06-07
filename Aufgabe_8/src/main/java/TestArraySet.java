import base.ArraySet;

/**
 * Created by CrystallDEV on 07/06/2021
 */
public class TestArraySet {

  public static void main(String[] args) {
    ArraySet set = new ArraySet();
    for (int i = 0; i < 10; ++i) {
      set.add(i);
    }
    for (int i = 0; i < 15; ++i) {
      set.add(i);
    }
    for (int i = 0; i < 10; ++i) {
      set.remove(i);
    }
    System.out.println(set.contains(5)); // false
    System.out.println(set.contains(12)); // true
    System.out.println(set.contains(2)); // false
    System.out.println(set.isEmpty()); // false
    for (int i = 10; i < 15; ++i) {
      set.remove(i);
    }
    System.out.println(set.isEmpty()); // true
    System.out.println(set.contains(12)); // false
  }

}
