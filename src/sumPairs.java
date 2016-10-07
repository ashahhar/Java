package com.user.xml;

public class sumPairsK {

	public static void sum3(int[] array, int num){
		
		for(int i=0; i<array.length-2; i++){
			for(int j=i+1; j<array.length-1; j++){
				int sum=0;
				for(int k=j+1; k<array.length; k++){
					sum =array[i]+array[j]+array[k];
//					System.out.println(i+" " +j+" " + k +" "+ sum);
					if(sum==num){
						System.out.println(array[i]+" " +array[j]+" " + array[k]);
					}
				}
			}
		}
		
		}
	
	public static void main(String[] args){
		int[] arr  = {1,2,3,4,5,6,7,8,9,0};
		sum3(arr, 7);
	}
}
