package dirapp.java_dasar_lombok;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PersonTest {

  @Test
  void createViaConstructor() {
    List<String> hobbies = new ArrayList<>();
    hobbies.add("Game");
    hobbies.add("Read");
    hobbies.add("Traveling");

    Person person = new Person("id", "name", 30, hobbies);
    System.out.println(person.toString());
  }


  @Test
  void createViaSetter() {
    List<String> hobbies = new ArrayList<>();
    hobbies.add("Game");
    hobbies.add("Read");
    hobbies.add("Traveling");

    Person person = new Person();
    person.setId("id");
    person.setName("name");
    person.setAge(30);
    person.setHobbies(hobbies);
    System.out.println(person.toString());
  }


  @Test
  void createViaBuilder() {
    Person person = Person.builder()
        .id("id")
        .name("name")
        .age(30)
        .hobby("Game")
        .hobby("Read")
        .hobby("Traveling")
        .build();

    System.out.println(person);
  }
}