package review4;

public class ArrayReview {

    public static void main(String[] args) {

//        int i=10;//this an example of one variable holding one value
//
//        int[] arr=new int[3];//you car especifying here to hold 3 value within an array
//        //we store elements based on indexes
//        arr[0]=10;
//        arr[1]=11;
//        arr[2]=12;

        //access also by indexes
//        System.out.println(arr[1]);

        String[] planets={"Earth", "Mars","Jupiter","Saturn","Neptune"};
        //we stored our array with an index (ex: list of planets) instead of one number (ex: 3)

        /*
        Instead of doing repetative
        System.out.println(planets[0]);
        System.out.println(planets[1]);
        System.out.println(planets[2]);
        We can use a for loop to do the repetative
         */

        for (int j = 0; j < planets.length; j++) {

            System.out.println(planets[j]+" ");
        }


    }
}
