package ex.algorithm.easy;

/**
 * @author Marie
 * @date 2018/10/25 10:32 AM
 **/
public class Climbing {
    public static int climbing(int n){
        int []dp = new int[n+1];
        dp[0] =0;
        if (n>0){
            dp[1] = 1;
        }
        if (n>1){
            dp[2] = 2;
        }
        if (n>=3) {
            for (int i = 3; i < dp.length; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
            return dp[n];

    }

    public static void main(String []args){
        System.out.println(climbing(1));
    }

}
