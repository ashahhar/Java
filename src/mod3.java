package com.user.xml;

//Sort an array by mod3 -
//All elements of mod3=0 would be before all elements of mod3=1... So on. Do it in linear time. 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class mod3 {

	public static void sortMod3(int[] k){
		Arrays.sort(k);
		ArrayList<Integer> lst = new ArrayList<Integer>();
		for(int i =0; i<k.length; i++){
			lst.add(k[i]%3);
		}
		Collections.sort(lst);
		System.out.println(lst);
	}
	public static void main(String[] args){
		int[] k = {7,9,12,11,8,14,27,16,36};
		sortMod3(k);
	}
}
