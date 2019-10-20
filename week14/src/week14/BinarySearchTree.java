/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14;

public class BinarySearchTree {
    public Node root;
    public BinarySearchTree(){
        this.root=null;
    }
    public boolean find(int id){
        Node current = root;
        while(current!= null){
            if(current.data==id){
                return true;
            }
            else if(current.data>id){
                current = current.left;
            }
            else{
                current = current.right;
            }
        }
        return false;
    }
    public Node findNode(int id){
        Node current = root;
        while(current!= null){
            if(current.data==id){
                return current;
            }
            else if(current.data>id){
                current = current.left;
            }
            else{
                current = current.right;
            }
        }
        return current;
    }
    public void insert(int id){
        Node newNode = new Node(id);
        if (root == null) {
            root=newNode;
            return;
        }
        Node current = root;
        Node  parent = null;
        while(true){
            parent = current;
            if (id<current.data) {
                current = current.left;
                if (current==null) {
                    parent.left = newNode;
                    return;
                }
            }
            else{
                current = current.right;
                if (current==null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }
    public void display(Node root){
        if (root!=null) {
            display(root.left);
            System.out.println(" "+root.data);
            display(root.right);
        }
    }
    public boolean delete(int id){
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current.data != id){
            parent = current;
            if (current.data > id) {
                isLeftChild = true;
                current = current.left;
            }
            else{
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }
        //if reaches this row, it means node found
        //this scenario 1: if the deleted node doesnt have child
        if (current.left==null&&current.right==null) {
            if (current==root) {
                root =null;
            }
            if (isLeftChild == true) {
                parent.left = null;
            }
            else{
                parent.right = null;
            }
        }
        //this scenario 2: if the deleted node has a child
        else if(current.right == null){
            if (current == root) {
                root = current.left;
            }
            else if(isLeftChild){
                parent.left=current.left;
            }
            else{
                parent.right = current.left;
            }
        }
        else if (current.left==null) {
            if (current==root) {
                root = current.right;
            }
            else if (isLeftChild) {
                parent.left = current.right;
            }
            else{
                parent.right=current.right;
            }
        }
        //scenario 3: if the deleted node still has 3 children
        else if (current.left==null&&current.right!=null) {
            //find successor, smallest node on the right sub tree
            //from the node that will be deleted
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            }
            else if (isLeftChild) {
                parent.left = successor;
            }
            else{
                parent.right=successor;
            }
            successor.left=current.left; 
        }
        return true;
    }
    public Node getSuccessor(Node deleteNode){
        Node successor=null;
        Node successorParent=null;
        Node current = deleteNode.right;
        
        while(current != null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }
        if (successor!= deleteNode.right) {
            successorParent.left = successor.right;
            successor.right = deleteNode.right;
        }
        return successor;
    }
    public int getMax(){
        Node current = root;
        while(current.right!=null){
            current = current.right;
        }
        return current.data;
    }
    public int getMin(){
        Node current = root;
        while(current.left!=null){
            current = current.left;
        }
        return current.data;
    }
}
