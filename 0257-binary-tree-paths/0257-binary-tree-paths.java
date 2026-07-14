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
    public  void print(TreeNode root,List<String>l1,String a){
        if(root==null)return;
        if(root.left==null&&root.right==null){
            l1.add(a+root.val);
        }
print(root.left,l1,a+root.val+"->");
print(root.right,l1,a+root.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>l1=new ArrayList<>();
        print(root,l1,"");
        return l1;
    }
}