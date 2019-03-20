package ex.algorithm.simple.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Marie
 * @date 2018/11/5 4:43 PM
 **/
public class LongestSubString {
    // 滑动窗口
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int start=0,end =0;
        int res = 0;
        Set<Character> set = new HashSet<>();
        while (end<n&&start<n){
            if (set.contains(s.charAt(end))){
                set.remove(s.charAt(start++));
            }else {
                set.add(s.charAt(end++));
                res = Math.max(res,end-start);
            }
        }
        return res;
    }
    public static int lengthofSubString(String s){
        int n = s.length();
        int start=0,end = 0;
        int res =0;
        Map<Character,Integer> map = new HashMap<>();
        while(start<n&& end<n){
            if(map.containsKey(s.charAt(end))){
                start = Math.max(map.get(s.charAt(end)),start);
            }
            map.put(s.charAt(end),end+1);
            res = Math.max(res,end-start+1);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcdd";
        int i = lengthOfLongestSubstring(s);
        int j = lengthofSubString(s);
        System.out.println(i);
    }
}
