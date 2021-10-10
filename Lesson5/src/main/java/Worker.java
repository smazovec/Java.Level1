public class Worker {

  private String fullName;
  private String position;
  private String email;
  private String telephone;
  private float salary;
  private int age;

  public Worker(String fullName, String position, String email, String telephone, float salary, int age) {
    this.fullName = fullName;
    this.position = position;
    this.email = email;
    this.telephone = telephone;
    this.salary = salary;
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void info() {
    System.out.println("ФИО: " + this.fullName + ", должность: " + this.position
        + ", e-mail: " + this.email + ", тел.: " + this.telephone
        + ", зарплата: " + this.salary + ", возраст: " + this.age);
  }

}
