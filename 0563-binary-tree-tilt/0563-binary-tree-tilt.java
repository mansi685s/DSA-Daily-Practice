/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans=0;
    public int print(TreeNode root){
        if(root==null)return 0;
        int left=print(root.left);
        int right=print(root.right);
        ans+=Math.abs(left-right);
        return left+right+root.val;
    }
    public int findTilt(TreeNode root) {
        print(root);
        return ans;
    }
}