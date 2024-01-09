package oop.polymorphism;

// Rectangle.java
public class Rectangle extends Shape {
  // Attributes
  private double length;
  private double width;

  // Constructor
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  // Polymorphic method implementation
  @Override
  public double area() {
    return length * width;
  }
}
