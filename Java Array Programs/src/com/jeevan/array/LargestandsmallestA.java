package com.jeevan.array;

public class LargestandsmallestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] {3,1,9,7,8,11,0,7};
		int smallest = A[0];
		int largest = A[0];
		for(int i=1;i<A.length;i++) {
			if(largest<A[i]) {
				largest = A[i];
			}
			if(smallest>A[i]) {
				smallest = A[i];
			}
			}
		
		System.out.println("Largest element in array is "+largest);
		System.out.println("Smallest element in array is "+smallest);
		System.out.println("No of elements in Array: "+A.length);
		int sum = 0;
		for(int i = 0;i<A.length;i++) {
			sum =sum+A[i];
		}
		System.out.println("Sum of elements in Array: "+sum);
	}

}
