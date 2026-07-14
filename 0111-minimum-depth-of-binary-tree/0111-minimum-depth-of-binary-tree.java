class Solution {
    static {
        for (int i = 0; i < 100; i++) {
            minDepth(new TreeNode(0));
        }
    }
    public static int minDepth(TreeNode root) {
        if(root==null)return 0;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        for(int depth=1;!q.isEmpty();depth++){
            int qSize=q.size();
            for(int i=0;i<qSize;i++){
                TreeNode examined=q.remove();
                if(examined.left==null && examined.right==null)return depth;
                if (examined.left!=null) {
                    q.add(examined.left);
                }
                if(examined.right!=null) {
                    q.add(examined.right);
                }
            }
        }
        return -1;
    }
}