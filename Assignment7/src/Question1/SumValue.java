package Question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SumValue {

	 /*generate array of random numbers*/
	 static void generateRandomArray(int[] arr){
		 Random rd = new Random();
		 for (int i=0; i<arr.length; i++) {
			 arr[i]=rd.nextInt();
		 }
	 }
	
	 
	 /*get sum of an array using 4 threads*/
	 static long sum(int[] arr) throws InterruptedException{
		 int arrayLength = arr.length;
		 int threadNum=4;
		 int sublength= arrayLength/threadNum;
		 int sum=0;
		 List<SumThread> list= new ArrayList<SumThread>();
		 
		 for(int i =0; i<threadNum; i++) {
			 SumThread thread= new SumThread(arr, i*sublength, (i+1)*sublength);
			 thread.start();
			 list.add(thread);
		 }
		 for (int i =0; i < list.size(); i++) {
			 list.get(i).join();
		 }
		 for (int i =0; i< list.size(); i++) {
			 sum+= list.get(i).getSum();
		 }
	 return sum;
	 }
	 
	 
	 public static void main(String[] args) throws InterruptedException{
	 int[] arr = new int[4000000];
	 generateRandomArray(arr);
	 long sum = sum(arr);
	 System.out.println("Sum: " + sum);
	 }
	}

class SumThread extends Thread{
	public int sum;
	private int[] arr;
	private int start;
	private int end;
	
	public int getSum() {
		return sum;
	}
	
	public void setSum(int sum) {
		this.sum=sum;
	}
	
	public SumThread(int[]arr, int start, int end) {
		this.arr=arr;
		this.start=start;
		this.end=end;
	}
	
	@Override
	public void run() {
		while(start<end) {
			sum+=arr[start];
			start++;
		}
	}
	
}