package javaLearnings;

import java.util.Scanner;

public class LargestInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		int array[]=new int[size];
		
		System.out.println("Enter the size: ");
		for(int i=0; i<size;i++) {
			array[i]=sc.nextInt();
			
		}
		
		int largest=array[0];
		for(int num: array) {
		if(num>largest) {
			largest=num;
					}		
	}
		System.out.println("The largest number in the array is " + largest);
	}

}
