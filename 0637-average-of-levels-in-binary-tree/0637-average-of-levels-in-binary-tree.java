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
    public void print(TreeNode root, List<Double>list){
        if(root==null)return;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            double sum=0.0;
            for(int i=0;size>i;i++){
              TreeNode curr=q.poll();
              sum+=curr.val;
              if(curr.left!=null)q.add(curr.left);
              if(curr.right!=null)q.add(curr.right);
            }
            double av=sum/size;
            list.add(av);
        }
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>list=new ArrayList<>();
        print(root,list);
        return list;
    }
}