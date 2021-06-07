package base;

/**
 * Code is sometimes duplicated to prevent the program going twice through the values array
 * Created by CrystallDEV on 07/06/2021
 */
public class ArraySet {

  Integer[] values = new Integer[4];


  public void add(int value) {
    if (contains(value)) {
      return;
    }

    if (isFull()) {
      extend();
    }

    values[getFirstEmptyIndex()] = value;
  }

  public void remove(int value) {
    for (int i = 0; i < values.length - 1; i++) {
      if (values[i] != null && values[i] == value) {
        values[i] = null;
      }
    }
  }

  public boolean contains(int value) {
    for (int i = 0; i < values.length - 1; i++) {
      if (values[i] != null && values[i] == value) {
        return true;
      }
    }
    return false;
  }

  public boolean isEmpty() {
    for (int i = 0; i < values.length - 1; i++) {
      if (values[i] != null) {
        return false;
      }
    }
    return true;
  }

  public boolean isFull() {
    return getFirstEmptyIndex() == -1;
  }

  public int getFirstEmptyIndex() {
    for (int i = 0; i < values.length - 1; i++) {
      if (values[i] == null) {
        return i;
      }
    }
    return -1;
  }

  private void extend() {
    Integer[] newValues = new Integer[values.length + 1];

    // if its allowed to be used
    //    if (values.length - 1 >= 0) {
    //      System.arraycopy(values, 0, newValues, 0, values.length - 1);
    //    }

    for (int i = 0; i < values.length - 1; i++) {
      newValues[i] = values[i];
    }
    values = newValues;
  }


}
