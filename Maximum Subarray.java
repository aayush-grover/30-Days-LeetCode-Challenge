// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

// Example:

// Input: [-2,1,-3,4,-1,2,1,-5,4],
// Output: 6
// Explanation: [4,-1,2,1] has the largest sum = 6.


class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxSum=nums[0];
        int newSum=nums[0];
        for(int i=1;i<n;i++)
        {
               newSum+=nums[i];
           maxSum=Math.max(maxSum,newSum);
            newSum=Math.max(newSum,0);
        }
        return maxSum;
    }
}