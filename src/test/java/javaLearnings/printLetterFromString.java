package javaLearnings;

public class printLetterFromString {

	public static void main(String[] args) {
		String name= "Helen";
		for(int i=0;i<=name.length()-1;i++) {
			System.out.println(name.charAt(i));
			
			
		}
		
		String name1= "Helen";
		char c[]=name1.toCharArray();
		
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
			
			
		}

	}

}
