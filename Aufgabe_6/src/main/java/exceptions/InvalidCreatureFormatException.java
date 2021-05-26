package exceptions;

/**
 * Created by CrystallDEV on 26/05/2021
 */
public class InvalidCreatureFormatException extends Exception {

  public InvalidCreatureFormatException(String errorMessage) {
    super(errorMessage);
  }
}
