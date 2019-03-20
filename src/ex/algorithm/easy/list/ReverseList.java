package ex.algorithm.easy.list;

/**
 * @author Marie
 * @date 2018/10/31 10:09 AM
 * 反转链表
 **/
public class ReverseList {
    public static ListNode reverseList(ListNode head){
        ListNode pre = null;
        while(head!=null){
            //当前节点的后一节点等于前一节点
            // 前一节点总是首节点
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;

        }
        return pre;
    }

}
