package ex.algorithm.easy.list;

/**
 * @author Marie
 * @date 2018/10/31 1:58 PM
 **/
public class HasCycle {
    public static boolean hascycle(ListNode head){
        if(head==null||head.next==null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next!=null&&fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

}
