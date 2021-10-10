package ru.geekbrains.javadeveloper.animals;

public class Cat extends Animal {

  private static int catCount;
  public static final int RUN_LIMIT = 200;

  public Cat(String name, int appetite) {
    super(name, appetite);
    catCount++;
  }

  public static int getAnimalCount() {
    return catCount;
  }

  @Override
  public void run(int distance) {
    if (distance > RUN_LIMIT) {
      System.out.println("Кот по кличке " + this.getName() + " пробежал " + RUN_LIMIT
          + " метров и упал без задних лап");
    } else {
      System.out.println("Кот по кличке " + this.getName() + " пробежал " + distance + " метров");
    }
  }

  @Override
  public void swim(int distance) {
    System.out.println("Кошки не плавают");
  }

}
