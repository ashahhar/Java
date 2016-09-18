package com.user.xml;

// forming array of Strings
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class SequenceStrings {
	
		public static void main(String[] args) {
			
			String[] A ={"a1", "a2"};
			String[] B ={"b1"};
			String[] C ={"c1", "c2", "c3"};
		    List<String> l = new ArrayList<String>();
		    List<String> l1 = new ArrayList<String>(Arrays.asList(A));
		    List<String> l2 = new ArrayList<String>(Arrays.asList(B));
		    List<String> l3 = new ArrayList<String>(Arrays.asList(C));
		    int i=0;
		    while( l3.size()>0){
		    	if(l1.size() !=0){
		    		l.add(l1.get(i));
		    		l1.remove(i);
		    	}
		    	if(l2.size() !=0){
		    		l.add(l2.get(i));
		    		l2.remove(i);
		    	}
		    	if(l3.size() !=0){
		    		l.add(l3.get(i));
		    		l3.remove(i);
		    	}
		    }
		    System.out.println(l);
		}
	}

