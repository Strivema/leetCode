package ex.algorithm.easy.list;

/**
 * @author Marie
 * @date 2018/10/30 4:46 PM
 **/
public class DeleteNode {
    //删除链表中的节点
    public static void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
