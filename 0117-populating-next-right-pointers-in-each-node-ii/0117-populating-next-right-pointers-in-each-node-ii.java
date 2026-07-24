/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)return root;
        Node temp=root.next;
        Node nextchild=null;
        while(temp!=null){
            if(temp.left!=null){
                nextchild=temp.left;
                break;
            }
            if(temp.right!=null){
                nextchild=temp.right;
                break;
            }
            temp=temp.next;
        } 
        if(root.right != null) {
            root.right.next = nextchild;
        }

        // Connect left child
        if(root.left != null) {
            if(root.right != null) {
                root.left.next = root.right;
            } else{
                root.left.next = nextchild;
            }
        }
        connect(root.right);
        connect(root.left);
        return root;
    }
}