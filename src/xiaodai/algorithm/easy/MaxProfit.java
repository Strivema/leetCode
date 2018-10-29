package xiaodai.algorithm.easy;

/**
 * @athour Marie
 * @date 2018/10/23 11:12 AM
 **/
public class MaxProfit {

    public static void main(String []args){
        int [] nums = {7,1,5,3,6,4};
        System.out.println(maxprofit1(nums));
    }

    public static int maxprofit(int []prices){
        // 贪心算法，每次计算当前最优，不考虑最后结果最优

        int res = 0, temp = 0;
        for(int i=1;i<prices.length;i++){
            temp = prices[i]-prices[i-1];
            if(temp>0){
                res +=temp;
            }
        }
        return res;
    }
    public static int maxprofit1(int []prices){
        // 动态规划
        if(prices==null||prices.length<=0){
            return 0;
        }
        int max = 0;
        int min =prices[0];
        for (int i =0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }else {
                if(max<prices[i]-min){
                    max = prices[i]-min;
                }
            }
        }
        return max;
    }
}
