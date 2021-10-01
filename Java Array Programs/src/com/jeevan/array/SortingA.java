package com.jeevan.array;

public class SortingA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {3,1,7,8,0,11};
		int B[] = new int[] {3,1,7,8,0,11};
			for(int i=0;i<A.length;i++) {
				int temp;
				for(int j=i+1;j<A.length;j++) {
					if(A[i]>A[j]) {
						temp = A[i];
						A[i] = A[j];
						A[j] = temp;
					}
				}
			}
			System.out.println("Sorted array: ");
			for(int i=0;i<A.length;i++) {
				System.out.printf(" "+A[i]);
			}//last element position=lep
			int lep = A.length-1;
			int thirdLargest = A[(lep)-2];
			int secondLargest = A[(lep)-1];
			int Largest = A[lep];
			int secondSmallest = A[1];
			int Smallest = A[0];
			System.out.println("");
			System.out.println("Third largest element in array : "+thirdLargest);
			System.out.println("Second largest element in array : "+secondLargest);
			System.out.println("First largest element in array : "+Largest);
			System.out.println("Second smallest element in array : "+secondSmallest);
			System.out.println("First smallest element in array : "+Smallest);
			
			for(int i=0;i<B.length;i++) {
				int temp;
				for(int j=i+1;j<B.length;j++) {
					if(B[i]<B[j]) {
						temp = B[i];
						B[i] = B[j];
						B[j] = temp;
					}
				}
			}
			System.out.println("");
			System.out.println("Sorted array in Descending Order : ");
			for(int i=0;i<B.length;i++) {
				System.out.printf(" "+B[i]);
			}
		}
	}
