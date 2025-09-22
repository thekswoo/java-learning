package week3;//package practice_3week;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your message.");
        System.out.println("q: quit the program.");
        while(true){
            System.out.print("> ");
            String msg = scanner.nextLine();
            System.out.println(msg);
            if(msg.equals("q")){
                System.out.println();
                System.out.print("Bye!");
                break;
            }
        }

        //use do while
    }
}
