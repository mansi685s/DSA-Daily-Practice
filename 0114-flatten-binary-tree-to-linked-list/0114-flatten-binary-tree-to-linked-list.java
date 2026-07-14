/**9
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
    public void print(TreeNode root,List<TreeNode>list){
        if(root==null)return;
        list.add(root);
        print(root.left,list);
        print(root.right,list);
    }
    public void flatten(TreeNode root) {
        List<TreeNode>list=new ArrayList<>();
        print(root,list);
       for(int i=0;i<list.size()-1;i++) {
            list.get(i).left=null;
            list.get(i).right=list.get(i + 1);
        }
    }
}