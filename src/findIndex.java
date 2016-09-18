
// Find the index of a unique number 

public class findIndex {
	
	public static void uniqueIndex(int[] arr, int key){
		for(int i=0; i<arr.length;i++){
			if(key==arr[i]){
				System.out.println(i);
				}
		}
	}
	public static void main(String[]args){
		int[] arr={1,2,2,2,2,2,3,4,5,6,7,8,9,10};
		int key=5;
		uniqueIndex(arr, key);
	}

}
