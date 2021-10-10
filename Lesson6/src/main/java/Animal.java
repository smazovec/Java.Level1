public class Animal {

  private static int animalCount;
  private String name;

  public Animal(String name) {
    this.name = name;
    animalCount++;
  }

  public static int getAnimalCount() {
    return animalCount;
  }

  public String getName() {
    return this.name;
  }

  public void run(int distance) {
    System.out.println("Животное по кличке " + this.name + " пробежало " + distance + " метров");
  }

  public void swim(int distance) {
    System.out.println("Животное по кличке " + this.name + " проплыло " + distance + " метров");
  }

}
