package com.user.xml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {
	public static void main(String[] args){
		String[] myStringArray = {"a","b","c"};
		List<String> list = new ArrayList<String>(Arrays.asList(myStringArray));
		list.remove(0);
		for(int i=0; i<myStringArray.length; i++){
			System.out.println(myStringArray[i]);
		}
		System.out.println(list.size());
	}
}
