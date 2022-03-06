
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
public class zigZagTraversal {
 static class Node{
     Node left;
     Node right;
     int data;
     Node(int data){
         this.data=data;
         left=right=null;
     }
 }
     static void zigZag(Node root){
        Stack<Node> st1=new Stack<>();
        Stack<Node> st2=new Stack<>();
       st1.push(root);
       while(!st1.isEmpty()||!st2.isEmpty()){
       while(!st1.isEmpty()){
           Node temp=st1.pop();
           System.out.print(temp.data+" ");
           if(temp.left!=null)st2.push(temp.left);
           if(temp.right!=null)st2.push(temp.right);
       }
       while(!st2.isEmpty()){
           Node temp=st2.pop();
           System.out.print(temp.data+" ");
          
           if(temp.right!=null)st1.push(temp.right); 
           if(temp.left!=null)st1.push(temp.left);
       }
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
        zigZag(root);
       
    }
    
}
