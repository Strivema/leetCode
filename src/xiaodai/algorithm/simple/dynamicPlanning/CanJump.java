package xiaodai.algorithm.simple.dynamicPlanning;

/**
 * @athour Marie
 * @date 2018/11/28 7:05 PM
 **/
public class CanJump {
    public boolean canJump(int[] nums) {
        if (nums == null) {
            return false;

        }
        if (nums.length == 0) {
            return true;
        }
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            }
            max = Math.max(max, i + nums[i]);

        }
        if (max >= nums.length - 1) {
            return true;
        }
        return false;
    }

    public boolean canJumpDP(int[] nums) {

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < dp.length; i++) {
            if (dp[i - 1] < i) {
                dp[i] = 0;
            } else {
                dp[i] = Math.max(dp[i - 1], nums[i] + i);
            }

        }
        return dp[nums.length - 1] >= nums.length - 1;
    }

    public static void main(String[] args) {
        int nums[] = {3,2,1,0,4};
        System.out.println( new CanJump().canJump(nums));
        System.out.println(new CanJump().canJumpDP(nums));
    }

}
