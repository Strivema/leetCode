package ex.algorithm.easy.array;

/**
 * @author Marie
 * @date 2019/3/4 8:15 PM
 **/
public class Main {
    public static boolean sums(int[] arr) {

        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int t = sum >> 1;
        // 不存在
        if (sum % 2 != 0)
            return false;

        int[] dp = new int[t + 1];
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = t; j >= arr[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - arr[i]] + arr[i]);
            }
        }
        if (dp[t] == t)
            return true;
        return false;

    }
}
