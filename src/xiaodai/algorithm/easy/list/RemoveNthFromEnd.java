package xiaodai.algorithm.easy.list;

/**
 * @athour Marie
 * @date 2018/10/30 4:55 PM
 **/
public class RemoveNthFromEnd {
    //倒数第k 其实是第n-k
    public static ListNode removeNthFromEnd(ListNode head,int n){
        ListNode pre =head;
        ListNode cur =head;
        for(int i=0;i<n;i++){
            pre = pre.next;
        }
        if(pre==null){
            return head.next;
        }
        while(pre.next!=null){
            pre = pre.next;
            cur = cur.next;
        }
        //删除操作
        cur.next =cur.next.next;
        return head;

    }

}
