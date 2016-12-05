package com.user.xml;

import java.util.ArrayList;



//Given an array ar[ ] of numbers, write a method to return array ans, 
//where ans[i] equals to the product of all all elements in ar[ ] except ar[i]  

public class productArray {

	public static void product(int[] array){
		//ArrayList a=  new ArrayList();
		int[] m =new int[array.length];
		for(int i=0; i<array.length; i++){
			int k=1;
			for(int j=0; j<array.length; j++){
				if(j!=i){
					k *=array[j];
				}
			}
			m[i]=k;
			System.out.println(m[i]);
		}
	}
	public static void main(String[] args){
		int[] arr  = {1, 2, 3, 4, 5, 6};
		product(arr);
	}
}
