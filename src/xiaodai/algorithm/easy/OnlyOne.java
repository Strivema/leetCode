package xiaodai.algorithm.easy;

/**
 * @athour Marie
 * @date 2018/10/22 4:19 PM
 **/
public class OnlyOne<main> {
    public static int sigleNumber(int []nums){
        int num = 0;
        for (int i=0;i<nums.length;i++){
            num ^= nums[i];

        }
        return num;
    }
    public static void main(String []args){
//        int nums[] = {1,2,3,1,2};
//        int i = sigleNumber(nums);
//        System.out.println(i);
        System.out.println();

    }
}
