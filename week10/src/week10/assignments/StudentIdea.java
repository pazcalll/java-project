package week10.assignments;

import java.util.Scanner;
public class StudentIdea {
    Student head;
    int size;
        public boolean isEmpty(){
            return head==null;
        }
        void addLast(String name, int id){
            Student baru = new Student(name, id);
            if (isEmpty()) {
                head = baru;
            }else{
                Student tmp = head;
                while(tmp.next!=null){
                    tmp = tmp.next;
                }
                tmp.next = baru;
            }
            size++;
        }
        void removeLast(){
            if (!isEmpty()) {
                if (head.next==null)
                    removeFirst();
                else{
                    Student tmp = head;
                    while(tmp.next.next!=null){
                        tmp = tmp.next;
                    }
                    System.out.println("removed data: ");
                    System.out.println(tmp.next.name+"\n"+tmp.next.id);
                    tmp.next = null;
                }
            }
            else{
                System.out.println("List is empty!");
            }
        }
        void removeFirst(){
            if(!isEmpty()){
                Student tmp = head;
                head = tmp.next;
                System.out.print("removed data: ");
                System.out.println(head.name+"\n"+head.id);
                tmp=null;
            }else{
                System.out.println("List is empty!");
            }
        }
        void clear(){
            head = null;
            size = 0;
        }
        void print(){
            Student tmp = head;
            while(tmp!=null){
                System.out.println("\nStudent name = "+ tmp.name);
                System.out.println("Student id = "+ tmp.id);
                tmp = tmp.next;
            }
            System.out.println("--------------------");
        }
    }
