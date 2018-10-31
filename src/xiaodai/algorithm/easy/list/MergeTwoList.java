package xiaodai.algorithm.easy.list;

/**
 * @athour Marie
 * @date 2018/10/31 10:46 AM
 **/
public class MergeTwoList {
    public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if (l1==null||l2==null){
            if(l1==null&&l2==null){
                return null;
            }else{
                return l1!=null?l1:l2;
            }
        }
        ListNode res = null;
        if(l1.val<l2.val){
            res = l1;
            res.next = mergeTwoLists(l1.next,l2);
        }else {
            res = l2;
            res.next = mergeTwoLists(l1,l2.next);
        }
        return res;
    }
}
