package week10.assignments;

import java.util.Scanner;
public class StudentIdeaMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        StudentIdea si = new StudentIdea();
        System.out.println("implementing Stack(unlimited) rules\n");
        int ans;
        do{
            System.out.println("menu:");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. clear");
            System.out.println("4. print");
            System.out.println("5. exit");
            System.out.print("answer: ");
            ans = sc.nextInt();
            switch(ans){
                case 1: 
                    System.out.println("=====================");
                    System.out.print("input student's name: ");
                    String name = sc.next();
                    System.out.print("input student's id: ");
                    int id = sc.nextInt();
                    si.addLast(name, id);break;
                case 2:
                    System.out.println("popping...");
                    si.removeLast();break;
                case 3:
                    System.out.println("clearing...");
                    si.clear();break;
                case 4:
                    System.out.println("printing...");
                    si.print();break;
                case 5:
                    System.out.println("exiting...");
            }
        }while(ans!=5);
    }
}
