class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
           int size=q.size();
           for(int i=0;i<size;i++){
               Node temp=q.remove();
               ans.add(temp.data);
               if(temp.left!=null)q.add(temp.left);
               if(temp.right!=null)q.add(temp.right);
           }
        }
        return ans;
        
    }
}

