package com.twoPointers;

import java.util.*;

//Problem: Given integer array with zeros wanted to more zeros to end of that array
//Analysis:	I prefer two pointers approach
//Strategy: Using two pointers (i->for iterating the array and 
//								point->to track the position to place the next non-zero element
//TC: O(n) for loop runs exactly once over all n elements
//SC: O(1)


public class MoveZeroes {

	public static void moveZeros(int[] arr) {
		int point=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]!=0) {
				arr[point]=arr[i];
				if (point!=i) arr[i]=0;
				point++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arrLen=scan.nextInt();
		if (1>arrLen || arrLen>Math.pow(10,4)) {	//1 <= nums.length <= 10^4
			System.out.println("Array size out of limit!");
			return;
		}
		int[] arr=new int[arrLen];
		for (int i=0;i<arrLen;i++) {
			arr[i]=scan.nextInt();
			if (-231>arr[i] || arr[i]>Math.pow(2, 31)-1) {	//-231 <= nums[i] <= 2^31 - 1
				System.out.println("Entered value is not of limit!");
				return;
			}
		}
		moveZeros(arr);
		for (int i:arr) {
			System.out.print(i+" ");
		}
		
	}

}
