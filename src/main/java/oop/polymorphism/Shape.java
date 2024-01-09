package oop.polymorphism;

// Shape.java
public abstract class Shape {
  // Abstract method
  public abstract double area();

  public static void main(String[] args) {
    // Polymorphic behavior
    Shape circle = new Circle(5.0);
    Shape rectangle = new Rectangle(4.0, 6.0);

    // Calculating areas
    System.out.println("Circle Area: " + circle.area());
    System.out.println("Rectangle Area: " + rectangle.area());
  }
}
