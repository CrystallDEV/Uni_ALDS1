package creatures;

/**
 * Created by CrystallDEV on 26/05/2021
 */
public abstract class Creature {

  private String name;
  private double x;
  private double y;
  private int age;
  private CreatureType creatureType;

  public Creature(String name, double x, double y, int age, CreatureType creatureType) {
    this.name = name;
    this.x = x;
    this.y = y;
    this.age = age;
    this.creatureType = creatureType;
  }

  public abstract void simulate();

  @Override
  public String toString() {
    return String.format("%s %s %s %s %s", getCreatureType().ordinal(), getAge(), getX(), getY(), getName());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public CreatureType getCreatureType() {
    return creatureType;
  }
}
