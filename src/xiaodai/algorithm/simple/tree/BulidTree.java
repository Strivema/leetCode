package xiaodai.algorithm.simple.tree;

import xiaodai.algorithm.easy.tree.TreeNode;

/**
 * @athour Marie
 * @date 2018/11/3 3:15 PM
 **/
public class BulidTree {
    public TreeNode bulidTree(int []preorder,int[] inorder){
        if(preorder==null||inorder==null||preorder.length==0){
            return null;
        }
        return bulid(preorder,0,preorder.length-1,inorder,0,inorder.length-1);

    }
    public static TreeNode bulid(int []preorder,int prest,int prend,int[]inorder,int inst,int inend){
        int rootval = preorder[prest];
        TreeNode root = new TreeNode(rootval);
        if(prend ==prest){
            return root;
        }
        int inroot = inst;
        while (inorder[inroot]!=rootval&&inroot<=inend){
            inroot++;
        }
        // 左子树的长度
        int length = inroot -inst;
        int pre  =prest+length;

        if(length>0){
            root.left = bulid(preorder,prest+1,pre,inorder,inst,inroot-1);
        }
        if(length<prend-prest){
            // 修改
            root.right = bulid(preorder,pre+1,prend,inorder,inroot+1,inend);
        }
        return root;

    }

}
