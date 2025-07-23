package com.twoPointers;

import java.util.Scanner;

//Problem: Given array of heights wanted to find the maximum area of water is stored in which height position
//Analysis: I prefer two pointers approach to get the max area of water
//Strategy: Using opposite direction two pointers
//TC: O(n) for pointers (left, right) move only once in total through the array
//SC: O(1)


public class ContainerWithMostWater {

	public static int mostWater(int[] arr) {
		int max=Integer.MIN_VALUE;
		int left=0;
		int right=arr.length-1;
		while (right>left) {
			int h=Math.min(arr[right], arr[left]);
			int area=h*(right-left);
			max=Math.max(max, area);
			if (arr[right]>arr[left]) {
				left++;
			}
			else {
				right--;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arrLen=scan.nextInt();
		if (2>arrLen || arrLen>Math.pow(10, 5)) {	//2 <= n <= 10^5
			System.out.println("Entered size is out of limit!");
			return;
		}
		int[] arr=new int[arrLen];
		for(int i=0;i<arrLen;i++) {
			arr[i]=scan.nextInt();
			if (0>arr[i] || arr[i]>Math.pow(10, 4)) {	//0 <= height[i] <= 10^4
				System.out.println("Entered height is out of range!");
				return;
			}
		}
		System.out.println(mostWater(arr));
	}

}
