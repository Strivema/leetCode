package ex.algorithm.easy;

import java.util.Arrays;

/**
 * @author Marie
 * @date 2018/10/22 5:18 PM
 **/
public class PlusOne {
    public static void main(String []args){
        int nums[] = {9,9,9};
        int[] ints = plusOne(nums);
        System.out.println(Arrays.toString(ints));

    }
    public static int[] plusOne(int []digits){
        int n = digits.length;
        for(int i = n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] =0;
        }
        int res[] = new int[n+1];
        res[0] = 1;
        return res;

    }
}
