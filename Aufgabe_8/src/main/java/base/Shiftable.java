package base;

import exceptions.EmptyListException;

/**
 * Created by CrystallDEV on 07/06/2021
 */
public interface Shiftable {

  void push(int x);

  int pop() throws EmptyListException;

  void shift(int n);

}