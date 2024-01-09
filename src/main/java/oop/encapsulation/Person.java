package oop.encapsulation;

/**
 * Person
 */

public class Person {
  // Attributes
  private String name;
  private int age;

  // Constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Getter methods
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  // Method
  public void sleep() {
    System.out.println(name + " is sleeping.");
  }

  public static void main(String[] args) {
    // Creating an object of Person
    Person person = new Person("Alice", 25);

    // Accessing attributes using getters
    System.out.println("Name: " + person.getName());
    System.out.println("Age: " + person.getAge());

    // Calling method
    person.sleep();
  }
}
