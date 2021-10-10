public class HomeWorkApp {

  public static void main(String[] args) {
    Worker[] workers = new Worker[5];

    workers[0] = new Worker("Сергей Александрович Мазовец",
        "Ведущий инженер-программист",
        "smazovec@gmail.com",
        "+79059912948",
        160000f,
        42);

    workers[1] = new Worker("Иванов Иван Иванович",
        "Ассистент режисера",
        "ivanov.ii@vk.com",
        "+79119512476",
        220000f,
        35);

    workers[2] = new Worker("Петров Петр Петрович",
        "Оператор-постановщик",
        "pppetrov@yandex.ru",
        "+76244587521",
        140000f,
        38);

    workers[3] = new Worker("Денисов Денис Денисович",
        "Режисер",
        "denisovd@gmail.com",
        "+79069918745",
        360000f,
        60);

    workers[4] = new Worker("Марьянов Марьян Марьянович",
        "Младший помощник",
        "mmm@mail.ru",
        "+79514577421",
        48000f,
        21);

    for (int i = 0; i < workers.length; i++) {
      if (workers[i].getAge() > 40) {
        workers[i].info();
      }
    }
  }

}
