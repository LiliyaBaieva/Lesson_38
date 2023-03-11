package Student;

public class Student {

  private String name;
  private String group;
  private String eMail;

//  String eMail = null;

  public Student(String name, String group){
    this.name = name;
    this.group = group;
    this.eMail = null;
  }

  public Student(String name, String group, String eMail){
    this.name = name;
    this.group = group;
    this.eMail = eMail;
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

  // - прочитать информацию о студентах - "имя" или "имя,e-mail" для каждого в отдельной строке
  // и вернуть получившегося студента
  // метод статический - вызывается сам по себе и возвращает нового прочитанного студента

  public static Student parseStudent(){

  }


}
