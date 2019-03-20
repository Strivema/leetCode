package ex.algorithm.easy;

/**
 * @author Marie
 * @date 2018/10/25 4:52 PM
 **/
public class MissNumber {
    public static int missNumber(int []nums){
        int n = nums.length;
        int res = n;
        for(int i =0;i<n;i++){
            res+=(i-nums[i]);
        }
        return res;
    }
    public static void main(String []args){
        int []nums = {1,2,0};
        System.out.println(missNumber(nums));
    }

}
