package xiaodai.algorithm.simple.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @athour Marie
 * @date 2018/11/4 10:26 PM
 **/
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs){
        if (strs==null||strs.length==0){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> map = new HashMap<>();

        for (String s:strs){
            char []c = s.toCharArray();

            Arrays.sort(c);
            String val = String.valueOf(c);
            if (!map.containsKey(val)){
                map.put(val,new ArrayList<>());
            }
            map.get(val).add(s);

        }
        return new ArrayList<List<String>>(map.values());
    }

}
