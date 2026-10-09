package javaLearnings;

import java.util.Scanner;

public class SumOfArray {
	public static int result=10;
	 public static void main(String[] args) {
	 
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter the size:  ");
		 int size=sc.nextInt();
		 int array[] =new int[size];
		 int sum=0;
		 
		 System.out.println("Enter the elemets of array:  ");
		 for(int i=0; i<size; i++) {
			 array[i]=sc.nextInt();
		 }
		 
//		 int sum=0;
//		 int[] array = {10, 20, 30, 40};
		 
		 for(int num:array) {
			 sum+=num;
			 
		 }
		 System.out.println("The sum of array elemets:  "+sum);
	 }

}
