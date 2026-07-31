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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root==null)return list;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>l1=new ArrayList<>();
            for(int i=0;size>i;i++){
            TreeNode curr=q.poll();
            l1.add(curr.val);
            if(curr.left!=null)q.offer(curr.left);
            if(curr.right!=null)q.offer(curr.right);
            }
            Collections.sort(l1);
            list.add(l1.get(l1.size()-1));
        }
        return list;
    }
}