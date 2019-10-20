/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

public class Node {
    int data;
    Node next;
    Node prev;
    Node(Node prev, int data, Node next){
        this.prev=prev;
        this.data=data;
        this.next=next;
    }
}
