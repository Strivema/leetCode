package xiaodai.algorithm.simple.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @athour Marie
 * @date 2018/10/31 11:47 PM
 **/
public class ThreeSums {
    public static List<List<Integer>> threeSum(int []nums){
        List<List<Integer>> res = new ArrayList<>();
        if(nums!=null&&nums.length>2){

            Arrays.sort(nums);
            for(int i =0;i<nums.length;i++){
                int j = i+1;
                int k = nums.length-1;
                while (j<k){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> list = new ArrayList<>(3);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        res.add(list);
                        while(j < k &&nums[j]==nums[j+1]){
                            j++;
                        }
                        while (j < k &&nums[k]==nums[k-1]){
                            k--;
                        }
//                        k--;
                        j++;
                    }else if (j < k &&nums[i]+nums[j]+nums[k]>0){
                        k--;
                    }else {
                        j++;
                    }
                }
                while (i < nums.length - 2 &&nums[i]==nums[i+1]){
                    i++;
                }
            }
        }
        return res;
    }

}
