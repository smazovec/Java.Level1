package ru.geekbrains.javadeveloper.equipment;

public class Plate {

  public static final int DEFAULT_FOOD_LIMIT = 100;

  private int foodLimit; // Вместимость тарелки
  private int food; // Текущий вес еды в тарелке
  // TODO: возможно тут нужен отдельный класс, или переименовать переменную

  public Plate(int foodLimit, int food) {
    this.foodLimit = foodLimit;
    if (food <= foodLimit) {
      this.food = food;
    } else {
      this.food = foodLimit;
    }
  }

  public Plate(int food) {
    this(DEFAULT_FOOD_LIMIT, food);
  }

  public Plate() {
    this(DEFAULT_FOOD_LIMIT, DEFAULT_FOOD_LIMIT);
  }

  /**
   * Убавление  <tt>weight</tt> еды из тарелки. Выполняется запрос на убавление еды
   * из траелки, т.к. съесть еды больше чем имеется в тарелке нельзя.
   * Возврашает <tt>true</tt> если запрос удовлетворен.
   */
  public boolean decreaseFood(int weight) {
    if (weight <= this.food) {
      this.food -= weight;
      return true;
    }
    return false;
  }

  /**
   * Добавление <tt>weight</tt> еды в тарелку. Добавить в траелку еды можно не больше чем
   * помещется в тарелку (<tt>foodLimit</tt>).
   */
  public void increaseFood(int weight) {
    if (this.food + weight <= this.foodLimit) {
      this.food += weight;
    } else {
      this.food = foodLimit; // Тарелку нельзя наполнить больше чем ее вместимость
    }
  }

  /**
   * Вывод информация об остатки еды тарелке.
   */
  public void info() {
    System.out.println("В тарелке осталось: " + this.food + " еды");
  }
}


