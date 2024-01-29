package basis.data_types.references_and_primitives;

import java.util.ArrayList;
import java.util.List;

public class ReferencePassingExample {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("World");

    System.out.println("Before modifyReferenceValue method: " + list);
    modifyReferenceValue(list);
    System.out.println("After modifyReferenceValue method: " + list);
  }

  public static void modifyReferenceValue(List<String> list) {
    list.add("!");
    System.out.println("Inside modifyReferenceValue method: " + list);
  }
}
