/*
 * Первое домашнее задание в рамках курса Geekbrains Geek University Java. Уровень 1
 * Исходник задания: https://gb.ru/lessons/167082/homework
 *
 */
package ru.geekbrains.lesson1;

public class HomeWorkApp {

  public static void main(String[] args) {
    printThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();
  }

  private static void printThreeWords() {
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");
  }

  private static void checkSumSign() {
    int a = 10;
    int b = -100;

    if (a + b >= 0) {
      System.out.println("Сумма положительная");
    } else {
      System.out.println("Сумма отрицательная");
    }
  }

  private static void printColor() {
    int value = 101;

    if (value <= 0) {
      System.out.println("Красный");
    } else if (value > 0 && value <= 100) {
      System.out.println("Желтый");
    } else {
      System.out.println("Зеленый");
    }
  }

  private static void compareNumbers() {
    int a = 100;
    int b = 10;

    if (a >= b) {
      System.out.println("a >= b");
    } else {
      System.out.println("a < b");
    }
  }

}
