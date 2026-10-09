package javaLearnings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class basicArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array1 = {"Apple", "Carrot", "Banana", "Orange","Apple"};
Arrays.sort(array1);
System.out.println("Hi"+Arrays.toString(array1));
Set<String> set= new HashSet<String>(Arrays.asList(array1));

Set<String> set1= new HashSet<String>(Arrays.asList("string1", "string 20" ,"string1", "string 20" ));
System.out.println(set);
System.out.println(set1);
//Convert back to array if needed
String[] uniqueArray = set.toArray(new String[0]);

 // Print the result
 System.out.println(Arrays.toString(uniqueArray));



System.out.println("Sorted array: " + Arrays.asList(array1));


	}

}
