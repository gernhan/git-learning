package oop.objects_and_classes;

import java.lang.Math;
import java.util.Scanner;

public class QuadraticEquationSolver {
  private final double a;
  private final double b;
  private final double c;

  public QuadraticEquationSolver(final double a, final double b, final double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public void solve() {
    final double delta = b * b - 4 * a * c;

    if (delta > 0) {
      final double root1 = (-b + Math.sqrt(delta)) / (2 * a);
      final double root2 = (-b - Math.sqrt(delta)) / (2 * a);

      System.out.println("Phương trình có 2 nghiệm phân biệt:");
      System.out.println("Nghiệm 1: " + root1);
      System.out.println("Nghiệm 2: " + root2);
    } else if (delta == 0) {
      final double root = -b / (2 * a);
      System.out.println("Phương trình có nghiệm kép:");
      System.out.println("Nghiệm: " + root);
    } else {
      System.out.println("Phương trình vô nghiệm");
    }
  }

  public static void main(final String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Nhập các hệ số của phương trình ax^2 + bx + c:");
      System.out.print("Nhập a: ");
      final double a = scanner.nextDouble();
      System.out.print("Nhập b: ");
      final double b = scanner.nextDouble();
      System.out.print("Nhập c: ");
      final double c = scanner.nextDouble();

      final QuadraticEquationSolver solver = new QuadraticEquationSolver(a, b, c);
      solver.solve();
    }
  }
}
