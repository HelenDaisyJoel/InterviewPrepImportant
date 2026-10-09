package javaLearnings;

import java.util.Scanner;

public class reverseNumber {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
	System.out.print("Enter a string to reverse: ");
    int number = scanner.nextInt();
    while (number != 0) {
    int reverseddigit=0;
    int lastDigit=number%10;
    int reversedNumber= reverseddigit*10+lastDigit;
    number/=10;
    
    System.out.println("Reversed number: " + reversedNumber);
    }
    scanner.close();
    
	}

}
