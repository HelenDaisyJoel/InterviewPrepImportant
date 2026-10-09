package javaLearnings;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String str="@#J*&a$%#va^% $Le  ar*&%n$#ing-20";
		String removeSpecialChar= str.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(removeSpecialChar);
		
		String reversedString=new StringBuilder(removeSpecialChar).reverse().toString();
		
		System.out.println(reversedString);
//		
		String WhitspaceRemove=
				"H       E    L  E   N";
		
		String output=WhitspaceRemove.replaceAll("\\s+", "");
		System.out.println("Rmoved whitespace: "  + output);
		
		

// Split by one or more spaces and join with a single space
 String result = String.join(" ", WhitspaceRemove.trim().split("\\s+"));

		

String input = "H        E        L  E N";
String result1 = input.replaceAll("\\s+", ""); // Removes all whitespace
System.out.println("Result: " + result1);

	}

}
