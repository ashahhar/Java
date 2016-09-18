
/*Given a file (which can be considered as a String with comma delimiter for the complexity of the question) of usernames and a value k, find top k usernames (with number of logins) who logged into the system the most. 
For example - 
Input: 
User (String) = user1, user4, user2, user1, user3, user1, user2, user3 
k (int) = 2 
Output: 
user1 (3) 
user2 (2) 
user3 (2) 
- Both user2 and user3 should be included since both has same number of logins 
Write a java method to find the output with best time and space complexity.*/

package com.user.xml;

import java.util.HashMap;
import java.util.Map;

public class topUsers {
	public static void top_k(String[] s, int k){
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<s.length; i++){
			if(map.containsKey(s[i])){
				int j = map.get(s[i]);
				j++;
				map.put(s[i], j);
			}
			else{
				int j =1;
				map.put(s[i],j);
			}
		}
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			String key = e.getKey();
			int value = e.getValue();
			if(value>=k){
				System.out.println(key +" "+ value);
			}
		}
	}
	public static void main(String[] args){
		String[] s = {"user1", "user4", "user2", "user1", "user3", "user1", "user2", "user3"};
		int k =2;
		top_k(s, k);
	}
}
