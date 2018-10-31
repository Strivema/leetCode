package xiaodai.algorithm.easy.tree;

/**
 * @athour Marie
 * @date 2018/10/31 8:24 PM
 **/
public class SortArrayToBST {
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
