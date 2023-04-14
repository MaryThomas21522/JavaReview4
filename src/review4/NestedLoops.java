package review4;

public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 0; i <=3 ; i++) {//will loop 3 times
            //i is outer loop
            //outer loop controls the amount of complete iteration of

            System.out.println(i);

            for (int j = 0; j <=1; j++) {
                //j is the inner loop
                //inner loop ALWAYS depends on outer loop

                System.out.println(j);
            }
        }
    }
}
