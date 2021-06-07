package base;

import exceptions.EmptyListException;

/**
 * Created by CrystallDEV on 07/06/2021
 */
public class ShiftableList implements Shiftable {

  private LinkedListEntry firstEntry;
  private LinkedListEntry lastEntry;

  @Override
  public void push(int x) {
    LinkedListEntry newEntry = new LinkedListEntry(x);
    if (firstEntry == null) {
      firstEntry = newEntry;
    }
    if (lastEntry == null) {
      lastEntry = newEntry;
    }

    if (!newEntry.equals(firstEntry)) {
      newEntry.setNext(firstEntry);
    }
    firstEntry = newEntry;
  }

  @Override
  public int pop() throws EmptyListException {
    if (firstEntry == null) {
      throw new EmptyListException("List is empty");
    }
    LinkedListEntry toReturn = firstEntry;
    firstEntry = toReturn.getNext();
    return toReturn.getEntry();
  }

  @Override
  public void shift(int n) {
    LinkedListEntry toShift = firstEntry;
    firstEntry = toShift.getNext();

    LinkedListEntry currentEntry = toShift.getNext();
    for (int i = 1; i < n; i++) {
      if (currentEntry.equals(lastEntry)) {
        lastEntry.setNext(toShift); // update the next entry for the last entry
        toShift.setNext(null);
        lastEntry = toShift; // lastEntry is now the shifted object
        return;
      }
      currentEntry = currentEntry.getNext();
    }

    // insert the integer that we shifted into the middle of the existing entries
    LinkedListEntry temp = currentEntry.getNext();
    currentEntry.setNext(toShift);
    toShift.setNext(temp);
  }

}
