package oop.polymorphism;

// Circle.java
public class Circle extends Shape {
  // Attributes
  private double radius;

  // Constructor
  public Circle(double radius) {
    this.radius = radius;
  }

  // Polymorphic method implementation
  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}
