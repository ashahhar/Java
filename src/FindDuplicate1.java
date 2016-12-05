package com.user.xml;

//Find duplicates in O(n) time and O(1) extra space
//Given an array of n elements which contains elements from 0 to n-1, with any of these numbers appearing any number of times. Find these repeating numbers in O(n) and using only constant memory space.
//
//For example, let n be 7 and array be {1, 2, 3, 1, 3, 6, 6}, the answer should be 1, 3 and 6.
//
//This problem is an extended version of following problem

public class FindDuplicate
{
    void printRepeating(int arr[], int size)
    {
        int i;  
        System.out.println("The repeating elements are : ");
    
        for (i = 0; i < size; i++)
        {
//        	System.out.println("Hello1: " +Math.abs(arr[i]));
            if (arr[Math.abs(arr[i])] >= 0){
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
//            	System.out.println("Hello2: " + arr[Math.abs(arr[i])]);
                }
            else
//            	System.out.println("Hello3: " + Math.abs(arr[i]));
                System.out.print(Math.abs(arr[i]) + " ");
        }         
    } 
 
    /* Driver program to test the above function */
    public static void main(String[] args) 
    {
        FindDuplicate duplicate = new FindDuplicate();
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        duplicate.printRepeating(arr, arr_size);
    }
}