package io.java.ds.binarytree;

class Node{
    int data;
    Node left,right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    Node root;


    public BinaryTree() {
    }


    public void printLevelOrder(){

    }

    public int getHeight(Node root){

        return 0;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);
    }
}
