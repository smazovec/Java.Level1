import java.util.Random;
import java.util.Scanner;

public class XAndOGame {

  private static char[][] map;
  private static final char X_DOT = 'X';
  private static final char O_DOT = 'O';
  private static final char EMPTY_DOT = '•';
  private static final int MAP_SIZE = 4;
  private static final int DOTS_TO_WIN = 3;
  private static int turnCount;
  private static final Scanner SC = new Scanner(System.in);
  private static final Random RND = new Random();

  public static void main(String[] args) {
    initNewGame();
    while (true) {
      turnCount++; // Счетчик ходов
      System.out.println();
      System.out.println(turnCount + " ход");

      humanTurn();
      printMap();
      if (checkWin(X_DOT)) {
        System.out.println("Победа человека над компьютером в " + turnCount + " хода");
        break;
      } else if (isMapFull()) {
        System.out.println("Ходы закончились. Ничья!}");
        break;
      }

      computerTurn();
      printMap();
      if (checkWin(O_DOT)) {
        System.out.println("Победа компьютера над человеком в " + turnCount + " хода");
        break;
      } else if (isMapFull()) {
        System.out.println("Ходы закончились. Ничья!}");
        break;
      }
    }
    System.out.println("*** Игра закончена! ***");
  }

  public static void initNewGame() {
    System.out.println("Новая игра крестики-нолики, человек против компьютера");
    System.out.println("Игровое поле " + MAP_SIZE + "x" + MAP_SIZE);
    map = new char[MAP_SIZE][MAP_SIZE];
    turnCount = 0;
    for (int i = 0; i < MAP_SIZE; i++) {
      for (int j = 0; j < MAP_SIZE; j++) {
        map[i][j] = EMPTY_DOT;
      }
    }
    printMap();
    System.out.println("Победа присуждается за " + DOTS_TO_WIN + " фишек в ряд или по диагонали");

  }

  public static void printMap() {
    for (int i = 0; i < MAP_SIZE; i++) {
      for (int j = 0; j < MAP_SIZE; j++) {
        System.out.print(map[i][j] + "  ");
      }
      System.out.println();
    }
  }

  public static void humanTurn() {
    int x, y;
    do {
      x = -1;
      y = -1;
      System.out.println("Введите координаты своего хода в формате  \"X Y\"");
      if (SC.hasNextInt()) {
        x = SC.nextInt() - 1;
      }
      if (SC.hasNextInt()) {
        y = SC.nextInt() - 1;
      }
      SC.nextLine();
    } while (!isCellValid(x, y));
    map[x][y] = X_DOT;
  }

  public static void computerTurn() {
    int x, y;
    do {
      x = RND.nextInt(MAP_SIZE);
      y = RND.nextInt(MAP_SIZE);
    } while (!isCellValid(x, y));
    System.out.println("Ход компьютера по координатам " + (x + 1) + " " + (y + 1));
    map[x][y] = O_DOT;
  }

  public static boolean checkWin(char dotType) {
    int horizontalWinDots;
    int verticalWinDots;
    int mainDiagonalWinDots;
    int incidentalDiagonalWinDots;
    for (int shift_x = 0; shift_x < 1 + (MAP_SIZE - DOTS_TO_WIN); shift_x++) {
      for (int shift_y = 0; shift_y < 1 + (MAP_SIZE - DOTS_TO_WIN); shift_y++) {
        horizontalWinDots = 0;
        verticalWinDots = 0;
        mainDiagonalWinDots = 0;
        incidentalDiagonalWinDots = 0;
        for (int x = shift_x; x < shift_x + DOTS_TO_WIN; x++) {
          for (int y = shift_y; y < shift_y + DOTS_TO_WIN; y++) {

            // Проверка горизонтали
            if (map[x][y] == dotType) {
              horizontalWinDots++;
            } else {
              horizontalWinDots = 0;
            }

            // Проверка вертикали
            if (map[y][x] == dotType) {
              verticalWinDots++;
            } else {
              verticalWinDots = 0;
            }

            // Проверка главной диагонали
            if (x - shift_x == y - shift_y) {
              if (map[x][y] == dotType) {
                mainDiagonalWinDots++;
              } else {
                mainDiagonalWinDots = 0;
              }
            }

            // Проверка побочной диагонали
            if (x - shift_x == DOTS_TO_WIN + shift_y - y - 1) {
              if (map[x][y] == dotType) {
                incidentalDiagonalWinDots++;
              } else {
                incidentalDiagonalWinDots = 0;
              }
            }
          }
          if (horizontalWinDots == DOTS_TO_WIN
              || verticalWinDots == DOTS_TO_WIN
              || mainDiagonalWinDots == DOTS_TO_WIN
              || incidentalDiagonalWinDots == DOTS_TO_WIN) {
            return true;
          }
        }
      }
    }
    return false;
  }

  public static boolean isCellValid(int x, int y) {
    return x > -1
        && y > -1
        && x <= (MAP_SIZE - 1)
        && y <= (MAP_SIZE - 1)
        && map[x][y] == EMPTY_DOT;
  }

  public static boolean isMapFull() {
    for (int i = 0; i < MAP_SIZE; i++) {
      for (int j = 0; j < MAP_SIZE; j++) {
        if (map[i][j] == EMPTY_DOT) {
          return false;
        }
      }
    }
    return true;
  }

}
