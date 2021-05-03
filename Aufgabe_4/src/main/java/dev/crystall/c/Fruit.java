package dev.crystall.c;

import java.util.Objects;

/**
 * Created by CrystallDEV on 03/05/2021
 */
public class Fruit {

  private final String color;
  private final float weight;

  public Fruit(String color, float weight) {
    this.color = color;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return new StringBuilder("dev.crystall.c.Fruit with color=").append(color).append(" and weight=").append(weight).toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Fruit fruit = (Fruit) o;

    if (Float.compare(fruit.weight, weight) != 0) {
      return false;
    }
    return Objects.equals(color, fruit.color);
  }

  @Override
  public int hashCode() {
    int result = color != null ? color.hashCode() : 0;
    result = 31 * result + (weight != +0.0f ? Float.floatToIntBits(weight) : 0);
    return result;
  }
}
