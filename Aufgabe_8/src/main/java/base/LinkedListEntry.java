package base;

/**
 * Created by CrystallDEV on 07/06/2021
 */
public class LinkedListEntry {

  private int entry;
  private LinkedListEntry next;

  public LinkedListEntry(int entry, LinkedListEntry next) {
    this.entry = entry;
    this.next = next;
  }

  public LinkedListEntry(int entry) {
    this.entry = entry;
  }

  public boolean hasNext() {
    return next != null;
  }

  public int getEntry() {
    return entry;
  }

  public void setEntry(int entry) {
    this.entry = entry;
  }

  public LinkedListEntry getNext() {
    return next;
  }

  public void setNext(LinkedListEntry next) {
    this.next = next;
  }

}
