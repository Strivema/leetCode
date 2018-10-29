package xiaodai.algorithm.easy;

import java.util.Stack;

/**
 * @athour Marie
 * @date 2018/10/25 7:09 PM
 **/
public class MinStack {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MinStack() {
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }
    public void push(int num){
        if(stackMin.isEmpty()||getMin()>num){
            stackMin.push(num);
        }
        stackData.push(num);

    }
    public Integer pop(){
        Integer num = stackData.pop();
        if(num ==getMin()){
            stackMin.pop();
        }
        return num;

    }
    public Integer getMin(){
        if (!stackMin.isEmpty())
            return stackMin.peek();
        else
            return 0;

    }

}
