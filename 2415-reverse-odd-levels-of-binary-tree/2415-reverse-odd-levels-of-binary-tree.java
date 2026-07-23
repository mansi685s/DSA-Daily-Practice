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
    public TreeNode reverseOddLevels(TreeNode root) {
        print(root.left,root.right,1);
        return root;
    }
    public void print(TreeNode l,TreeNode r,int level){
        if(l==null ||r==null)return;
        if(level%2==1){
           int temp=l.val;
            l.val=r.val;
            r.val=temp;
        }
        print(l.left,r.right,level+1);
        print(l.right,r.left,level+1);
    }
}