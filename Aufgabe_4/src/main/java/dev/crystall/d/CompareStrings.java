package dev.crystall.d;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by CrystallDEV on 03/05/2021
 */
public class CompareStrings {

  private static final String TRUE_MESSAGE = "wahr";
  private static final String FALSE_MESSAGE = "false";

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("ERROR! No number given as first runtime parameter!");
      System.exit(0);
      return;
    }

    int numberOfWords;
    try {
      numberOfWords = Integer.parseInt(args[0]);
    } catch (NumberFormatException e) {
      System.out.println("ERROR! Unable to parse number given as first parameter");
      System.exit(0);
      return;
    }

    List<String> words = new ArrayList<>();

    System.out.println("Geben sie die Wörter ein:");
    Scanner scanner = new Scanner(System.in);
    while (words.size() < numberOfWords) {
      String word = scanner.nextLine();
      if (word.isEmpty() || word.isBlank()) {
        continue;
      }
      words.add(word);
    }

    boolean isTrue = true;
    for (String s : words) {
      int amountOfSameWord = (int) words.stream().filter(s1 -> s1.equals(s)).count();
      if (amountOfSameWord != 2) {
        isTrue = false;
        break;
      }
    }

    System.out.println(isTrue ? TRUE_MESSAGE : FALSE_MESSAGE);
  }
}
