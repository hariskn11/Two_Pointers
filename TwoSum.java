package com.twoPointers;

import java.util.*;

//Problem: Given sorted array wanted to find the target by sum of two
//Analysis:	Since it is sorted I prefer two pointers approach
//Strategy: Using opposite direction two pointers
//TC: O(n) for pointers (start, end) move only once in total through the array
//SC: O(1)

public class TwoSum {

	public static int[] twoSum(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while (start<end){
        	int sum=arr[start]+arr[end];
            if (sum<target){
                start++;
            }
            else if(sum>target){
                end--;
            }
            else{
                return new int[] {start+1,end+1};
            }
        }
        return new int[] {};
    }
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arrLen=scan.nextInt();
		if(2>arrLen || arrLen>3*Math.pow(10, 4)) {	//2 <= numbers.length <= 3 * 10^4
			System.out.println("Entered array length is out of limit!");
			return;
		}
		int[] arr=new int[arrLen];
		for (int i=0;i<arrLen;i++) {
			arr[i]=scan.nextInt();
			if(-1000>arr[i] || arr[i]>1000) {	//-1000 <= numbers[i] <= 1000
				System.out.println("Entered value is out of limit!");
				return;
			}
			if (i!=0 && arr[i]<arr[i-1]) {	//numbers is sorted in non-decreasing order.
				System.out.println("Entered array is not in sorted non-decreasing order!");
				return;
			}
		}
		int target=scan.nextInt();
		if (-1000>target || target>1000) {	//-1000 <= target <= 1000
			System.out.println("Entered target is not of limit!");
			return;
		}
		
		int[] res=new int[2];
		res=twoSum(arr,target);
		for (int i:res) {
			System.out.print(i+" ");
		}
		
	}

}
