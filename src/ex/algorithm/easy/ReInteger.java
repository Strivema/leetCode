package ex.algorithm.easy;

/**
 * @author Marie
 * @date 2018/10/24 5:32 PM
 **/
public class ReInteger {
    public int reverse(int x){
        int res  =0;
        while(x!=0){
            int temp = x%10;
            x = x/10;
            if(res>Integer.MAX_VALUE/10)
                return 0;
            if (res<Integer.MIN_VALUE/10)
                return 0;

            res = res*10+temp;
        }

        return res;
    }

}
