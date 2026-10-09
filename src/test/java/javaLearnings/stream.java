package javaLearnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stream {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(42,12,67,3,12,33));
		list.stream().filter(i->i%5==0).forEach(System.out::println);
		
		
		
	}
}
