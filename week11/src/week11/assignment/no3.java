package week11.assignment;

import java.util.Scanner;
class Student {
    String name;
    int score;
    Student next;
    Student prev;
    Student(Student prev, String name, int score, Student next){
        this.name=name;
        this.prev=prev;
        this.score=score;
        this.next=next;
    }
}
class doubleLinkedList {
    Student head;
    int size;
    public doubleLinkedList(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(String name, int item){
        if (isEmpty())
            head = new Student(null, name, item, null);
        else{
            Student newNode= new Student(null, name, item, head);
            head.prev=newNode;
            head = newNode;
        }
        size++;
    }
    public int size(){
        return size;
    }
    public void print(){
        if (!isEmpty()) {
            Student tmp = head;
            while(tmp!=null){
                System.out.println("Student name: "+tmp.name);
                System.out.println("Student score: "+tmp.score+"\t");
                tmp = tmp.next;
            }
        }
        else{
            System.out.println("Linked list kosong");
        }
    }
    public void descending(){
        for (int i = 0; i < size-1; i++) {
            for (int j = 1; j < size-i; j++) {
                if (head.score<=head.next.score) {
                    int tmpscore = head.score;
                    String tmpname = head.name;
                    int tmpnscore = head.next.score;
                    String tmpnname = head.next.name;
                    head.score = tmpnscore;
                    head.name = tmpnname;
                    head.next.score = tmpscore;
                    head.next.name = tmpname;
                }
            }
        }
    }
}
public class no3 {
    public static void main(String[] args) {
        doubleLinkedList dll = new doubleLinkedList();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i<5){
            System.out.print("student name: ");
            String name = sc.next();
            System.out.print("student score: ");
            int score = sc.nextInt();
            dll.addFirst(name, score);i++;
            System.out.println("-------------------");
        }
        System.out.println("============================\n");
        System.out.println("print out...");
        dll.print();
        System.out.println("\nafter arranged in descending mode...");
        dll.print();
    }
}
