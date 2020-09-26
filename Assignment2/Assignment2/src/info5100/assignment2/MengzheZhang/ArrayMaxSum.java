package info5100.assignment2.MengzheZhang;
/**
 * The deadline of this assignment is 09/25/2020 23:59 PST.
 * Please feel free to contact Yafei and Yaqi for any questions.
 */

public class ArrayMaxSum {
    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number)
     * which has the largest sum and outprint its sum.
     *
     * Example 1:
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     *
     * Example 2:
     * Input: nums = [1]
     * Output: 1
     */
    public static int maxSubArray(int[] nums) {
        //write your code here
    	int maxSum = nums[0];
    	int maxLeft = 0;
    	int maxRight = 0;
    	int left = 0;
    	int right = 0;
    	int currentSum=0;
    	
    	if (nums.length < 1) {
    		return 0;
    	}
    	
    	while (right < nums.length) {
    		currentSum+=nums[right];
    		
    		if (currentSum > maxSum) {
    			maxSum=currentSum;
    			maxLeft=left;
    			maxRight=right;
    		}
    		else {
    			if(currentSum<0) {
    				currentSum=0;
    				left=right+1;
    			}
    		}
    		right++;
    	}
    	return maxSum;
    }

    public static void main(String[] args) {
        //write your code here
    	int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
    	System.out.print(maxSubArray(arr));
    }
}
