package xiaodai.algorithm.easy;

/**
 * @athour Marie
 * @date 2018/10/25 11:52 AM
 **/
public class Backet {

    //背包问题
    public static int backet(int []value,int []weight,int maxWeight){


        int n = weight.length;
        int dp[][] = new int[n+1][maxWeight+1];
        for(int i=0;i<maxWeight+1;i++){
            dp[0][i] = 0;
        }
        for(int i  =0;i<n+1;i++){
            dp[i][0] = 0;
        }
        for(int i =1;i<=n;i++){
            for (int j = 1;j<=maxWeight;j++){
                dp[i][j] = dp[i-1][j];
                if(weight[i-1]<=j){
                    if(dp[i-1][j - weight[i-1]] + value[i-1]>dp[i-1][j]) {
                        dp[i][j] = dp[i-1][j - weight[i-1]] + value[i-1];
                    }


                }
            }
        }
        return dp[n][maxWeight];

    }
    public static void main(String []args){
        int weight[] = {2,3,4,5};
        int value[] = {3,4,5,7};
        int maxweight = 9;
        System.out.println(backet(value,weight,maxweight));

    }
}
