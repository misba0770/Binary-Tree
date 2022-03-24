class Solution
{
    boolean isLeafNode(Node root){
        if(root.left==null&&root.right==null)return true;
        return false;
    }
	boolean isSumTree(Node root)
	{
           if(root==null||isLeafNode(root))return true;
           
        int leftSum=0,rightSum=0;
        if(isSumTree(root.left)&&isSumTree(root.right)){
        if(root.left==null)leftSum=0;
        else if(isLeafNode(root.left))leftSum=root.left.data;
        else{
            leftSum=2*root.left.data;
        }
        
        if(root.right==null)rightSum=0;
        else if(isLeafNode(root.right))rightSum=root.right.data;
        else rightSum=2*root.right.data;
        
        if(root.data==leftSum+rightSum)return true;
        else return false;
        }
        return false;
	}
}
