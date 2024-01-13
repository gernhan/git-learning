package oop.objects_and_classes;

public class Car {
  // Attributes
  String color;
  String model;

  // Constructors
  public Car() {
    System.out.println("No args constructor");
  }

  public Car(String color, String model) {
    System.out.println("All args constructor");
    this.color = color;
    this.model = model;
  }

  // Method
  public void drive() {
    System.out.println("Car is driving.");
  }

  public static void main(String[] args) {
    // Creating an object of Car
    Car myCar = new Car();

    // Setting attributes
    myCar.color = "Red";
    myCar.model = "Sedan";

    // Calling method
    myCar.drive();
  }
}
