package xiaodai.algorithm.simple.list;

import xiaodai.algorithm.easy.list.ListNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @athour Marie
 * @date 2018/11/2 10:19 AM
 **/
public class AddTwoNumbers {
    public static  ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode res = null;
        ListNode temp = null;

        int c = 0;
        while (l1!=null||l2!=null||c!=0){
            int sum = (l1==null?0:l1.val)+(l2==null?0:l2.val)+c;
            c = sum/10;
            ListNode node = new ListNode(sum%10);
            if (temp==null){
                temp = node;
                res  =temp;
            }else {
                temp.next = node;
                temp = temp.next;
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return res;

    }

//    public static int[] stringToIntegerArray(String input) {
//        input = input.trim();
//        input = input.substring(1, input.length() - 1);
//        if (input.length() == 0) {
//            return new int[0];
//        }
//
//        String[] parts = input.split(",");
//        int[] output = new int[parts.length];
//        for(int index = 0; index < parts.length; index++) {
//            String part = parts[index].trim();
//            output[index] = Integer.parseInt(part);
//        }
//        return output;
//    }
//
//    public static ListNode stringToListNode(String input) {
//        // Generate array from the input
//        int[] nodeValues = stringToIntegerArray(input);
//
//        // Now convert that list into linked list
//        ListNode dummyRoot = new ListNode(0);
//        ListNode ptr = dummyRoot;
//        for(int item : nodeValues) {
//            ptr.next = new ListNode(item);
//            ptr = ptr.next;
//        }
//        return dummyRoot.next;
//    }

//    public static String listNodeToString(ListNode node) {
//        if (node == null) {
//            return "[]";
//        }
//
//        String result = "";
//        while (node != null) {
//            result += Integer.toString(node.val) + ", ";
//            node = node.next;
//        }
//        return "[" + result.substring(0, result.length() - 2) + "]";
//    }

    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            ListNode l1 = stringToListNode(line);
//            line = in.readLine();
//            ListNode l2 = stringToListNode(line);
//
//            ListNode ret = addTwoNumbers(l1, l2);
//
//            String out = listNodeToString(ret);
//
//            System.out.print(out);
        ListNode node = new ListNode(2);
        node.next = new ListNode(3);
        node.next = new ListNode(4);
        ListNode node2 = new ListNode(5);
        node2.next = new ListNode(6);
        node2.next = new ListNode(4);
        ListNode res = addTwoNumbers(node,node2);
        while (res!=null) {
            System.out.println(res.val);
            res =res.next;
        }

    }

}
