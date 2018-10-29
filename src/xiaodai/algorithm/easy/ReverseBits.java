package xiaodai.algorithm.easy;

/**
 * @athour Marie
 * @date 2018/10/25 8:24 PM
 **/
public class ReverseBits {
    public static int reverseBits(int n){
        int res = 0;
        int i  =0;
        while(i<32){
            int temp = n&0x01;
            n = n>>1;
            res = (res<<1)|temp;
            i++;
        }
        return res;
    }
    public static void main(String []args){
        int n = 1;
        int tem = n&0x01;
        n = n>>1;
//        tem = tem<<1;
        System.out.println(tem);
        System.out.println(n);
        System.out.println(1|2);
    }
}
