package com.twoPointers;

import java.util.*;

//Problem: Given string that wanted to reverse
//Analysis:	Since wanted to reverse the string(character array) I prefer two pointers approach
//Strategy: Using opposite direction two pointers 
//TC: O(n)
//SC: O(1)

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		char[] ch=str.toCharArray();
		if (1>ch.length || ch.length>Math.pow(10, 5)) {		//1 <= s.length <= 10^5
			System.out.println("Out of limit!");
			return;
		}
		reverseString(ch);
		System.out.println(new String(ch));
	}
	
	public static void reverseString(char[] ch) {
		int start=0;
		int end=ch.length-1;
		while (start<end) {
			char c=ch[start];
			ch[start]=ch[end];
			ch[end]=c;
			start++;
			end--;
		}
	}

}
