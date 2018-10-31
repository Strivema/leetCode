package xiaodai.algorithm.easy.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @athour Marie
 * @date 2018/10/31 11:04 AM
 **/
public class IsPalindList {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        List<Integer> res = new LinkedList<>();
        res.add(slow.val);
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            res.add(0,slow.val);
        }
        if (fast.next!=null){
            slow = slow.next;
        }
        int i =0;
        while(slow!=null){
            if(res.get(i)!=slow.val){
                return false;
            }
            slow= slow.next;
            i++;

        }
        return true;
     }
     public static boolean isPalindList(ListNode head){
        if(head==null||head.next==null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Stack<ListNode> stack = new Stack<>();
        while(slow!=null){
            stack.push(slow);
            slow = slow.next;
         }
         slow =head;
        while (!stack.isEmpty()){
            if(slow.val!=stack.pop().val){
                return false;
            }
            slow = slow.next;
        }
        return true;

     }

}
