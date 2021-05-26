import creatures.Bird;
import creatures.Creature;
import creatures.CreatureType;
import creatures.Dog;
import creatures.Human;
import exceptions.InvalidCreatureFormatException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestCreature {

  public static void simulateCreatures(Creature[] creatures, int numSteps) {
    for (int i = 0; i < numSteps; ++i) {
      for (Creature creature : creatures) {
        creature.simulate();
      }
    }
  }

  public static Creature[] loadCreatures(String filename) throws InvalidCreatureFormatException {
    try {
      // In case we wanna use the input.txt resource packed in the jar file
      // File file = new File(Thread.currentThread().getContextClassLoader().getResource(filename).getPath());
      Scanner s = new Scanner(new BufferedReader(new FileReader(filename)));
      int numberOfCreaturesInFile = Integer.parseInt(s.nextLine());
      Creature[] creatures = new Creature[numberOfCreaturesInFile];
      for (int i = 0; i < numberOfCreaturesInFile; i++) {
        String[] values = s.nextLine().split(" ");
        CreatureType creatureType = CreatureType.values()[Integer.parseInt(values[0])];

        int age = Integer.parseInt(values[1]);
        double x = Double.parseDouble(values[2]);
        double y = Double.parseDouble(values[3]);
        String name = values[4];

        switch (creatureType) {
          case HUMAN:
            creatures[i] = new Human(name, x, y, age);
            break;
          case DOG:
            creatures[i] = new Dog(name, x, y, age);
            break;
          case BIRD:
            creatures[i] = new Bird(name, x, y, age);
            break;
        }
      }
      return creatures;
    } catch (FileNotFoundException e) {
      throw new InvalidCreatureFormatException("Unable to read creatures from file");
    }
  }

  public static void saveCreatures(Creature[] creatures, String filename) {
    try {
      BufferedWriter s = new BufferedWriter(new FileWriter(filename));
      s.write(String.valueOf(creatures.length));
      s.newLine();
      for (Creature creature : creatures) {
        s.write(creature.toString());
        s.newLine();
      }
      s.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.println("Usage: java TestCreature inputFile outputFile numSimulationSteps");
      return;
    }
    String inputFile = args[0];
    String outputFile = args[1];
    int numSimulationSteps = Integer.parseInt(args[2]);
    Creature[] creatures;

    try {
      creatures = loadCreatures(inputFile);
      System.out.println("File loaded!");
      simulateCreatures(creatures, numSimulationSteps);
      saveCreatures(creatures, outputFile);
      System.out.println("File saved!");
    } catch (InvalidCreatureFormatException e) {
      e.printStackTrace();
    }
  }

}
