package HomeWork38_task1_pets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainPet {
//  Создать класс Main, в котором данные будут считываться с консоли и красиво выводиться на экран.
//  Формат входных данных: , затем сами записи в описанном формате.
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Pet> pets = new ArrayList<>();
//    количество строк с записями о домашних животных
    int numberPets = Integer.parseInt(br.readLine());
    String line;
    for (int i = 0; i < numberPets; ++i){
      line = br.readLine();
      Pet pet = Pet.parsePet(line);
      pets.add(pet);
    }
//    "turtle,кличка,вес,дата рождения"
    for (Pet pet : pets){
      System.out.printf("%s, %s, %d, %s%n", pet.getKindPet(), pet.getName(), pet.getWeight(), pet.getDateOfBirth());
    }

  }


}
