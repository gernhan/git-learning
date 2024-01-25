package oop.objects_and_classes;

import java.lang.Math;

public class QuadraticEquationSolver {
  private double a;
  private double b;
  private double c;

  public QuadraticEquationSolver(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public void solve() {
    double delta = b * b - 4 * a * c;

    if (delta > 0) {
      double root1 = (-b + Math.sqrt(delta)) / (2 * a);
      double root2 = (-b - Math.sqrt(delta)) / (2 * a);

      System.out.println("Phương trình có 2 nghiệm phân biệt:");
      System.out.println("Nghiệm 1: " + root1);
      System.out.println("Nghiệm 2: " + root2);
    } else if (delta == 0) {
      double root = -b / (2 * a);
      System.out.println("Phương trình có nghiệm kép:");
      System.out.println("Nghiệm: " + root);
    } else {
      System.out.println("Phương trình vô nghiệm");
    }
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Nhập các hệ số của phương trình ax^2 + bx + c:");
      System.out.print("Nhập a: ");
      double a = scanner.nextDouble();
      System.out.print("Nhập b: ");
      double b = scanner.nextDouble();
      System.out.print("Nhập c: ");
      double c = scanner.nextDouble();

      QuadraticEquationSolver solver = new QuadraticEquationSolver(a, b, c);
      solver.solve();
    }
  }
}
