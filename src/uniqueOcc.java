package com.user.xml;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Find the first uniquely occuring word.
public class uniqOcc {
	
	public static void uniqueOcc(String s){
		Map<String, Integer> map1 =new HashMap<String, Integer>();
		ArrayList<String> list=new ArrayList<String>();
		String[] s2= s.split(" ");
		for(int i=0; i<s2.length;i++){
			if(map1.containsKey(s2[i])){
				int j = map1.get(s2[i]);
				j +=1;
				map1.put(s2[i], j);
				list.remove(s2[i]);
			}else{
				int j=1;
				map1.put(s2[i], j);
				list.add(s2[i]);
			}
		}
//		System.out.println(map1);
//		System.out.println(list);
		System.out.println(list.get(0));
	}
	
	public static void main(String[] args) {
		String s1= "Careercup is a good site. Careercup provides a lot of information.";
		uniqueOcc(s1);
	}
}
