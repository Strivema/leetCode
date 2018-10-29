package xiaodai.algorithm.easy;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.List;

/**
 * @athour Marie
 * @date 2018/10/27 7:18 PM
 **/
public class FizzBuzz {
    public static List<String> fizzBuzz(int n){
        List<String> res = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            if(i%3==0){
                if(i%5==0){
                    res.add("FizzBuzz");
                    continue;
                }
                res.add("Fizz");

            }else if (i%5==0){
                res.add("Buzz");
            }else{
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
    public static void main(String []args){
        System.out.println(fizzBuzz(15));
    }
}
