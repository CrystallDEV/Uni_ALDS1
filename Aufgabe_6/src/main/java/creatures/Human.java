package creatures;

/**
 * Created by CrystallDEV on 26/05/2021
 */
public class Human extends Creature {

  public Human(String name, double x, double y, int age) {
    super(name, x, y, age, CreatureType.HUMAN);
  }

  @Override
  public void simulate() {
    setAge(getAge() + 1);
    setY(getY() + 5);
  }
}
