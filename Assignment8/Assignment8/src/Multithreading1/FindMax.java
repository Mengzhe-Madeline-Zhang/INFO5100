package Multithreading1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindMax {
	
// generate an large array with random numbers
	static void LargeArray(int[] arr) {
		Random rd = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i]=rd.nextInt();
		}
	}
	
	// find max value of an array using 5 threads
	static int findMax(int[] arr) throws InterruptedException{
		 int arrayLength = arr.length;
		 int threadNum=5;
		 int sublength= arrayLength/threadNum;
		 int max=0;
		 List<FindMaxTh> list= new ArrayList<FindMaxTh>();
		 
		 for(int i =0; i<threadNum; i++) {
			 FindMaxTh thread= new FindMaxTh(arr, i*sublength, (i+1)*sublength);
			 thread.start();
			 list.add(thread);
		 }
		
		 
		 for (int i =0; i< list.size(); i++) {
			 if(max<list.get(i).getMax()) {
				 max=list.get(i).getMax();
				
			 }
			
		 }
	 return max;
	 }
	
	
	public static void main(String[] args) throws InterruptedException {
	int [] arr = new int[300];
	LargeArray(arr);

	int max = findMax(arr);
		System.out.println("The maximum value within the array is£º"+ max);
	}
	
}	



 class FindMaxTh extends Thread{
	
	public int max;
	private int[] arr;
	private int start;
	private int end;
	
	public int getMax() {
		return max;
	}
	
	public void setMax(int max) {
		this.max=max;
	}
	
	public FindMaxTh(int[]arr, int start, int end) {
		this.arr=arr;
		this.start=start;
		this.end=end;
	}
	
	
	@Override
	public void run(){
		while(start<end) {
			if(max<arr[start]) {
				max=arr[start];
				start++;
			}
	}
}
}