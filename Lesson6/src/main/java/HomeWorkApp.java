public class HomeWorkApp {

  public static void main(String[] args) {
    Cat catBarsik = new Cat("Барсик");
    Cat catMurzik = new Cat("Мурзик");
    Dog dogSharik = new Dog("Шарик");
    Dog dogBobik = new Dog("Бобик");

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

}
