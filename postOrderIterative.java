
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
public class postOrderIterative {

    private static void postOrder(Node root) {
        if(root==null)return;
        Stack<Node> st=new Stack<>();
        Stack<Integer> ans=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node x=st.pop();
            ans.push(x.data);
           
            if(x.left!=null)st.push(x.left); 
            if(x.right!=null)st.push(x.right);
        }
        while(!ans.isEmpty()){
            int a=ans.pop();
            System.out.print(a+" ");
        }
    }

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
        postOrder(root);
        
    }
    
}
