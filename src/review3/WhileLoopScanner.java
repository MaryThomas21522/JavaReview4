package review3;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {

        /*
        You need to ask user to enter numbers 1 by 1
        until user enter non integer value - then loop should stop

        Inside loop we need to calculate the sum of all entered numbers

         */

        Scanner scan=new Scanner(System.in);//keyboard is enable for user to type answer
        int sum=0;//starts this variable to 0
        System.out.println("Please enter integer values");//will print first for user to enter an integer

        while(scan.hasNextInt()) {//the condition says it will scan what the user input
            int num = scan.nextInt();
            sum += num;//will add the number inputted and will repeat the block of code until user inputs non integer
        }
        System.out.println("Sum ="+sum);
    }
}
