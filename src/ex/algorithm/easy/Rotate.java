package ex.algorithm.easy;

import java.util.Arrays;

/**
 * @author Marie
 * @date 2018/10/23 3:25 PM
 **/
public class Rotate {
    public static void revese(int []nums,int start,int end){
        int temp = 0;
        int count;
        count = (int)((end-start)/2+0.5);
        for(int i=0;i<=count;i++){
            temp = nums[start+i];
            nums[start+i] = nums[end-i];
            nums[end-i] = temp;
        }
    }
    public static void rotate(int []nums,int k){

        int n =nums.length;
        k = k%n;
        if (k==0){
            return;
        }
        revese(nums,0,n-1);
        revese(nums,0,k-1);
        revese(nums,k,n-1);

    }
    public static void main(String []args){
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));

    }
}
