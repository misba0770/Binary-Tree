class Solution {
    // Function to return the diameter of a Binary Tree.
   
    int diameter(Node root) {
        
        if(root==null)return 0;
        if(root.left==null&&root.right==null)return 1;
        int lh=diameter(root.left);
        int rh=diameter(root.right);
       int d=get_ht(root.left)+get_ht(root.right)+1;
        return Math.max(d,Math.max(lh,rh));
        
    }
    int get_ht(Node root){
        if(root==null)return 0;
        return 1+Math.max(get_ht(root.left),get_ht(root.right));
    }
}
