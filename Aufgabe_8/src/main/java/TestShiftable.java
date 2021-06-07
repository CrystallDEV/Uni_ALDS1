import base.Shiftable;
import base.ShiftableList;
import exceptions.EmptyListException;

/**
 * Created by CrystallDEV on 07/06/2021
 */
public class TestShiftable {

  public static void main(String[] args) {
    Shiftable shiftable = new ShiftableList();
    shiftable.push(3);
    shiftable.push(4);
    shiftable.push(5);
    shiftable.push(6);
    shiftable.shift(2);
    shiftable.push(7);
    System.out.println(shiftable.pop());
    System.out.println(shiftable.pop());
    System.out.println(shiftable.pop());
    System.out.println(shiftable.pop());
    System.out.println(shiftable.pop());
    try {
      System.out.println(shiftable.pop());
    } catch (EmptyListException exception) {
      System.out.println("Exception wird geworfen!");
    }
  }

}
