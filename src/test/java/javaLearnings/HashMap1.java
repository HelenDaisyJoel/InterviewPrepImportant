package javaLearnings;

import java.util.HashMap;
import java.util.Map;


public class HashMap1 {

	public static void main(String[] args) {
HashMap<String, Integer> map = new HashMap<>();
map.put("Apple", 1);
map.put("Banana", 2);
map.put("Cherry", 3);


System.out.println(map.containsKey("Cherry1"));
System.out.println(map.remove("Apple", 2));
System.out.println(map.replace("Cherry", 3,2));
System.out.println(map);

		

	}

}
