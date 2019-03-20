package ex.algorithm.simple.dynamicPlanning;

/**
 * @author Marie
 * @date 2018/11/29 11:33 AM
 **/
//  零钱兑换
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount < 0) {
            return -1;
        }
        if (amount == 0) {
            return 0;
        }
        int dp[] = new int[amount + 1];
        dp[0] = 0;
        for (int i = 0; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j])
                    min =Math.min(min,dp[i-coins[j]]+1);
                dp[i] = min==Integer.MAX_VALUE?-1:min;
            }
        }
        return dp[amount];

    }

    public static void main(String[] args) {
        int coins[] = {1, 2, 5};
        System.out.println(new CoinChange().coinChange(coins, 11));
    }

}
