package basis.data_types.references_and_primitives;

public class ReferenceVsPrimitive {
  public static void main(String[] args) {
    // Primitive type
    int primitiveInt1 = 5;
    int primitiveInt2 = primitiveInt1; // Value is copied

    primitiveInt2++; // Changing primitiveInt2 doesn't affect primitiveInt1

    System.out.println("Primitive Int 1: " + primitiveInt1); // Output: 5
    System.out.println("Primitive Int 2: " + primitiveInt2); // Output: 6

    // Reference type
    int[] array1 = { 1, 2, 3 };
    int[] array2 = array1; // Reference is copied

    array2[0] = 10; // Changing array2 changes array1 as well

    System.out.println("Array 1: " + java.util.Arrays.toString(array1)); // Output: [10, 2, 3]
    System.out.println("Array 2: " + java.util.Arrays.toString(array2)); // Output: [10, 2, 3]
  }
}
