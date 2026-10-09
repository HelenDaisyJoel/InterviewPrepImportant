package javaLearnings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
System.out.println(input.toCharArray());
        for (char c : input.toCharArray()) {
            if (seen.add(c)) {
            	
                result.append(c);
            }
        }
        
        
        
        System.out.println(seen.toString());
        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + result.toString());
    }
}
