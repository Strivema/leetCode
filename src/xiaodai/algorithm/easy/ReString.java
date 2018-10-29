package xiaodai.algorithm.easy;

import java.util.Stack;

/**
 * @athour Marie
 * @date 2018/10/24 4:49 PM
 **/
public class ReString {
    public static String  reverseString(String s){
        if(s==null){
            return "";
        }
        char []c = s.toCharArray();
        int n = s.length()-1;
        for(int i =0;i<n;i++,n--){
            c[i] ^= c[n];
            c[n] ^= c[i];
            c[i] ^= c[n];
        }
        return new String(c);
    }
    public static void main(String []args){
        System.out.println(reverseString("hello"));
    }

}
