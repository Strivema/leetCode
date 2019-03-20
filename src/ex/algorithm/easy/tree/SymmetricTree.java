package ex.algorithm.easy.tree;

/**
 * @author Marie
 * @date 2018/10/31 8:24 PM
 **/
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root){
        if (root==null){
            return true;
        }
        return sysmetric(root.left,root.right);
    }
    public boolean sysmetric(TreeNode left,TreeNode right){
        if(left==null||right==null){
            return false;
        }
        if(left==null&&right==null){
            return true;
        }
        return (left.val==right.val)&&sysmetric(left.left,right.right)&&sysmetric(left.right,right.left);
    }

}
