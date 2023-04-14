package review4;

public class EnhancedForLoop {

    public static void main(String[] args) {
        String[] planets={"Earth", "Mars","Jupiter","Saturn","Neptune"};
        //we stored our array with an index (ex: list of planets) instead of one number (ex: 3)

        /*
        Instead of doing repetative
        System.out.println(planets[0]);
        System.out.println(planets[1]);
        System.out.println(planets[2]);
        We can use a for loop to do the repetative
         */

        //enhanced for loop is used ONLY with arrays and collections
        for (String planet :planets){
            System.out.println(planet);
        }
    }
}
