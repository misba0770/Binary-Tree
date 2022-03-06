/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misba zaidi
 */
public class rightView {
static int max=0;
    private static void right(Node root,int level) {
          if(root==null)return;
        if(level>=max){
            System.out.print(root.data+" ");
            max++;
        }
        right(root.right,level+1);
        right(root.left,level+1);
    }

    static class Node{
       Node left;
       Node right;
       int data;
       Node(int x){
           data=x;
           left=right=null;
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
        right(root,0);
    }
    
}
