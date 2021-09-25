/*
 * Третье домашнее задание в рамках курса Geekbrains Geek University Java.Уровень 1
 * Исходник задания: https://gb.ru/lessons/167084/homework
 *
 */

package ru.geekbrains.lesson3;

public class HomeWorkApp {

  public static void main(String[] args) {

    // Первое задание
    System.out.println("*** Первое задание ***");

    int array1[] = {0, 1, 1, 0, 1, 0, 0, 0, 1, 1};
    System.out.print("Исходный массив:");
    for (int i = 0; i < array1.length; i++) {
      System.out.print(array1[i] + " ");
      if (array1[i] == 0) {
        array1[i] = 1;
      } else {
        array1[i] = 0;
      }
    }
    System.out.println();
    System.out.print("Преобразованный массив:");
    for (int i = 0; i < array1.length; i++) {
      System.out.print(array1[i] + " ");
    }

    // Второе задание
    System.out.println();
    System.out.println("*** Второе задание ***");

    int array2[] = new int[100];
    for (int i = 0; i < array2.length; i++) {
      array2[i] = i + 1;
    }
    System.out.print("Вывод массива:");
    for (int i = 0; i < array2.length; i++) {
      System.out.print(array2[i] + " ");
    }

    // Третье задание
    System.out.println();
    System.out.println("*** Третье задание ***");

    System.out.print("Исходный массив:");
    int array3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < array3.length; i++) {
      System.out.print(array3[i] + " ");
      if (array3[i] < 6) {
        array3[i] = array3[i] * 2;
      }
    }
    System.out.println();
    System.out.print("Преобразованный массив:");
    for (int i = 0; i < array3.length; i++) {
      System.out.print(array3[i] + " ");
    }

    // Четвертое задание
    System.out.println();
    System.out.println("*** Четвертое задание ***");

    int array4[][] = new int[5][5];
    for (int i = 0; i < array4.length; i++) {
      for (int j = 0; j < array4[i].length; j++) {
        if ((i == j) || (i == (array4[i].length - j - 1))) {
          array4[i][j] = 1;
        }
      }
    }
    for (int i = 0; i < array4.length; i++) {
      for (int j = 0; j < array4[i].length; j++) {
        System.out.print(array4[i][j] + " ");
      }
      System.out.println();
    }

    // Пятое задание
    System.out.println();
    System.out.println("*** Пятое задание ***");

    int[] array5 = initialArray(14, -1);
    for (int i = 0; i < array5.length; i++) {
      System.out.print(array5[i] + " ");
    }

    // Шестое задание (*)
    System.out.println();
    System.out.println("*** Шестое задание (*) ***");

    int[] array6 = {1, 2, -4, 100, 10, 55};
    int min = array6[0];
    int max = array6[0];
    // Начнем с i = 1, т.к. инициализировали 0 элементом,
    // и сравнивать его с самим с собой не нужно.
    for (int i = 1; i < array6.length; i++) {
      if (array6[i] < min) {
        min = array6[i];
      }
      if (array6[i] > max) {
        max = array6[i];
      }
    }
    System.out.println("Минимальный элемент = " + min + ", максимальный элемент = " + max);

    // Седьмое задание (*)
    System.out.println();
    System.out.println("*** Седьмое задание (*) ***");

    System.out.println(checkBalance(1, 2, 3, 4, 5));
    System.out.println(checkBalance(2, 2, 2, 1, 2, 2, 10, 1));
    System.out.println(checkBalance(1, 1, 1, 2, 1));
  }

  public static int[] initialArray(int len, int initialValue) {
    int[] array = new int[len];
    for (int i = 0; i < len; i++) {
      array[i] = initialValue;
    }
    return array;
  }

  public static boolean checkBalance(int... checkedArray) {
    int sumLeft = checkedArray[0];
    int sumRight = 0;

    for (int shift = 1; shift < checkedArray.length - 1; shift++) {
      sumLeft = checkedArray[0];
      sumRight = 0;
      for (int i = 1; i < shift; i++) {
        sumLeft += checkedArray[i];
      }
      for (int i = shift; i < checkedArray.length; i++) {
        sumRight += checkedArray[i];
      }
      if (sumLeft == sumRight) {
        break;
      }
    }
    return (sumLeft == sumRight);
  }

}