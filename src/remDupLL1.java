package com.user.xml;

import java.util.HashMap;

public class remDupLL {

	public static void main(String[] args){
		Node n = new Node(2);
		n.next = new Node(6);
		n.next.next = new Node(7);
		n.next.next.next = new Node(2);
		n.next.next.next.next = new Node(2);
		n.next.next.next.next.next = new Node(6);
		n.next.next.next.next.next.next = new Node(8);
		n.next.next.next.next.next.next.next = new Node(11);
		n.next.next.next.next.next.next.next.next = new Node(2);
		n.next.next.next.next.next.next.next.next.next = new Node(3);

		displayNodes(n);
		n =removeDup(n);
		System.out.println();
		displayNodes(n);
	}

	public static void displayNodes(Node n){
		while(n!=null){
			if(n.next==null){
				System.out.print(n.data);
			}
			else{
				System.out.print(n.data+"-");
			}

			n =n.next;
		}
	}
	public static Node  removeDup(Node head){
		if(head==null){
			return null;
		}
		HashMap<Integer, Integer> hmap =  new HashMap<Integer, Integer>();
		Node currNode = head.next;
		Node prevNode = head;
		Node temp; //keeping it so that last node would be eligible for garbage collection
		hmap.put(head.data, 1);
		while(currNode!=null){
            int data = currNode.data;
            if(hmap.containsKey(data)){
                prevNode.next = currNode.next;
                temp= currNode;
                currNode = currNode.next;
                temp.next = null;
            }else{
            	hmap.put(data, 1);
                prevNode = currNode;
                currNode = currNode.next;
            }
        } 
		return head;
        }
	}
	class Node{
		int data;
		Node next;
		public Node(int d){
			data =d;
			next=null;
		}
	}
