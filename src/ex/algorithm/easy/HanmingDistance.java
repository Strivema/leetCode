package ex.algorithm.easy;

/**
 * @author Marie
 * @date 2018/10/25 3:47 PM
 **/
public class HanmingDistance {
    public static int hanmingDistance(int x,int y){
        int n = x^y;
        int count = 0;
        while(n!=0){
            n &=n-1;
            count++;
        }
        return count;
    }
    public static void main(String []args){
        System.out.println(hanmingDistance(1,4));
    }
}
