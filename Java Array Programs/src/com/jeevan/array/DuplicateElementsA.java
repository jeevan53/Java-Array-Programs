package com.jeevan.array;

public class DuplicateElementsA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {2,4,5,1,2,4,7,2,2,7};
		int[] F = new int[A.length];
		System.out.println("Given Array :");
		int visited = -1;
		int count = 0;
		for(int i=0;i<A.length;i++) {
			count= count+1;
			System.out.printf(A[i]+" ");
			for(int j=i+1;j<A.length;j++) {
				if(A[i]==A[j]) {
					count++;
					//no need to check for number already checked
					F[j]= visited;
				}
			}
			if(F[i]!=visited) {
				F[i]=count;
				
			}
			count =0;
		}
		System.out.println("");
		System.out.println("Elements | Frequency");
		System.out.println("--------------------");
		for(int j = 0;j<F.length;j++) {
			if(F[j]!=visited) {
				System.out.println("      "+A[j]+"  |  "+F[j]);
			}
		}
	}

}
