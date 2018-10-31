package xiaodai.algorithm.easy.tree;

/**
 * @athour Marie
 * @date 2018/10/31 8:23 PM
 **/
public class MaxDeep {
    public static int maxDeepth(TreeNode root){
        int left = 0;
        int right = 0;
        if (root != null) {
            left = maxDeepth(root.left);
            right = maxDeepth(root.right);
        }else {
            return 0;
        }
        return left>right?left+1:right+1;

    }

}
