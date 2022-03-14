class Solution
{
    ArrayList<Integer> ans=new ArrayList<>();
	ArrayList <Integer> boundary(Node node)
	{
	    if(node!=null){
	       
	    ans.add(node.data);
	    printLeft(node.left);
	     printLeaf(node.left); 
	     printLeaf(node.right);
	 
	    printRight(node.right);
	   } return ans;
	    
	}
	public void printLeft(Node root){
	    if(root==null)return;
	    if(root.left!=null){
	        ans.add(root.data);
	        printLeft(root.left);
	    }
	    else if(root.right!=null){
	        ans.add(root.data);
	        printLeft(root.right);
	    }
	}
	public void printLeaf(Node root){
	    if(root==null)return;
	    printLeaf(root.left);
	    if(root.left==null&&root.right==null)
	    ans.add(root.data);
	    printLeaf(root.right);
	}
	public void printRight(Node root){
	    if(root==null)return;
	    if(root.right!=null){
	        printRight(root.right); ans.add(root.data);
	       
	    }
	    else if(root.left!=null){
	       printRight(root.left); ans.add(root.data);
	        
	    }
	}
}
