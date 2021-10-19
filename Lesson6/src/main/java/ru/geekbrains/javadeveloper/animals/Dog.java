package ru.geekbrains.javadeveloper.animals;

public class Dog extends Animal {

  private static int dogCount;
  public static final int RUN_LIMIT = 500;
  public static final int SWIM_LIMIT = 10;

  public Dog(String name, int appetite) {
    super(name, appetite);
    dogCount++;
  }

  public static int getAnimalCount() {
    return dogCount;
  }

  @Override
  public void run(int distance) {
    if (distance > RUN_LIMIT) {
      System.out.println("Собака по кличке " + this.getName() + " пробежала " + RUN_LIMIT
          + " метров и села, высунув язык");
    } else {
      System.out.println(
          "Собака по кличке " + this.getName() + " пробежала " + distance + " метров");
    }
  }

  @Override
  public void swim(int distance) {
    if (distance > SWIM_LIMIT) {
      System.out.println(
          "Собака по кличке " + this.getName() + " проплыла " + SWIM_LIMIT + " метров и утонула");
    } else {
      System.out.println(
          "Собака по кличке " + this.getName() + " проплыла " + distance + " метров");
    }
  }

}
