package javaLearnings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class basicArry {
	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40};
		 System.out.println(Arrays.toString(array)); // Output: [10, 20, 30, 40]
		 
		 Set<Integer> uniqueElement=new HashSet<>(Arrays.asList(10,20,10,20));
		 System.out.println(uniqueElement);
		 
		String[] array1 = {"Apple", "Carrot", "Banana", "Orange"};
		Arrays.sort(array1);
		System.out.println("Sorted array: " + Arrays.toString(array1));		 
	}

}
