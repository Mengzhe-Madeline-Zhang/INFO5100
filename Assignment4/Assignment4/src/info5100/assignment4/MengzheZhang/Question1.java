package info5100.assignment4.MengzheZhang;

import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		int[] n1 = new int[] {3,2,1,5,6,4};
		int k1 =2;
		System.out.println("K'th largest element in the first array is "+KthLargest(n1, k1));
		
		int[] n2 = new int[] {3,2,3,1,2,4,5,5,6};
		int k2 =4;
		System.out.println("K'th largest element in the first array is "+KthLargest(n2, k2));

	}
	
    public static int KthLargest(int[] arr, int k) {
    	Arrays.sort(arr);
    	
    	return arr[arr.length-k];
    }

}

/** Console Result

K'th largest element in the first array is 5
K'th largest element in the first array is 4

 * 
 * 
 * **/
 