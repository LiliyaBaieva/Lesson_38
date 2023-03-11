import Student.Student;

public class Main {
  public static void main(String[] args) {
    // написать базу данных студентов
    // студенты могут находиться в группах

    // красиво вывести состав групп на экран
    // - прочитать название группы
    // - прочитать количество студентов
    // - прочитать информацию о студентах - "имя" или "имя,e-mail" для каждого в отдельной строке

    Student student = new Student("Кирилл", "");
    Student student1 = Student.parseStudent("cohort24", "Liliia,liliia@gmail.com");
    System.out.println(student1.getName() + ", " + student1.getGroup() + ", " + student1.getEMail());

  }
}