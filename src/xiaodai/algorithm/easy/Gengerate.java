package xiaodai.algorithm.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @athour Marie
 * @date 2018/10/25 9:07 PM
 **/
public class Gengerate {
    // 杨辉三角   帕斯卡三角形
    public static List<List<Integer>> gengerate(int rownums){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i =1;i<=rownums;i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            double temp = 1;
            for(int j = 1;j<i;j++){
                temp = (temp*(i-j))/j;
                list.add((int)temp);
            }
            res.add(list);

        }
        return res;


    }
    public static List<List<Integer>> gengerate1(int rownums){
        List<List<Integer>> res = new ArrayList<>();
        if(rownums ==0)
            return res;
        if(rownums>=1){
            List<Integer> layer = new ArrayList<>();
            layer.add(1);
            res.add(layer);

        }
        if(rownums>=2){
            List<Integer> layer = new ArrayList<>();
            layer.add(1);
            layer.add(1);
            res.add(layer);
        }
        if (rownums>=3) {
            for (int i = 3; i <= rownums; i++) {
                List<Integer> layer = new ArrayList<>();
                List<Integer> pre = res.get(i - 2);
                layer.add(1);
                for (int j = 2; j < i; j++) {
                    layer.add(pre.get(j - 2) + pre.get(j - 1));
                }
                layer.add(1);
                res.add(layer);
            }
        }
        return res;
    }
    public static void main(String []args){
        System.out.println(gengerate1(4));

    }

}
