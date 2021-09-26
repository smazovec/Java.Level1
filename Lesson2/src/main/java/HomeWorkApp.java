public class HomeWorkApp {

  public static void main(String[] args) {
    // Первое задание
    System.out.println("Сумма a + b между 10 и 20 = " + isWithin(4, 6));

    // Второе задание
    System.out.println();
    isPositive(-6);

    // Третье задание
    System.out.println();
    System.out.println("Число отрицательное = " + isNegative(-222));

    // Четвертое задание
    System.out.println();
    repeatStrCount("Строка для повторения", 14);

    // Пятое* задание
    System.out.println();
    showIsLeapYear(1);
    showIsLeapYear(4);
    showIsLeapYear(100);
    showIsLeapYear(300);
    showIsLeapYear(400);
    showIsLeapYear(1400);
    showIsLeapYear(1600);
    showIsLeapYear(2020);
    showIsLeapYear(2021);
  }

  public static boolean isWithin(int a, int b) {
    int checkedSum = a + b;
    return (checkedSum >= 10) && (checkedSum <= 20);
  }

  public static void isPositive(int number) {
    if (number < 0) {
      System.out.println("Число " + number + " отрицательное");
    } else {
      System.out.println("Число " + number + " положительное");
    }
  }

  public static boolean isNegative(int number) {
    return number < 0;
  }

  public static void repeatStrCount(String str, int count) {
    for (int i = 1; i <= count; i++) {
      System.out.println(i + ": " + str);
    }
  }

  public static boolean isLeapYear(int Year) {
    return (Year % 400) == 0 || (Year % 100 != 0) && (Year % 4 == 0);
  }

  public static void showIsLeapYear(int checkedYear) {
    if (isLeapYear(checkedYear)) {
      System.out.println(checkedYear + " является високосным");
    } else {
      System.out.println(checkedYear + " является не високосным");
    }
  }

}
