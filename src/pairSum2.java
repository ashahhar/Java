package com.user.xml;
//Given an unsorted array and int k, find all pairs of numbers from the array that sum up to k. 
import java.util.Arrays;

public class pairSum2 {
	
	public static void sum(int[] arr, int k){
		  int i=0, j=arr.length-1;
		  Arrays.sort(arr);
		  while(j>i){
			  if((arr[i]+arr[j])==k){
				  System.out.println(arr[i]+"  "+ arr[j]);
				  break;
			  }
			  else if((arr[i]+arr[j])<k){
				  i++;
			  }
			  else if((arr[i]+arr[j])>k){
				  j--;
			  }
		  }
	}
	public static void main(String[] args){
		int[] arr  = {1, 4, 45, 6, 10, -8};
		sum(arr, 16);
	}
}
