package week10;
import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Mainan mn = new Mainan();
        SinglyLinkedList sll = new SinglyLinkedList();
        try{
            System.out.println(sll.isEmpty());
//            sll.addFirst(45);
//            sll.addFirst(34);
//            sll.addFirst(4);
            sll.addLast(100);
            sll.addLast(0);
            sll.addLast(54);
//            sll.add(101, 3);
//            sll.add(23, 3);
//            sll.add(314, 3);
            sll.print();
//            sll.remove(1);
//            sll.removeFirst();
//            sll.print();
//            sll.removeLast();
//            sll.print();
//            sll.add(6,45);
            sll.print();
                System.out.println("data at index 3 is "+sll.get(5));
        }catch(Exception ex){
                System.out.println(ex.getMessage());
        }
//        System.out.println("Menu: ");
//        System.out.println("1. Add");
//        System.out.println("2. Remove");
//        System.out.println("3. Get");
//        System.out.println("4. Exit");
//        System.out.print("answer: ");
//        int answer = sc.nextInt();
//        switch(answer){
//            case 1: mn.add();break;
//            case 2: mn.remove();break;
//            case 3: mn.get();break;
//            case 4: mn.exit();break;
//        }
//        mn.sll.print();
    }
}