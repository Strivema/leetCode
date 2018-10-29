package xiaodai.algorithm.easy;

/**
 * @athour Marie
 * @date 2018/10/25 3:19 PM
 **/
public class IsPowerOfThree {
    public static boolean isPowerOfThree(int n){
        if(n==0||n==1)
            return true;
        return (n%3==0)&&isPowerOfThree(n/3);
    }
    public static void main(String []args){
        System.out.println(isPowerOfThree(0));
    }

}
