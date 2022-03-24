class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	Stack<Node> st=new Stack<>();
	Node prev=null,next=null,head=null;
	Node t=root;
     while(true){
         if(t!=null){
             st.push(t);
             t=t.left;
         }
        else{
            if(st.isEmpty())break;
            t=st.pop();
            if(prev==null){
                head=new Node(t.data);
                prev=head;
                next=head;
            }
                else{
                    next.right=new Node(t.data);
                    next=next.right;
                    next.left=prev;
                    prev=next;
                }
                t=t.right;
            
        }
     }
     return head;
    }
}
