package com.user.xml;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Programming Challenge Description:
//You will be given a sequence of passages, and must filter out any passage whose text (sequence of whitespace-delimited words) is wholly contained 
//as a sub-passage of one or more of the other passages.
//When comparing for containment, certain rules must be followed:
//The case of alphabetic characters should be ignored
//Leading and trailing whitespace should be ignored
//Any other block of contiguous whitespace should be treated as a single space
//non-alphanumeric character should be ignored, white space should be retained
//Duplicates must also be filtered - if two passages are considered equal with respect to the comparison rules listed above, only the shortest 
//should be retained. If they are also the same length, the earlier one in the input sequence should be kept. The retained passages should be 
//output in their original form (identical to the input passage), and in the same order.
//
//Input:
//For each test case a single line comprising the passages (strings) to be processed, delimited by | characters. The | characters are not considered part of any passage.
//
//Output:
//A single line of filtered passages in the same |-delimited format.
//
//Test 1
//Test Input: "IBM cognitive computing|IBM 'cognitive' computing is a revolution| ibm cognitive  computing|'IBM Cognitive Computing' is a revolution?";
//Expected Output: IBM "cognitive" computing is a revolution
//Test 2
//Test Input Download Test Input'Computer Science Department'|Computer-Science-Department|the 'computer science department'
//Expected Output Download Test Output Computer-Science-Department|the "computer science department"

public class removeDuplicates {
	public static void main(String[] args) throws IOException{
		//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s1 ="IBM cognitive computing|IBM 'cognitive' computing is a revolution| ibm cognitive  computing|'IBM Cognitive Computing' is a revolution?";
		String s ="'Computer Science Department'|Computer-Science-Department|the 'computer science department'";
		//		String[] newS=  s.split("[|]");
		String[] exp = s.split("[|]");
		//		s= s.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s", "");
		//		System.out.println(s);
		List<String> l1 = new ArrayList<String>(Arrays.asList(exp));
		List<String> l2 = new ArrayList<String>(Arrays.asList(exp));
		//		System.out.println(l1.get(0));
		for(int i=0; i< l1.size(); i++){
			//			System.out.println(newS[i].trim());
			//			System.out.println(exp[i]);
			//			l1.set(i, ((l1.get(i)).replaceAll("-","aa")).trim());
			l1.set(i, ((l1.get(i).toLowerCase()).replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", " ")).trim());
			//			l1.set(i, ((l1.get(i)).replaceAll("[-.?:,+^\\s]+(?:(?=\\s)|$)", "").replaceAll("\\s+", " ")).trim());
			System.out.println(l1.get(i));
			System.out.println(l2.get(i));
			System.out.println("-----------");
		}
		System.out.println("================");
//						int i=exp.length;
//						while(i>1){
//							String txt1= l1.get(0).toLowerCase(), txt2=l1.get(1).toLowerCase();
//							if(txt1.equals(txt2)){
//		//						System.out.println("hello   0000: ");
//								if(l1.get(0).length()== l1.get(1).length()){
//		//							System.out.println("hello   00gggg00: ");
//									l1.remove(1);
//									l2.remove(1);
//								}
//								else{
//									if(l1.get(0).length()> l1.get(1).length()){
//		//								System.out.println("hello   0011: ");
//										l1.remove(0);
//										l2.remove(0);
//									}
//									if(l1.get(0).length()< l1.get(1).length()){
//		//								System.out.println("hello   0022: ");
//										l1.remove(1);
//										l2.remove(1);
//									}
//								}
//							}
//							else{
//								if(txt1.contains(txt2)){
//		//							System.out.println("hello   1111: "+l1.size());
//									l1.remove(1);
//									l2.remove(1);
//		//							System.out.println("l1.size(): " +l1.size());
//				
//								}
//								if(txt2.contains(txt1)){
//		//							System.out.println("hello   2222: "+l1.size());
//									l1.remove(0);
//									l2.remove(0);
//		//							System.out.println("l1.size(): " +l1.size());
//								}
//							}
//							i--;
//						}
		int a=0, b=1;
		for(int i =0; i<l1.size()-1;i++){
//			i=0;
			System.out.println(i);
			for(int j =i+1; j<l1.size(); j++){
				System.out.println(j);
				String txt1=l1.get(i), txt2 =l1.get(j);
				
				if((l1.get(i)).equals(l1.get(j)))
				{	System.out.println("hello   1100: ");
					if((l2.get(i)).length() == (l2.get(j)).length()){
						System.out.println("hello   1111: ");
						System.out.println(l1.get(j));
						System.out.println(l1.get(i));
						l1.remove(j);
						l2.remove(j);
					}
					else{
						if((l2.get(i)).length() > (l2.get(j)).length()){
							System.out.println("hello   1122: ");
							l1.remove(i);
							l2.remove(i);
						}
						if((l2.get(i)).length() < (l2.get(j)).length()){
							System.out.println("hello   1133: ");
							l1.remove(j);
							l2.remove(j);
						}
					}
					
				}
				else{
					if(l1.size()>1){
						if(l1.get(i).contains(l1.get(j))){
						System.out.println("hello   2200: ");
						l1.remove(j);
						l2.remove(j);
					}
						}
					
					System.out.println("chechkpjhfjhgfehgijgjrfehgf");
					System.out.println(i);
					System.out.println("size: " + l1.size());
					if(l1.size()>1){
						if(l1.get(j).contains(l1.get(i))){
							System.out.println("hello   2211: ");
							System.out.println(l1.get(j));
							System.out.println(l1.get(i));
							l1.remove(i);
							l2.remove(i);
						}
					}
					
				}
			}
			i--;
		}
		
		System.out.println("/////////////////////////");
			if(l2.size()>0){
				for(int j=0; j<l2.size(); j++){
					System.out.println(l2.get(j));
				}
			}
		}

	}
