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
    public void print(TreeNode root,ArrayList<String>l1,String s){
        if(root==null)return;
        if(root.left==null && root.right==null){
            l1.add(s+root.val); 
        return;
        }
        print(root.left,l1,s+root.val);
        print(root.right,l1,s+root.val);
    }
    public int sumRootToLeaf(TreeNode root) {
      
        ArrayList<String>l1=new ArrayList<>();
        print(root,l1,"");
        int sum=0;
        for(int i=0;l1.size()>i;i++){
            sum+=  Integer.parseInt(l1.get(i),2);
        }
        return sum;
    }
}