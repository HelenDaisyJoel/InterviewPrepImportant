package javaLearnings;

import java.util.Scanner;

public class smallestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the size: ");
//		int size=sc.nextInt();
//		int array[]=new int[size];
//		
//		
//		System.out.println("Enter the elements: ");
//		for(int i=0; i<size; i++) {
//			array[i]=sc.nextInt();
//		}
		int array[]= {12, 3, 4, 79, 1};
		String array1[]= {"Banana", "Apple"};
		int smallest=array[0];
		for(int num:array) {
			if(num<smallest) {
				smallest=num;
			}
		}
		System.out.println("The smallest element in array is: "+smallest);
		
		
		for (String fruit:array1) {
			System.out.println(fruit);
		}
		

	}

}
