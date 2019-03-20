package ex.algorithm.easy;

import java.util.Arrays;

/**
 * @author Marie
 * @date 2018/10/27 7:34 PM
 **/
public class FirstUniqueChar {
    public static int firstUniqueChar(String s){
        int []ans = new int[256];
        int index = 0;
        Arrays.fill(ans,0);
        for(int i = 0;i<s.length();i++){
            ans[s.charAt(i)]++;
        }
        for(int i = 0;i<s.length();i++){
            if(ans[s.charAt(i)] ==1){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String []args){
        String s = "abc";
        System.out.println(firstUniqueChar(s));


    }

}
