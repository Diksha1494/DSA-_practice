Kadane_MaxSubarray.java

   ================= Brute Force Approach =================
 Time Complexity: O(n²)
 Space Complexity: O(1)

public class MaxSubarray {
    public static int maxSubArrayBrute(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += nums[j];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Brute Force Max Sum: " + maxSubArrayBrute(nums));
    }
}

==========================Optimise============================================
  [KADANE'S ALGORITHM]
class Solution {
    public int maxSubArray(int[] nums) {
         int max_sum = nums[0];
         int n = nums.length;
          int curr_sum = 0;
         for(int i = 0 ; i< n; i++)
         {
           curr_sum += nums[i];
                if(curr_sum > max_sum)
                {
                    max_sum = curr_sum;
                }
                if(curr_sum < 0)
                {
                    curr_sum = 0;
                }
            }
         
         return max_sum;
    }
}
Approach (Kadane’s Algorithm)

Maintain a running sum (curr_sum)

If curr_sum becomes negative → reset to 0

Keep track of maximum sum found (max_sum)
