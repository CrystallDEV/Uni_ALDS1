package creatures;

/**
 * Created by CrystallDEV on 26/05/2021
 */
public class Bird extends Creature {

  public Bird(String name, double x, double y, int age) {
    super(name, x, y, age, CreatureType.BIRD);
  }

  @Override
  public void simulate() {
    setAge(getAge() + 1);
    setX(getAge() + 1);
    setY(getY() + 7);
  }
}
