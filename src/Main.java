import Student.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // написать базу данных студентов
    // студенты могут находиться в группах

    // красиво вывести состав групп на экран

    // - прочитать количество студентов
    // - прочитать информацию о студентах - "имя" или "имя,e-mail" для каждого в отдельной строке
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      List<Student> students = new ArrayList<>();
      // прочитать количество групп
      int groups = Integer.parseInt(br.readLine());
      for (int groupID = 0; groupID < groups; ++groupID) {
       // для каждой группы
        readGroup(br, students);
      }
      System.out.println();

      for(Student student : students){
        System.out.printf("%s (%s) в группе %s%n", student.getName(), student.getEMail(), student.getGroup());

      }
    }


    private static void readGroup(BufferedReader br, List<Student> students) throws IOException {
      // - прочитать название группы
      String groupName = br.readLine();
      int studentsNumber = Integer.parseInt(br.readLine());
      String line = br.readLine();
      for(int i = 0; i < studentsNumber; ++i){
        Student student = Student.parseStudent(groupName, line);
        students.add(student);
      }

    }




//    Student student1 = Student.parseStudent("cohort24", "Liliia,liliia@gmail.com");
//    Student student2 = Student.parseStudent("cohort24", "Kirill,Kir@gmail.com");
//    Student student3 = Student.parseStudent("cohort24", "Vadim,Vad@gmail.com");
//    System.out.println(student1.printStudent());
//    System.out.println(student2.printStudent());
//    System.out.println(student3.printStudent());



}