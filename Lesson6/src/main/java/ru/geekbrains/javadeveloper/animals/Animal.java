package ru.geekbrains.javadeveloper.animals;

import ru.geekbrains.javadeveloper.equipment.Plate;

public abstract class Animal {

  private static int animalCount;
  private String name;
  private int appetite;
  private boolean satiety = false;

  public Animal(String name, int appetite) {
    this.name = name;
    this.appetite = appetite;
    animalCount++;
  }

  public int getAppetite() {
    return appetite;
  }

  public static int getAnimalCount() {
    return animalCount;
  }

  public String getName() {
    return this.name;
  }

  public abstract void run(int distance);

  public abstract void swim(int distance);

  public void eat(Plate plate) {
    if (this.satiety) {
      return; // Сытая кошка больше не есть
    }
    if (plate.decreaseFood(this.appetite)) {
      this.satiety = true;
    }
  }

  public static Animal[] findHungry(Animal[] animals) {
    // Подсчет количества голодных животных
    int hungryAnimalsCount = 0;
    for (int i = 0; i < animals.length; i++) {
      if (!animals[i].satiety) {
        hungryAnimalsCount++;
      }
    }

    // Инициализация и заполнение массива голодных животных
    Animal[] hungryAnimals = new Animal[hungryAnimalsCount];
    int j = 0;
    for (int i = 0; i < animals.length; i++) {
      if (!animals[i].satiety) {
        hungryAnimals[j] = animals[i];
        j++;
      }
    }
    return hungryAnimals;
  }

  public void info() {
    if (this.satiety) {
      System.out.println("Животное по кличке " + this.name + " сыто");
    } else {
      System.out.println("Животное по кличке " + this.name + " голодно");
    }
  }
}