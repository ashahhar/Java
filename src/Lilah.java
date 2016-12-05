package com.user.xml;

import java.util.Scanner;

//Lilah has a string, s , of lowercase English letters that she repeated infinitely many times.
//Given an integer,n , find and print the number of letter a's in the first n  letters of Lilah's infinite string.
//Sample Input:
//	abc - string
//	10  -substring 0-10
//Output:
//	7

public class Lilah {
	public static long numofChar(String s, long n){

		long countChars=0; int countAs=0;
		if(s.length()>0){
			for(int i=0; i<s.length(); i++){
				if(s.charAt(i)=='a'){
					countAs +=1;
				}
			}
		}
		long div = n/s.length();
		long mod = n%s.length();
		countChars= div * countAs;
		for(int i =0; i<mod; i++){
			if(s.charAt(i)=='a'){
				countChars +=1;
			}
		}
		return countChars;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		long n = in.nextLong();
		System.out.println(numofChar(s, n));

	}   
}
