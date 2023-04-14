package review4;

import java.util.Scanner;

public class ArrayAndScanner {

    public static void main(String[] args) {
        /*
        create an array that stores numbers from a user and then we want
        to calculate the average of numbers
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("How many integers do you want to store?");
        int size=scan.nextInt();
        int[] numbers=new int[size];//this is an array
        //the codes above is for the scanner - what the user inputs

        //we now have to create a loop based on the input from user
        for(int i=0; i< numbers.length; i++){

            System.out.println("Please enter "+(i+1)+" element");
            numbers[i]=scan.nextInt();
        }
        //to calculate the average of numbers




    }
}
