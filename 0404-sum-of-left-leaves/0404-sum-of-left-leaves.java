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
    public int print(TreeNode root,int x){
        if(root==null)return 0;
        if(root.left==null && root.right==null && x==0){
            return root.val;
        }
       
        return  print(root.left,0) + print(root.right,1);
    }
    public int sumOfLeftLeaves(TreeNode root) {
       return print(root,1);
    }
}