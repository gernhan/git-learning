package basis.data_types.references_and_primitives;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReferencePassingExample {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("World");

    System.out.println("Before modifyReferenceValue method: " + list);
    modifyReferenceValue(list);
    System.out.println("After modifyReferenceValue method: " + list);

    // List, Stack (Last In First Out), Set (Unique), Queue (First In First Out)  
    // int a = 20;
    // boolean isEquals = ( a == 20 );

    Integer a = 10;
    Integer b = 10;
    String string = a.toString(); // "10"
    boolean isEquals = a.equals(10);

    StringBuilder str1 = new StringBuilder("abc");
    StringBuilder str2 = new StringBuilder("abc");
    System.out.println("str1.toString() == str2.toString(): " + (str1.toString() == str2.toString())); // false
    System.out.println("str1.toString().equals(str2.toString()): " + str1.toString().equals(str2.toString())); // true

    Set<Integer> set = new HashSet<>(); 
    set.add(1);
    set.add(1);
    set.add(2);

    System.out.println(set);
  }

  public static void modifyReferenceValue(List<String> list) {
    list.add("!");
    System.out.println("Inside modifyReferenceValue method: " + list);
  }
}
