package io.java.tree;


public class TreeNode {

    private int key;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int key) {
        this.key = key;
        left = null; right = null;
    }

    public int getKey() {
        return key;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
