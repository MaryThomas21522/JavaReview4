package review4;

public class ContinueKeyword {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) { //run our loop 5 times bc i<5;

            if(i==3){//this will not print out 3 bc if i = 3
                continue;
            }
            System.out.println(i);
            System.out.println("Hi");
            System.out.println("Bye");

        }
    }
}
