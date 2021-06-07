package exceptions;

/**
 * Created by CrystallDEV on 07/06/2021
 */
public class EmptyListException extends RuntimeException {

  public EmptyListException(String errorMessage) {
    super(errorMessage);
  }

}
