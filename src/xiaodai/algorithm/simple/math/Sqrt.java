package xiaodai.algorithm.simple.math;

/**
 * @athour Marie
 * @date 2018/11/8 10:45 AM
 **/
public class Sqrt {
    public static int mySqrt(int x){
        if(x <=1){
            return x;
        }
        int l = 0,r = x;
        while (l<r){
            int mid = l + (r-l)/2;
            if (x/mid>=mid){
                l = mid+1;
            }else
                r = mid;
        }
        return r-1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(10));
    }

}
