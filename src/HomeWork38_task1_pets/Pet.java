package HomeWork38_task1_pets;

public class Pet {
  final private static char SEP = ',';
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
  public Pet(Kind kindPet, String name){  // "dog,кличка"
  this.kindPet = kindPet;
  this.name = name;
  this.dateOfBirth = null;
  this.weight = 0.00;
}

  public Pet(Kind kindPet, String name, double weight){ // "cat,кличка,вес"
    this.kindPet = kindPet;
    this.name = name;
    this.dateOfBirth = null;
    this.weight = weight;
  }

  public Pet(Kind kindPet, String name, double weight, String dateOfBirth){ //"turtle,кличка,вес,дата рождения"
    this.kindPet = kindPet;
    this.name = name;
    this.weight = weight;
    this.dateOfBirth = dateOfBirth;
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
  public static Pet parsePet(String line){  // "turtle,кличка,вес,дата рождения"
    int sepIndex1 = line.indexOf(SEP);
    int sepIndex2 = line.substring(sepIndex1 + 1).indexOf(SEP);
    int sepIndex3 = line.substring(sepIndex2 + 1).indexOf(SEP);
    if(sepIndex3 != -1){
      Kind kindPet = Kind.valueOf(line.substring(0,sepIndex1).toUpperCase());
      String name = line.substring(sepIndex1 + 1, sepIndex2);
      double weight = Double.parseDouble(line.substring(sepIndex2 + 1, sepIndex3));
      String dateOfBirth = line.substring(sepIndex3 +1);
      return new Pet(kindPet, name, weight, dateOfBirth);
    } else if (sepIndex2 != -1) {   // "cat,кличка,вес"
      Kind kindPet = Kind.valueOf(line.substring(0,sepIndex1).toUpperCase());
      String name = line.substring(sepIndex1 + 1, sepIndex2);
      double weight = Double.parseDouble(line.substring(sepIndex2 + 1, sepIndex3));
      return new Pet(kindPet, name, weight);
    } else {   // "dog,кличка"
      Kind kindPet = Kind.valueOf(line.substring(0,sepIndex1).toUpperCase());
      String name = line.substring(sepIndex1 + 1, sepIndex2);
      return new Pet(kindPet, name);
    }
  }
}
