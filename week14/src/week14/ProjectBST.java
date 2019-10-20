/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14;

import java.util.Scanner;
public class ProjectBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree b= new BinarySearchTree();
        b.insert(3);b.insert(8);
        b.insert(1);b.insert(4);b.insert(6);b.insert(10);b.insert(9);
        b.insert(20);b.insert(25);b.insert(15);b.insert(16);
        
//        System.out.println("Cek apakah ada node 4 : " + b.find(4));
//        System.out.println("Cek apakah ada node 99 : "+ b.find(99));
//        
//        System.out.println("Cetak tree dengan metodde in order: ");
//        b.display(b.root);
//        System.out.println();
//        
//        System.out.println("Hapus node tanpa child(2) : "+ b.delete(2));
//        b.display(b.root);
//        System.out.println("\nHapus node dengan satu child(4) : "+b.delete(4));
//        b.display(b.root);
//        System.out.println("\nHapus node dgn dua child (10) : "+b.delete(10));
//        b.display(b.root);
        
//        System.out.println();
//        System.out.println("max value: "+ b.getMax());
//        System.out.println("min value: "+ b.getMin());
        
        int answer = 0;
        System.out.println("WELCOME TO BST!!!");
        while(answer != 5){
            System.out.println("choose menu: ");
            System.out.println("1. insert");
            System.out.println("2. delete");
            System.out.println("3. find");
            System.out.println("4. display");
            System.out.println("5. exit");
            System.out.print("answer: ");
            answer = sc.nextInt();
            switch(answer){
                case 1:
                    System.out.print("insert your number: ");
                    int case1 = sc.nextInt();
                    b.insert(case1);break;
                case 2:
                    System.out.print("delete number: ");
                    int case2 = sc.nextInt();
                    b.delete(case2);break;
                case 3:
                    System.out.print("find number: ");
                    int case3= sc.nextInt();
                    System.out.println(b.find(case3));break;
                case 4:
                    System.out.println("displaying...");
                    b.display(b.root);break;
                default:
                    System.out.println("exiting...");
                    break;
            }
        }
    }
}
