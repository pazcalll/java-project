package week12;

import java.util.Scanner;
public class BinaryTreeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        
//        bt.add(6);
//        bt.add(4);
//        bt.add(8);
//        bt.add(3);
//        bt.add(5);
//        bt.add(7);
//        bt.add(9);
//        bt.add(10);
//        bt.add(15);
//        System.out.println("==============");
//        System.out.println(bt.getSuccessor(bt.root).data);
//        System.out.println("============");
//        bt.delete(6);
//        bt.big(bt.root);
//        bt.small(bt.root);
//        bt.printLeaf(bt.root);
//        System.out.println("");
//        bt.countLeaf(bt.root);
//        System.out.println("");
//        bt.countPrint();

//        bt.traversePreOrder(bt.root);
//        System.out.println("");
//        bt.traverseInOrder(bt.root);
//        System.out.println("");
//        bt.traversePostOrder(bt.root);
//        System.out.println("");
//        System.out.println("Find "+bt.find(5));
//        bt.delete(8);
//        bt.traversePreOrder(bt.root);
//        System.out.println("");
        System.out.println("welcome to binary tree app");
        int inp=0;
        while(inp!=8){
            System.out.println("Menu list:");
            System.out.println("1. add");
            System.out.println("2. ddelete");
            System.out.println("3. find");
            System.out.println("4. traverse in order");
            System.out.println("5. traverse pre order");
            System.out.println("6. traverse post order");
            System.out.println("7. exit");
            System.out.print("input menu number: ");
            inp = sc.nextInt();
            switch(inp){
                case 1: 
                    System.out.print("input add: ");
                    int add = sc.nextInt();
                    bt.add(add);
                    break;
                case 2:
                    System.out.print("number to delete: ");
                    int del = sc.nextInt();
                    bt.delete(del);
                    break;
                case 3:
                    System.out.print("input number to find: " );
                    int find = sc.nextInt();
                    System.out.println("in the tree?? "+bt.find(find));
                    break;
                case 4:
                    System.out.println("traverse in order:");
                    bt.traverseInOrder(bt.root);
                    break;
                case 5:
                    System.out.println("traverse pre order:");
                    bt.traversePreOrder(bt.root);
                    break;
                case 6:
                    System.out.println("traverse post order:");
                    bt.traversePostOrder(bt.root);
                    break;
                case 7:
                    System.out.println("exiting..");
                    System.exit(0);
                    break;
                default:System.exit(0);
            }
        }
    }
}