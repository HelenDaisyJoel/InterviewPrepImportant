package javaLearnings;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
List<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");

System.out.println("List: " + list);
list.remove("Cherry");

System.out.println("List: " + list);

}
}

