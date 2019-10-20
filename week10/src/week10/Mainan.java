/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;
import java.util.Scanner;

public class Mainan {
    Scanner sc = new Scanner(System.in);
    SinglyLinkedList sll = new SinglyLinkedList();
    void add(){
        System.out.println("submenu: ");
        System.out.println("1. addfirst");
        System.out.println("2. addlast");
        System.out.println("3. add by position(index)");
        System.out.println("4. add by key");
        System.out.print("answer: ");
        int submenu = sc.nextInt();
        switch(submenu){
            case 1 : 
                System.out.print("input number : ");
                int inp = sc.nextInt();
                sll.addFirst(inp);break;
            case 2 :
                System.out.print("input number : ");
                int inp1 = sc.nextInt();
                sll.addLast(inp1);break;
            case 3 :
                System.out.print("input data position : ");
                int idx = sc.nextInt();
                System.out.print("input key : ");
                int inp3 = sc.nextInt();
                sll.add(idx, inp3);break;
            case 4 :
                System.out.print("input listed data : ");
                int inp4 = sc.nextInt();
                System.out.print("input key : ");
                int inp5 = sc.nextInt();break;
        }
    }
    void remove(){
        System.out.println("submenu: ");
        System.out.println("1. removefirst");
        System.out.println("2. removelast");
        System.out.println("3. remove by position(index)");
        System.out.println("4. clear");
        System.out.print("answer: ");
        int answer = sc.nextInt();
        switch(answer){
            case 1 : sll.removeFirst();break;
            case 2 : sll.removeLast();break;
            case 3 : 
                System.out.print("input index : ");
                int idx = sc.nextInt();
                sll.remove(idx);break;
            case 4 : sll.clear();break;
        }
    }
    void get(){
        System.out.println("submenu: ");
        System.out.println("1. getfirst");
        System.out.println("2. getlast");
        System.out.println("3. get by position(index)");
        System.out.print("answer: ");
        int answer = sc.nextInt();
        switch(answer){
            case 1 : try{sll.getFirst();}catch(Exception e){}break;
            case 2 : try{sll.getLast();}catch(Exception e){}break;
            case 3 : 
                System.out.print("input index: ");
                int idx = sc.nextInt();
                try{sll.get(idx);}catch(Exception e){}break;
        }
    }
    void exit(){
        System.exit(0);
    }
}
