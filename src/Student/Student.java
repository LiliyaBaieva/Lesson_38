package Student;

public class Student {

  private static int counter = 0;
  final private static char SEP = ',';
  final private int id; // индетефикатор студента, должен заполняться автоматически, автоматическич
  private String name;
  private String group;
  private String eMail;

//  String eMail = null;

  public Student(String name, String group){
    this.id = ++counter;  // сначала увеличи потом записали
    this.name = name;
    this.group = group;
    this.eMail = null;
//    ++ counter;
  }

  public Student(String name, String group, String eMail){
    this.id = ++counter;
    this.name = name;
    this.group = group;
    this.eMail = eMail;
//    ++ counter;
  }

  public String getName() {
    return name;
  }

  public String getGroup() {
    return group;
  }

  public String getEMail() {
    return eMail;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public void setEMail(String eMail) {
    this.eMail = eMail;
  }

  // фабричный метод - производит объект из чего-то
  // - прочитать информацию о студентах - "имя" или "имя,e-mail" для каждого в отдельной строке
  // и вернуть получившегося студента
  // метод статический - вызывается сам по себе и возвращает нового прочитанного студента

  public static Student parseStudent(String group, String line){
    int sepIndex = line.indexOf(SEP); // ищем запятую  в переданной строке
    if(sepIndex != -1){
      String name = line.substring(0, sepIndex);
      String eMail = line.substring(sepIndex + 1);
      return new Student(name, group, eMail);
    }
//    String name = line;
    return new Student(/*name*/line, group);

  }

//  public String printStudent(){
//    return String.format(id + " " + name + ", " + group + ", " + eMail);
//  }


}
