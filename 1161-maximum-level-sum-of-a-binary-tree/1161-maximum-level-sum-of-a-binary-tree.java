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
    public int maxLevelSum(TreeNode root) {
        if(root==null)return -1;
       
        int level=0, maxsum=Integer.MIN_VALUE;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int k=1;
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer>l1=new ArrayList<>();
            while(size-->0){
                TreeNode curr=q.poll();
                l1.add(curr.val);
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
            int sum=0;
            for(int i=0;l1.size()>i;i++){
                sum+=l1.get(i);
            }
            if(sum>maxsum){
                maxsum=sum;
                level=k;
            }
            k++;
        }
        return level;
    }
}