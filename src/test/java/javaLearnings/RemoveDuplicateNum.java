package javaLearnings;

public class RemoveDuplicateNum {

	public static void main(String[] args) {
		Integer[] num= {1,2,3,2,4,7,7};
		for(int i=0;i<=num.length-1;i++) {
			
			for(int j=i+1;j<=num.length-1;j++) {
				
				if(num[i]==num[j])
				{
					System.out.println("Duplicate elements are"  +num[i]);
				}
				else
				{
					System.out.println("Not Duplicate elements are"  +num[i]);
				}
			}
			
			
			
		}
	}

}
