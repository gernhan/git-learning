package basis.data_types.references_and_primitives;

public class ValuePassingExample {
  public static void main(String[] args) {
    int x = 10;
    System.out.println("Before modifyPrimitiveValue method: " + x);
    modifyPrimitiveValue(x);
    System.out.println("After modifyPrimitiveValue method: " + x);
  }

  public static void modifyPrimitiveValue(int x) {
    x = 20;
    System.out.println("Inside modifyPrimitiveValue method: " + x);
  }
}
