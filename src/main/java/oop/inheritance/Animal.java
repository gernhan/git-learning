package oop.inheritance;

// Animal.java
public class Animal {
  // Method
  public void eat() {
    System.out.println("Animal is eating.");
  }

  public static void main(String[] args) {
    // Creating an object of Dog
    Dog myDog = new Dog();

    // Inherited method
    myDog.eat();

    // Subclass-specific method
    myDog.bark();
  }
}
