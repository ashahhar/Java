package com.user.xml;

//Sort an array by mod3 -
//All elements of mod3=0 would be before all elements of mod3=1... So on. Do it in linear time. 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;

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
	public static void sortModis3(int[] k){
		ArrayList<Integer> ls = new ArrayList<Integer>();
		for(int i =0; i< 10; i++ ){
			for(int j=0; j<k.length; j++){
				if(k[j]%3==i){
					ls.add(k[j]);
				}
			}
		}System.out.println(ls);
	}

//	public static void hashMod(int[] k){
//		Hashtable<String, Integer> mh = new Hashtable<String, Integer>();
//		for(int j=0; j<k.length; j++){
//			if(mh.contains(k[j])){
//				continue;
//			}
//			else{
//				
//			}
//
//		}System.out.println(ls);
//	}
	public static void main(String[] args){
		int[] k = {7,9,12,11,8,14,27,16,36};
		sortMod3(k);
		sortModis3(k);
//		hashMod(k);
	}
}
