package ex.algorithm.easy.tree;

/**
 * @author Marie
 * @date 2018/10/31 8:24 PM
 **/
public class SortArrayToBST {
    //以最中间的作为根，然后以左半部分的中做根的左儿子，右半部分的中做右儿子
    public TreeNode sortArrayTpBST(int []nums){
        if(nums==null||nums.length<=0){
            return null;
        }
        return build(nums,0,nums.length-1);

    }
    public TreeNode build(int []nums,int start,int end){
        if (start<end){
            int mid = (start+end)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = build(nums,start,mid-1);
            root.right = build(nums,mid+1,end);
            return root;

        }else

            return null;
    }

}
