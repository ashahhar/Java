package com.user.xml;

//Consider an array of  integers, , where all but one of the integers occur in pairs. In other words, 
//every element in  occurs exactly twice except for one unique element.
//Given , find and print the unique element.
//Input Format:
//The first line contains a single integer, , denoting the number of integers in the array. 
//The second line contains  space-separated integers describing the respective values in .
//Constraints
//It is guaranteed that  is an odd number.
//, where .
//Output Format:	
//	Print the unique number that occurs only once in  on a new line.
//Sample Input:
//	3
//	1 1 2
//	
//Sample Output:
//	2
//Link to question:  https://www.hackerrank.com/challenges/lonely-integer
	
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class lonelyInteger {
	     private static int lonelyInteger(int[] a) {
//	    	 System.out.println(a);
	        List<Integer> myList = new ArrayList<Integer>();
	         for(int i=0; i<a.length; i++){
//	        	 System.out.println(a[i]);
	             if(myList.contains(a[i])){
	                 myList.remove(Integer.valueOf(a[i]));
	             }else{
	                 myList.add(a[i]);
	             }
	         }
	         return myList.get(0);
	    }
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = in.nextInt();
	        }
	        int[] b = {1, 1, 2, 3, 3};
	        System.out.println(lonelyInteger(b));
	    }
	}



