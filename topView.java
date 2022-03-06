
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misba zaidi
 */
public class topView {
    static class queueNode{
        Node node;
        int ht;
        queueNode(Node x,int ht){
            node=x;
            this.ht=ht;
        }
    }
    private static void topView(Node root) {
        Queue<queueNode> q=new LinkedList<>();
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        q.add(new queueNode(root,0));
        while(!q.isEmpty()){
            Node x=q.peek().node;
            int height=q.peek().ht;
            q.remove();
            if(tm.get(height)==null)tm.put(height,x.data);
            if(x.left!=null)q.add(new queueNode(x.left,height-1));
            if(x.right!=null)q.add(new queueNode(x.right,height+1));
            
        }
        for(int x:tm.values())System.out.print(x+" ");
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
        topView(root);
    }
    
}
