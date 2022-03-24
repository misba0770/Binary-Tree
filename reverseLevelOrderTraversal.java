class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
       Queue<Node> q=new LinkedList<>();
       Stack<Node> st=new Stack<>();
       q.add(node);
       while(!q.isEmpty()){
           int size=q.size();
           for(int i=0;i<size;i++){
               Node temp=q.remove();
               st.push(temp);
               
               if(temp.right!=null)q.add(temp.right);if(temp.left!=null)q.add(temp.left);
       }
       
    }
    while(!st.isEmpty()){
        Node x=st.pop();
        ans.add(x.data);
    }
    return ans;
}  
}
