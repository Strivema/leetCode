package ex.algorithm.easy.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marie
 * @date 2018/10/31 8:23 PM
 **/
public class IsBST {
    //检验一棵树是不是二叉搜索树，只需中序遍历查看是否是递增序列
    public static boolean isValidBST(TreeNode root){
        if(root==null){
            return true;
        }
        List<Integer> list = new ArrayList<>();
        inOrder(root,list);
        for(int i =0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1))
                return false;
        }
        return true;
    }
    private static void inOrder(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }

}
