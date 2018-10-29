package xiaodai.algorithm.easy;

import java.util.Arrays;

/**
 * @athour Marie
 * @date 2018/10/25 11:08 AM
 **/
public class MaxNum {
    public static int maxSubArray(int []nums){
        int n = nums.length;

        if(n==0){
            return 0;
        }
        if (n==1){
            return nums[0];
        }
        int []dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1;i<n;i++){
            if(dp[i-1]>0){
                dp[i] = dp[i-1]+nums[i];
            }else{
                dp[i] = nums[i];
            }
            max = Math.max(dp[i],max);
        }
        System.out.println(Arrays.toString(dp));
        return max;
    }
    public static void main(String []args){
        int []nums = {-2,1,-3,4,-1,2,1,-5,4};
        int []nums2 = {1,-1,2,-3,3};
        System.out.println(maxSubArray(nums2));
    }
}
