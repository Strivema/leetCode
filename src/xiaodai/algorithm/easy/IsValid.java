package xiaodai.algorithm.easy;

import java.util.Stack;

/**
 * @athour Marie
 * @date 2018/10/25 4:34 PM
 **/
public class IsValid {
    public static boolean isValid(String s){
        if(s.isEmpty()){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if (c=='('){
                stack.push(')');
            }else if (c=='['){
                stack.push(']');
            }else if (c=='{'){
                stack.push('}');
            }else if (stack.isEmpty()||stack.pop()!=c){
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String []args){
        System.out.println(isValid("{[}][]"));
    }

}
