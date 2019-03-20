package ex.algorithm.easy;

/**
 * @author Marie
 * @date 2018/10/25 3:35 PM
 **/
public class HanmingWeight {
    public static int hanmingWeight(int n){
        int count = 0;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
    public static void main(String []args){
        System.out.println(hanmingWeight(3));
    }
}
