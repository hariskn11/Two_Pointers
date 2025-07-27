package com.twoPointers;

import java.util.Scanner;

//Problem: Given array with duplicate elements wanted to remove duplicates from the array
//Analysis: I prefer two pointer approach
//Strategy: Using same direction two pointers, one point to traverse the array and another one point for keeps track of the position where the next unique element should be placed
//TC: O(n) for pointers move only once in total through the array
//SC: O(1)

public class RemoveDuplicatesfromSortedArray {

	public static int removeDupli(int[] nums) {
        if (nums.length==0) return 0;
      int point=1;
      for (int i=1;i<nums.length;i++){
          if (nums[i]!=nums[point-1]){
              nums[point]=nums[i];
              point++;
          }
      }
      return point;
	}


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if (1>n || n>3*Math.pow(10, 4)) {	//	1 <= nums.length <= 3 * 10^4
			System.out.println("Entered array size is out of limit!");
			return;
		}
		int[] nums=new int[n];
		for (int i=0;i<n;i++) {
			nums[i]=scan.nextInt();
			if (-100>nums[i] || nums[i]>100) {	//	-100 <= nums[i] <= 100
				System.out.println("Entered value is out of limit!");
				return;
			}
			if (i!=0 && nums[i]<nums[i-1]) {	//	nums is sorted in non-decreasing order.
				System.out.println("Entered array is not in non-decreasing order!");
				return;
			}
		}
		System.out.println(removeDupli(nums));
	}

}
