 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.Scanner;
public class doubleLinkedListMain {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        doubleLinkedList dll = new doubleLinkedList();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("================================");
        dll.clear();
        dll.print();
        System.out.println("Size : "+dll.size());
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("================================");
        dll.removeFirst();
        dll.print();
        System.out.println("size : "+ dll.size());
        System.out.println("================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("================================");
        System.out.println("data at the begining of the linked list is : "+dll.getFirst());
        System.out.println("data at the end of the linked list is : "+dll.getLast());
        System.out.println("data taken from method get(int index) is : "+dll.get(0));
        
        
//        int answer = 0;
//        while(answer!=10){
//            System.out.println("DOUBLE LINKED LIST MENU");
//            System.out.println("=======================");
//            System.out.println("choose menu");
//            System.out.println("1. Add first");
//            System.out.println("2. Add last");
//            System.out.println("3. Add data by index");
//            System.out.println("4. Remove first");
//            System.out.println("5. Remove last");
//            System.out.println("6. Remove by index");
//            System.out.println("7. Print data");
//            System.out.println("8. Search");
//            System.out.println("9. Sorting");
//            System.out.println("10. Exit");
//            System.out.println("========================");
//            System.out.print(">> ");
//            answer = sc.nextInt();
//            System.out.println("========================");
//            switch(answer){
//                case 1:
//                    System.out.print("input data: ");
//                    int case1 = sc.nextInt();
//                    dll.addFirst(case1);break;
//                case 2:
//                    System.out.print("input data: ");
//                    int case2 = sc.nextInt();
//                    dll.addLast(case2);break;
//                case 3:
//                    System.out.print("input data: ");
//                    int case3 = sc.nextInt();
//                    System.out.print("input index: ");
//                    int index = sc.nextInt();
//                    dll.add(case3, index);break;
//                case 4:
//                    System.out.println("removed data: "+dll.getFirst());
//                    dll.removeFirst();break;
//                case 5:
//                    System.out.println("removed data: "+dll.getLast());
//                    dll.removeLast();break;
//                case 6:
//                    System.out.print("input index: ");
//                    index = sc.nextInt();
//                    dll.remove(index);break;
//                case 7: dll.print();break;
//                case 8:
//                    System.out.print("input to find: ");
//                    int case8 = sc.nextInt();
//                    dll.search(case8);break;
//                case 9:
//                    System.out.println("sorting...");
//                    dll.sorting();break;
//            }
//        }
    }
}
