package review3;

public class DoWhile {

    public static void main(String[] args) {

        int a=5;
        //int a=10;
            /*The output will print forever since a is greater than 6.
            It will need a - - to set limit execution
             */

        do{//will execute the code once
            System.out.println("Bye");
            a--;
        }while (a>6);//this is false so it will only print out "Bye" once

//        System.out.println("----------------");
//
//        int b=4;
//
//        while (b>6){//while will look at condition before execution
//            System.out.println("Bye");
//        }

    }
}
