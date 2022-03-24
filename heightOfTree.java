class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
     return getht(node);
    }
    int getht(Node root){
        if(root==null)return 0;
        return 1+Math.max(getht(root.left),getht(root.right));
    }
}
