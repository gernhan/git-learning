package oop.objects_and_classes;

public class Car {
  // Attributes
  private String color;
  private String model;
  private String mode;

  // Constructors
  public Car() {
    System.out.println("No args constructor");
  }

  public Car(final String color, final String model) {
    System.out.println("All args constructor");
    this.color = color;
    this.model = model;
  }

  // Method
  public void drive(final String mode) {
    this.mode = mode;
    System.out.println(String.format("this car is driving in %s mode.", mode));
  }

  @Override
  public String toString() {
    return "Car{color=" + color + ", model=" + model + ", mode=" + mode + "}";
  }

  public static void main(final String[] args) {
    // Creating an object of Car
    final Car myCar = new Car("Red", "Sedan");

    // Calling method
    myCar.drive("normal mode");
    myCar.drive("sport mode");
  }
}
