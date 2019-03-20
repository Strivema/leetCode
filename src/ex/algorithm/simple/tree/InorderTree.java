package ex.algorithm.simple.tree;

import ex.algorithm.easy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marie
 * @date 2018/11/3 2:38 PM
 **/
public class InorderTree {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        inorder(list,root);
        return list;

    }
    public void inorder(List<Integer> list,TreeNode root){
        if (root==null){
            return;
        }else {
            inorder(list,root.left);
            list.add(root.val);
            inorder(list,root.right);
        }
    }

}
