package ex.algorithm.easy.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author Marie
 * @date 2018/10/31 8:24 PM
 **/
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 层次遍历：1.使用队列 2.使用递归
        List<List<Integer>>  list  =new ArrayList<>();

        level(list,0,root);
        return list;

    }
    public static void level(List<List<Integer>> list,int lev,TreeNode root){
        if (root==null){
            return;
        }
        if(list.size()-1<lev)
            list.add(new ArrayList<>());
        list.get(lev).add(root.val);
        level(list,lev+1,root.left);
        level(list,lev+1,root.right);
    }
    public List<List<Integer>> levelOrder1(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        if (root==null){
            return list;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int lev = queue.size();
            List<Integer> l = new ArrayList<>();
            for (int i =0;i<lev;i++){
                TreeNode node = queue.poll();
                l.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
            }
            list.add(l);
        }
        return list;
    }


}
