package October1Bitwise1;

import java.util.Scanner;

public class MultipleNonRepeatedXor {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of array");
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0 ; i < arr . length ; i ++) {
			int sum = 0;
			for(int j =0; j<arr.length; j++) {
				if((arr[i]^arr[j])==0 && i!=j) {
					sum++;
				}
			}
			if(sum ==0) {
				System.out.print(arr[i]+" , ");
			}
		}
		
	}

}
