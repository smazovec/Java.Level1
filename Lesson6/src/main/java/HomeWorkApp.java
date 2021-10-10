import ru.geekbrains.javadeveloper.animals.Animal;
import ru.geekbrains.javadeveloper.animals.Cat;
import ru.geekbrains.javadeveloper.animals.Dog;
import ru.geekbrains.javadeveloper.equipment.Plate;

public class HomeWorkApp {

  public static void main(String[] args) {
    //lesson6();
    lesson7();
  }

  public static void lesson6() {
    Cat catBarsik = new Cat("Барсик", 10);
    Cat catMurzik = new Cat("Мурзик", 8);
    Dog dogSharik = new Dog("Шарик", 25);
    Dog dogBobik = new Dog("Бобик", 30);

    catBarsik.run(200);
    catMurzik.run(300);
    dogSharik.run(300);
    dogBobik.run(600);

    catBarsik.swim(50);
    catMurzik.swim(40);
    dogSharik.swim(40);
    dogBobik.swim(5);

    System.out.println("Всего в на выставке было животных: " + Animal.getAnimalCount());
    System.out.println("Из них котов: " + Cat.getAnimalCount());
    System.out.println("Из них собак: " + Dog.getAnimalCount());
  }

  public static void lesson7() {
    Cat[] cats = new Cat[5];

    cats[0] = new Cat("Барсик", 10);
    cats[1] = new Cat("Мурзик", 8);
    cats[2] = new Cat("Пушок", 6);
    cats[3] = new Cat("Черныш", 7);
    cats[4] = new Cat("Ластик", 6);

    Plate catPlate = new Plate(25);
    boolean allCatSatiety;
    int iteration = 1;
    Animal[] hungryCats = Animal.findHungry(cats);

    do {
      System.out.println();
      System.out.println("********************");
      System.out.println(iteration + " итерация колмления");
      catPlate.info();

      System.out.println("Имеем " + hungryCats.length + " голодных котов");
      System.out.println("Начинаем кормежку:");
      for (int i = 0; i < hungryCats.length; i++) {
        System.out.println();
        System.out.println("Кормим кота по кличке " + hungryCats[i].getName()
            + " с аппетитом = " + hungryCats[i].getAppetite());
        hungryCats[i].eat(catPlate);
        hungryCats[i].info();
        catPlate.info();
      }
      hungryCats = Animal.findHungry(hungryCats);
      allCatSatiety = (hungryCats.length == 0);
      if (!allCatSatiety) {
        catPlate.increaseFood(10);
      }
      iteration++;
    } while (!allCatSatiety);

    System.out.println();
    System.out.println("Все коты накормлены!!!");
  }
}
