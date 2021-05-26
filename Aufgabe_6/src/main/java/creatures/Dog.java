package creatures;

/**
 * Created by CrystallDEV on 26/05/2021
 */
public class Dog extends Creature {

  public Dog(String name, double x, double y, int age) {
    super(name, x, y, age, CreatureType.DOG);
  }

  @Override
  public void simulate() {
    int age = getAge();
    setAge(age + 1);
    setX(getX() + 2);
    if (age % 12 == 0) {
      System.out.println("Woof!");
    }
  }

}
