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
  private Pet.Kind kind;
  private String name;
  private String dateOfBirth;
  private double weight;

//  конструкторы

  public Pet(Kind kindPet, String name, double weight, String dateOfBirth){ //"turtle,кличка,вес,дата рождения"
    this.kind = kindPet;
    this.name = name;
    this.weight = weight;
    this.dateOfBirth = dateOfBirth;
  }

  // сеттеры
  public void setKind(Kind kind) {
    this.kind = kind;
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
  public Kind getKind() {
    return kind;
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

//  public static Pet parsePet(String line){  // "turtle,кличка,вес,дата рождения"
//    int sepIndex1 = line.indexOf(SEP);
//    int sepIndex2 = line.indexOf(SEP, sepIndex1 + 1);
//    int sepIndex3 = line.indexOf(SEP, sepIndex2 + 1);
//    if(sepIndex3 != -1){
//      Kind kindPet = Kind.valueOf(line.substring(0,sepIndex1).toUpperCase());
//      String name = line.substring(sepIndex1 + 1, sepIndex2);
//      double weight = Double.parseDouble(line.substring(sepIndex2 + 1, sepIndex3));
//      String dateOfBirth = line.substring(sepIndex3 +1);
//      return new Pet(kindPet, name, weight, dateOfBirth);
//    } else if (sepIndex2 != -1) {   // "cat,кличка,вес"
//      Kind kindPet = Kind.valueOf(line.substring(0,sepIndex1).toUpperCase());
//      String name = line.substring(sepIndex1 + 1, sepIndex2);
//      double weight = Double.parseDouble(line.substring(sepIndex2 + 1, sepIndex3));
//      return new Pet(kindPet, name, weight);
//    } else {   // "dog,кличка"
//      Kind kindPet = Kind.valueOf(line.substring(0,sepIndex1).toUpperCase());
//      String name = line.substring(sepIndex1 + 1, sepIndex2);
//      return new Pet(kindPet, name);
//    }
//  }

  public static Pet parsePet(String line) {
    String[] parts = line.split(","); // разбить строку на подстроки по запятым
    Kind kind = parseKind(parts[0]);
    String name = parts[1];
//    double weight;
//    if (parts.length > 2) {
//      weight = Double.parseDouble(parts[2]);
//    } else {
//      weight = 0.0;
//    }
    double weight = parts.length > 2 ? Double.parseDouble(parts[2]) : 0.0;
    String dateOfBirth = parts.length > 3 ? parts[3] : null;
    return new Pet(kind, name, weight, dateOfBirth);
  }

  private static Kind parseKind(String line) {
    try {
      return Kind.valueOf(line.toUpperCase());
    } catch (IllegalArgumentException e) {
      return Kind.OTHER;
    }
  }

  public String getPetString() {
    String result = String.format("Имя: %s (%s)", name, kind.toString().toLowerCase());
    if (dateOfBirth != null && !dateOfBirth.isEmpty()) {
      result += String.format(", дата рождения: %s", dateOfBirth);
    }
    if (weight != 0) {
      result += String.format(", вес: %.2f", weight);
    }
    return result;
  }

}
