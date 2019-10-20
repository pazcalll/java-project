package week12;

import java.util.Scanner;
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeArray bta = new BinaryTreeArray();
//        int[] data = {6,4,8,3,5,7,9,0,0,0};
        
        
        bta.idxLast = 9;
//        bta.populateData(bta.data,idxLast);
//        
//        bta.traversePreOrder(0);
//        bta.traverseInOrder(0);
//        System.out.println("");
//        bta.print();
//        System.out.println("");
        int inp=0;
        while(inp!=3){
            System.out.println("binary tree array menu");
            System.out.println("1. add");
            System.out.println("2. print");
            System.out.println("3. exit");
            System.out.println("4. traverse in order");
            System.out.println("5. traverse pre order");
            System.out.println("6. traverse post order");
            System.out.print("answer: ");
            inp = sc.nextInt();
            switch(inp){
                case 1:
                    System.out.print("enter value to add: ");
                    int val1= sc.nextInt();
                    bta.add(val1);break;
                case 2:
                    System.out.println("printing...");
                    bta.print();
                    System.out.println("");
                    break;
                case 3:
                    System.exit(0);
                    break;
                case 4:
                    bta.traverseInOrder(0);
                    System.out.println("");break;
                case 5:
                    bta.traversePreOrder(0);
                    System.out.println("");break;
                case 6:
                    bta.traversePostOrder(0);
                    System.out.println("");break;
                default:
                    break;
            }
        }
    }
}
