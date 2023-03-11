package HomeWork38_task1_pets;

public class Pet {
//  Создать класс Pet (домашнее животное). В классе должны быть:
//  enum Kind для вида животного (DOG, CAT, OTHER);
  private enum Kind{
  DOG,
  CAT,
  OTHER
}

  //  поля:
//      "вид животного" (тип Kind),
//      "кличка" (тип String),
//      "дата рождения" (тип String),
//  вес (тип double);
  private Pet.Kind kindPet;
  private String name;
  private String dateOfBirth;
  private double weight;

//  конструкторы
  public Pet(Pet.Kind kindPet, String name){
  this.kindPet = kindPet;
  this.name = name;
  this.dateOfBirth = null;
  this.weight = 0.00;
}

  public Pet(Pet.Kind kindPet, String name, String dateOfBirth){
    this.kindPet = kindPet;
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.weight = 0.00;
  }

  public Pet(Pet.Kind kindPet, String name, String dateOfBirth, double weight){
    this.kindPet = kindPet;
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.weight = weight;
  }

  // сеттеры
  public void setKindPet(Kind kindPet) {
    this.kindPet = kindPet;
  }
  public void setName(String name) {
    this.name = name;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

//  геттеры
  public Kind getKindPet() {
    return kindPet;
  }

  public String getName() {
    return name;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public double getWeight() {
    return weight;
  }

  //  статический метод для создания животного при прочтении данных из строки
//  "dog,кличка", "cat,кличка,вес", "turtle,кличка,вес,дата рождения".


//  Создать класс Main, в котором данные будут считываться с консоли и красиво выводиться на экран.
//  Формат входных данных: количество строк с записями о домашних животных, затем сами записи в описанном формате.
}
