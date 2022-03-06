
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misba zaidi
 */
public class  inorderIterative{

    private static void inorderIterative(Node curr) {
        Stack<Node> st=new Stack<>();
        Node root=curr;
        while(!st.isEmpty()||root!=null){
            if(root!=null){
               st.push(root);
               root=root.left;
            }
            else{
                root=st.pop();
                System.out.print(root.data+" ");
                root=root.right;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    static class Node
{
    int data;
    Node left, right;
 
    // Function to create a new binary tree node having a given key
    public Node(int key)
    {
        data = key;
        left = right = null;
    }
}
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
 
        inorderIterative(root);
    }
    
}
