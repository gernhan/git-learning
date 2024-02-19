package basis.data_types.references_and_primitives;

public class ReferenceVsPrimitive {
  public static void main(String[] args) {
    // Primitive type
    int primitiveInt1 = 5;
    int primitiveInt2 = primitiveInt1; // Value is copied

    primitiveInt2++; // Changing primitiveInt2 doesn't affect primitiveInt1
    // primitiveInt2 = primitiveInt2 + 1;

    System.out.println("Primitive Int 1: " + primitiveInt1); // Output: 5
    System.out.println("Primitive Int 2: " + primitiveInt2); // Output: 6

    // Reference type
    int[] array1 = { 1, 2, 3 };
    int[] array2 = array1; // Reference is copied
    array2[0] = 10; // Changing array2 changes array1 as well

    System.out.println("Array 1: " + java.util.Arrays.toString(array1)); // Output: [10, 2, 3]
    System.out.println("Array 2: " + java.util.Arrays.toString(array2)); // Output: [10, 2, 3]

    String s1 = "abcdef";
    String s2 = s1 + "g";

    System.out.println("String 1: " + s1);
    System.out.println("String 2: " + s2);

    StringBuilder stringBuilder1 = new StringBuilder("abcdef");
    StringBuilder stringBuilder2 = stringBuilder1;

    stringBuilder2.append("gasdg");

    System.out.println("StringBuilder 1: " + stringBuilder1.toString());
    System.out.println("StringBuilder 2: " + stringBuilder2.toString());

    StringBuffer stringBuffer1 = new StringBuffer("abcdef");
    StringBuffer stringBuffer2 = stringBuffer1;

    stringBuffer2.append("gssg");

    System.out.println("StringBuffer 1: " + stringBuilder1.toString());
    System.out.println("StringBuffer 2: " + stringBuilder2.toString());
  }
}
